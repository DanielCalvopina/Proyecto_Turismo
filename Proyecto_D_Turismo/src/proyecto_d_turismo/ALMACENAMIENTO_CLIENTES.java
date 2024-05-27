
package proyecto_d_turismo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ALMACENAMIENTO_CLIENTES {
    
    private File file;
    /*Uso de bits CLIENTE
    Cedula 13 caracteres = 26 bytes
    Nombre 15 caracteres = 30 bytes
    Apellido 15 caractetes = 30 bytes
    Direccion 30 caracteres = 60 bytes 
    Contraseña 8 caracteres = 16 bytes
    Total = 162 bytes*/
    
    public ALMACENAMIENTO_CLIENTES (File a){
        file = a;
    }
    public void Ingresar_Cliente(String cedula, String nombre,String apellido,String direccion, String Contrasena )
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(!Existe(cedula))
            {
                RAC.seek(RAC.length());
                RAC.writeChars(cedula);
                RAC.writeChars(nombre);
                RAC.writeChars(apellido);
                RAC.writeChars(direccion);
                RAC.writeChars(Contrasena);
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
    public void Borrar()
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.setLength(0);
        }
        catch(IOException e)
        {
            
        }
    }
    public String get(String Cedula,String Atributo)
    {
        //System.out.println("Buscado "+Atributo);
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(Existe(Cedula))
            {
                RAC.seek(BuscarPunteroAtributo(Atributo,Cedula)); 
                //System.out.println(BuscarPunteroAtributo(Atributo,Nombre));
                //System.out.println(BuscarPunteroAtributo(Atributo,Nombre)+"puntero");
                switch(Atributo)
                {
                    case "NOMBRE" -> {
                        System.out.println("x");
                        return ""+RAC.readInt();
                    }
                    case "APELLIDO" -> {
                        return ""+RAC.readDouble();
                    }
                    case "DIRECCION", "CONTRASENA" -> {
                        String aux="";
                        for(int i=0;i<CharsDe(Atributo);i++)
                        {
                            System.out.println("x");
                            aux=aux+RAC.readChar();
                        }
                        RAC.close();
                        return aux;
                    }
                    default -> {
                        RAC.close();
                        return "null";
                    }
                }
                   
            }
            RAC.close();
            System.out.println("Fuera");
            return "null";
        }
        catch(IOException e)
        {
            System.out.println("IOE");
            return "IOException";
        }
    }
    public boolean Existe(String NB)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            //System.out.println("Buscando si existe");
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta("CEDULA"));
                String cedula ="";
                for(int i =0;i<CharsDe("CEDULA");i++)
                {
                    cedula=cedula+RAC.readChar();
                    System.out.println(i+"  "+cedula);
                }
                System.out.println(cedula+" "+NB);
                if(!cedula.equals(NB))
                {
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe("CEDULA"));
                }
                else
                {
                    RAC.close();
                    System.out.println("Existe");
                    return true;
                }
            }
            RAC.close();
            System.out.println("No existe");
            return false;
        }
        catch(IOException e)
        {
            return false;
        }
    }
    public long BytesHasta(String AT) {
        AT = AT.toUpperCase();
        long bytesHasta = -1;
        switch (AT) {
            case "CEDULA":
                bytesHasta = 0;
                break;
            case "NOMBRE":
                bytesHasta = 26 ;
                break;
            case "APELLIDO":
                bytesHasta = 26 + 30;
                break;
            case "DIRECCION":
                bytesHasta = 26 + 30 + 30;
                break;
            case "CONTRASENA":
                bytesHasta = 26 + 30 + 30 + 16;
                break;
            default:
                bytesHasta = -1;
                break;
        }
        System.out.println("Salte "+bytesHasta+" bytes");
        return bytesHasta;
    }

    public long BytesHastaFinalPartiendoDe(String at) {
        long aux = 162;
        at.toUpperCase();
        switch (at) {
            case "CEDULA":
                aux -= 26;
                break;
            case "NOMBRE":
                aux -= (26 + 30);
                break;
            case "APELLIDO":
                aux -= (26 + 30 + 30);
                break;
            case "DIRECCION":
                aux -= (26 + 30 + 30 + 60);
                break;
            case "CONTRASENA":
                aux -= (26 + 30 + 30 + 60 + 16);
                break;
            default:
                break;
        }
        System.out.println("salto de "+aux+" bytes");
        return aux;
    }

    public long BytesDe(String AT)
    {
        AT=AT.toUpperCase();
        return switch (AT) {
            case "CEDULA" -> 26;
            case "NOMBRE" -> 30;
            case "APELLIDO" -> 30;
            case "DIRECCION" -> 60;
            case "CONTRASENA" -> 16;
            default -> -1;
        };
    }
    public long CharsDe(String AT)
    {
        AT=AT.toUpperCase();
        return switch (AT) {
            case "CEDULA" -> 13;
            case "NOMBRE" -> 15;
            case "APELLIDO" -> 15;
            case "DIRECCION" -> 30;
            case "CONTRASENA" -> 8;
            default -> -1;
        };
    }
    public long BuscarPunteroAtributo(String AT,String Codigo)
    {
        AT=AT.toUpperCase();
        long AP=BuscarPuntero(Codigo);
        //System.out.println("Puntero inicial en "+BuscarPuntero(Codigo));
        return switch (AT) {
            case "CEDULA"    -> AP+0;
            case "NOMBRE" -> AP+26;
            case "APELLIDO"    -> AP+26+30;
            case "DIRECCION"-> AP+26+30+30;
            case "CONTRASENA"  -> AP+26+30+30+60;
            default -> -1;
        };
    }
    public void Cambiar(String Cedula,String Atributo,String Nuevo)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(BuscarPunteroAtributo(Atributo,Cedula));
            RAC.writeChars(Nuevo);
            RAC.close();
        }
        catch(IOException e)
        {
        
        }
    }
    public long BuscarPuntero(String NB)
    {
        long Puntero=-1;
                    //System.out.println("\n\nBuscando el puntero inicial del registro");
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta("CEDULA"));
                String cedula ="";
                for(int i =0;i<CharsDe("CEDULA");i++)
                {
                    cedula=cedula+RAC.readChar();
                }
                //System.out.println(Nombre+"**"+NB);
                if(!cedula.equals(NB))
                {
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe("CEDULA"));
                }
                else
                {
                    Puntero=RAC.getFilePointer()-26;
                    RAC.close();
                    return Puntero;
                }
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
        return Puntero;
    }
}
