
package proyecto_d_turismo;

import java.io.File;

public class ALMACENAMIENTO_CLIENTES {
    private File file;
    private int CodigoCliente;
    /*Uso de bits CLIENTE
    Codigo 5 caracteres = 10 bits
    Cedula 12 caracteres = 24 bits
    Nombre 15 caracteres = 30 bits
    Apellido 15 caractetes = 30 bits
    Direccion 30 caracteres = 60 bits
    Total = 154 bits
    */
    public String CalcularCodigoCL(){
        CodigoCliente++;
        if (CodigoCliente >= 0){
            return "CL00" + CodigoCliente;
        }
        else if (CodigoCliente >= 10){
            return "CL0" + CodigoCliente; 
        }
        else if (CodigoCliente >= 100){
            return "CL" + CodigoCliente; 
        }
        return "";
    }
    public void Ingresar_Cliente(String cedula, String nombre,String , String apellido,String direccion )
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(!Existe_CL(nombre))
            {
                RAC.seek(RAC.length());
                RAC.writeChars(CalcularCodigoCL());
                RAC.writeChars(cedula);
                RAC.writeChars(nombre);
                RAC.writeChars(apellido);
                RAC.writeChars(direccion);
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
        
}
