//package proyecto_d_turismo;

public class Lugar {
    private String Nombre; //50 bytes
    private String Ciudad; //50 bytes
    private String Provincia; //50 bytes
    private boolean Pet_Friendly; //2 bytes
    private boolean Wifi; //2 bytes
    private String Direccion; //80 bytes
    private String Descripcion; //150 bytes
    
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
}

