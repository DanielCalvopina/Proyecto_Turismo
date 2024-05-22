package proyecto_d_turismo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

//package proyecto_d_turismo;

public class Lugar {
    private String Nombre; //50 bytes - 25
    private String Ciudad; //50 bytes - 25
    private String Provincia; //50 bytes -25
    private boolean Pet_Friendly; //2 bytes
    private boolean Wifi; //2 bytes
    private String Direccion; //80 bytes - 40 
    private String Descripcion; //150 bytes - 75
    public Lugar(String Nombre, String Ciudad, String Provincia, 
            boolean Pet_Friendly, boolean Wifi, String Direccion, String Descripcion){
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Provincia = Provincia;
        this.Pet_Friendly = Pet_Friendly;
        this.Wifi = Wifi;
        this.Direccion = Direccion;
        this.Descripcion = Descripcion;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getCiudad(){
        return this.Ciudad;
    }
    public String getProvincia(){
        return this.Provincia;
    }
    public boolean getWifi(){
        return this.Wifi;
    }
    public boolean getPet_Friendly(){
        return this.Pet_Friendly;
    }
    public String getDireccion(){
        return this.Direccion;
    }
    public String getDescripcion(){
        return this.Descripcion;
    }
    public void IngresoDatos(File Archivo){
        try{
            RandomAccessFile Arc=new RandomAccessFile(Archivo,"rw");
            Arc.seek(0);
            while(Arc.getFilePointer()<Arc.length())//Mientras mi puntero sea menor que la longitud seguire leyendo
            {
                    String Cat="";
                    for(int i =0;i<15;i++)
                    {
                        Cat=Cat+Arc.readChar();
                    }
                    System.out.println("cat"+Cat);
                    String Codigo="";
                    for(int i =0;i<5;i++)
                    {
                        Codigo=Codigo+Arc.readChar();
                    }
                    System.out.println("cod"+Codigo);
                    String Nombre="";
                    for(int i =0;i<15;i++)
                    {
                        Nombre=Nombre+Arc.readChar();
                    }
                    System.out.println("nom"+Nombre);
                    String Marca="";
                    for(int i =0;i<15;i++)
                    {
                        Marca=Marca+Arc.readChar();
                    }
                    System.out.println("mar"+Marca);
                    double Pre=Arc.readDouble();
                    System.out.println("pre"+Pre);
                    String Des="";
                    for(int i =0;i<40;i++)
                    {
                        Des=Des+Arc.readChar();
                    }
                    System.out.println("Des"+Des);
                    int cant=Arc.readInt();
                    System.out.println("CATN"+cant);
                    Producto aux=new Producto(Codigo,Nombre,Marca,Pre,Des,cant);
                    agregar_Producto(aux,Cat);
                }
                Arc.close();
                
                JOptionPane.showMessageDialog(null, "Leido con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
}

