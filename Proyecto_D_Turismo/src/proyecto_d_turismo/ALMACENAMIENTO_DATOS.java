package proyecto_d_turismo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/*Uso de bits LUGAR
    Codigo 5 caracteres = 10 bits
    Nombre 10 caracteres = 20 bits
    Ciudad 10 caractetes = 20 bits
    Pais 10 caracteres = 20 bits
    Wifi 2 caracteres = 4 bits
    PetFriendly 2 caracteres = 4 bits
    Direccion 30 caracteres = 60 bits
    Precio 4 caracteres/ double = 32 bits
    Capacidad 1 numero = 4 bits
    Total = 174 bits
*/
public class ALMACENAMIENTO_DATOS {
    private File file;
    private int CodigoLugar ;
    public ALMACENAMIENTO_DATOS(File A)
    {
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
    public void Ingresar_Lugar(String nombre, String ciudad,String pais, Boolean wifi,Boolean pet,String direccion,Double precio, int capacidad )
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(!Existe_CL(nombre))
            {
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
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
     public long BuscarPunteroAtributo(String AT,String Codigo)
    {
        AT=AT.toUpperCase();
        long AP=BuscarPuntero(Codigo);
        //System.out.println("Puntero inicial en "+BuscarPuntero(Codigo));
        return switch (AT) {
            case "CODIGO"    -> AP+0;
            case "CATEGORIA" -> AP+12;
            case "NOMBRE"    -> AP+12+20;
            case "FABRICANTE"-> AP+12+20+30;
            case "CANTIDAD"  -> AP+12+20+30+30;
            case "PRECIO"    -> AP+12+20+30+30+4;
            case "FE"        -> AP+12+20+30+30+4+8;
            case "FA"        -> AP+12+20+30+30+4+8+16;
            case "DESCRIPCION"-> AP+12+20+30+30+4+8+16+16;
            case "DI"         -> AP+12+20+30+30+4+8+16+16+100;
            default -> -1;
        };
    }
}
