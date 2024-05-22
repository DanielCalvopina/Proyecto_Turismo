package proyecto_d_turismo;
import java.util.LinkedHashMap;
public class CLIENTE {
    //13 Caracteres
    private String Cedula;
    //10 Caracteres
    private String Nombre;
    //15 Caracteres
    private String Apellido;
    //15 Caracteres
    private String Direccion;
    //5 caracteres
    private String Contraseña;
    //total bytes 116
    public CLIENTE(String Cedula,String Nombre,String Apellido,String Direccion){
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
    }
    public String getCedula(){
        return Cedula;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getDireccion(){
        return Direccion;
    }
    public String getContraseña(){
        return Contraseña;
    }
    
}
