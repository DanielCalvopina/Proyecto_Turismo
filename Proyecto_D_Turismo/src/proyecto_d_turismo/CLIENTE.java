package proyecto_d_turismo;
import java.util.LinkedHashMap;
public class CLIENTE {
    //5 Caracteres
    String Cedula;
    //10 Caracteres
    String Nombre;
    //15 Caracteres
    String Apellido;
    //15 Caracteres
    String Direccion;
    //total bytes 90
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
}
