package proyecto_d_turismo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Stack;
import java.util.ArrayList;
/*Uso de bits LUGAR
    Codigo 5 caracteres = 10 bits
    Nombre 10 caracteres = 20 bits
    Ciudad 10 caractetes = 20 bits
    Pais 10 caracteres = 20 bits
    Wifi 1 bits booleano
    PetFriendly 1 bits booleano
    Direccion 30 caracteres = 60 bits
    Precio 4 caracteres/ double = 32 bits
    Capacidad 1 numero = 4 bits
    Total = 174 bits
*/
public class ALMACENAMIENTO_DATOS {
    private File file;
    private int CodigoLugar ;
    public ALMACENAMIENTO_DATOS(File A){
        file=A;
        this.CodigoLugar = 0;
    }
    // GENERAR EL CODIGO DE LUGAR Y CLIENTE
    public String CalcularCodigoLU(){
        CodigoLugar++;
        if (CodigoLugar >= 0){
            return "LG00" + CodigoLugar;
        }
        else if (CodigoLugar >= 10){
            return "LG0" + CodigoLugar; 
        }
        else if (CodigoLugar >= 100){
            return "LG" + CodigoLugar; 
        }
        return "";
    }
    //ya
    public void Ingresar_Lugar(String nombre, String ciudad,String pais, Boolean wifi,Boolean pet,String direccion,Double precio, int capacidad )
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(!Existe(nombre)){
                RAC.seek(RAC.length());
                RAC.writeChars(CalcularCodigoLU());
                RAC.writeChars(nombre);
                RAC.writeChars(ciudad);
                RAC.writeChars(pais);
                RAC.writeBoolean(wifi);
                RAC.writeBoolean(pet);
                RAC.writeChars(direccion);
                RAC.writeDouble(precio);
                RAC.writeInt(capacidad);
                RAC.writeChars("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("GUARDADO CON EXITO");
            }
        }
        catch(IOException e)
        {        
        }
    }
    //ya
     public long BuscarPunteroAtributo(String AT,String Codigo){
        AT=AT.toUpperCase();
        long AP=BuscarPuntero(Codigo);
        //System.out.println("Puntero inicial en "+BuscarPuntero(Codigo));
        return switch (AT) {
            case "CODIGO"    -> AP+0;
            case "NOMBRE"    -> AP+10;
            case "CIUDAD"    -> AP+10+20;
            case "PAIS"      -> AP+10+20+20;
            case "WIFI"      -> AP+10+20+20+20;
            case "PEYF"      -> AP+10+20+20+20+1;
            case "DIRECCION" -> AP+10+20+20+20+1+1;
            case "PRECIO"       -> AP+10+20+20+20+1+1+60;
            case "CAPACIDAD"    -> AP+10+20+20+20+1+1+60+32;   
            case "DI"           -> AP+10+20+20+20+1+1+60+32+4;
            default -> -1;
        };
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
                RAC.skipBytes((int)BytesHasta("NOMBRE"));
                String Nombre ="";
                for(int i =0;i<CharsDe("NOMBRE");i++)
                {
                    Nombre=Nombre+RAC.readChar();
                }
                //System.out.println(Nombre+"**"+NB);
                if(!Nombre.equals(NB))
                {
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe("NOMBRE"));
                }
                else
                {
                    Puntero=RAC.getFilePointer()-62;
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
    //Ya
    public long CharsDe(String AT)
    {
        AT=AT.toUpperCase();
        return switch (AT) {
            case "CODIGO" -> 5;
            case "NOMBRE" -> 10;
            case "CIUDAD" -> 10;
            case "PAIS" -> 10;
            case "WIFI" -> 1;
            case "PETF" -> 1;
            case "DIRECCION"->30;
            case "PRECIO"->1;
            case "CAPACIDAD" -> 1;
            case "DI"        ->50;
            default -> -1;
        };
    }
    //YA
    public long BytesDe(String AT)
    {
        AT=AT.toUpperCase();
        return switch (AT) {
            case "CODIGO" -> 10;
            case "NOMBRE" -> 20;
            case "CIUDAD" -> 20;
            case "PAIS" -> 20;
            case "WIFI" -> 1;
            case "PETF" -> 1;
            case "PRECIO" -> 60;
            case "DIRECCION" -> 32;
            case "CAPACIDAD"-> 4;
            case "DI"->100;
            default -> -1;
        };
    }
    //YA
    public long BytesHasta(String AT) {
        AT = AT.toUpperCase();
        long bytesHasta = -1;
        switch (AT) {
            case "CODIGO":
                bytesHasta = 0;
                break;
            case "NOMBRE":
                bytesHasta = 10;
                break;
            case "CIUDAD":
                bytesHasta = 10 + 20;
                break;
            case "PAIS":
                bytesHasta = 10 + 20 + 20;
                break;
            case "WIFI":
                bytesHasta = 10 + 20 + 20 + 20;
                break;
            case "PETF":
                bytesHasta = 10 + 20 + 20 + 30 + 1;
                break;
            case "DIRECCION":
                bytesHasta = 10 + 20 + 20 + 20 + 1 + 1;
                break;
            case "PRECIO":
                bytesHasta = 10 + 20 + 20 + 20 + 1 + 1 + 60;
                break;
            case "CAPACIDAD":
                bytesHasta = 10 + 20 + 20 + 20 + 1 + 1 + 60 + 32;
                break;    
            case "DI":
                bytesHasta = 10 + 20 + 20 + 20 + 1 + 1 + 60 + 32 + 4;
                break;
            default:
                bytesHasta = -1;
                break;
        }
        System.out.println("Salte "+bytesHasta+" bytes");
        return bytesHasta;
    }
    //YA
    public long BytesHastaFinalPartiendoDe(String at) {
        long aux = 168;
        at.toUpperCase();
        switch (at) {
            case "CODIGO":
                aux -= 12;
                break;
            case "NOMBRE":
                aux -= (10 + 20);
                break;
            case "CIUDAD":
                aux -= (10 + 20 + 20);
                break;
            case "PAIS":
                aux -= (10 + 20 + 20 + 20);
                break;
            case "WIFI":
                aux -= (10 + 20 + 20 + 20 + 1);
                break;
            case "PETF":
                aux -= (10 + 20 + 20 + 20 + 1 + 1);
                break;
            case "DIRECCION":
                aux -= (10 + 20 + 20 + 20 + 1 + 1 + 60);
                break;
            case "PRESIO":
                aux -= (10 + 20 + 20 + 20 + 1 + 1 + 60 + 32);
                break;
            case "CAPACIDAD":
                aux -= (10 + 20 + 20 + 20 + 1 + 1 + 60 + 32 + 4);
                break;
            case "DI":
                aux -= (10 + 20 + 20 + 20 + 1 + 1 + 60 + 32 + 4 + 100);
                break;
            default:
                break;
        }
        System.out.println("salto de "+aux+" bytes");
        return aux;
    }
    
    public boolean Existe(String NB)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            //System.out.println("Buscando si existe");
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta("NOMBRE"));
                String Nombre ="";
                for(int i =0;i<CharsDe("NOMBRE");i++)
                {
                    Nombre=Nombre+RAC.readChar();
                    System.out.println(i+"  "+Nombre);
                }
                System.out.println(Nombre+" "+NB);
                if(!Nombre.equals(NB))
                {
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe("NOMBRE"));
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
    public Stack getListadoLugares()
    {
        Object[] Lugares =new Object[10];
        Stack<Object[]> listado = new Stack<Object[]>(); 
        try(RandomAccessFile RAC =new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                String Cod="";
                String Nom ="";
                String Ciu="";
                String Pais="";
                Boolean Wifi = false;
                Boolean Petf = false;
                String Dic = "";
                double Prec = 0;
                String img="";
                int Capacidad = 0;
                for(int i =0;i<CharsDe("CODIGO");i++)
                {
                    char Lectura;
                    Lectura = RAC.readChar();
                    if ('-' != Lectura){
                        Cod+=Lectura;
                    }
                }
                Lugares[0] = Cod;
                for(int i =0;i<CharsDe("NOMBRE");i++)
                {
                    char Lectura;
                    Lectura = RAC.readChar();
                    if ('-' != Lectura){
                        Nom+=Lectura;
                    }
                }
                Lugares[1]=Nom;
                for(int i =0;i<CharsDe("CIUDAD");i++)
                {
                    char Lectura;
                    Lectura = RAC.readChar();
                    if ('-' != Lectura){
                        Ciu+=Lectura;
                    }
                }
                Lugares[2] = Ciu;
                for(int i =0;i<CharsDe("PAIS");i++)
                {
                    char Lectura;
                    Lectura = RAC.readChar();
                    if ('-' != Lectura){
                        Pais+=Lectura;
                    }
                }
                Lugares[3]=Pais;
                Wifi = RAC.readBoolean();
                Lugares[4] = Wifi;
                Petf = RAC.readBoolean();
                Lugares[5]=Petf;
                for(int i =0;i<CharsDe("DIRECCION");i++)
                {
                    char Lectura;
                    Lectura = RAC.readChar();
                    if ('-' != Lectura){
                        Dic+=Lectura;
                    }
                }
                Lugares[6] = Dic;
                Prec = RAC.readDouble();
                Lugares[7]=Prec;
                Capacidad = RAC.readInt();
                Lugares[8] = Capacidad;
                for(int i =0;i<CharsDe("DI");i++)
                {
                    char Lectura;
                    Lectura = RAC.readChar();
                    if ('-' != Lectura){
                        img=img+Lectura;
                    }
                }
                Lugares[9]= img;
                listado.push(Lugares);
            }
            RAC.close();         
            System.out.println("Guardado Correctamene");
        }
        catch(IOException e)
        {
        }
        return listado;
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
}