package proyecto_d_turismo;
import java.util.LinkedHashMap;
public class CLIENTE {
    //13 Caracteres
    String Cedula;
    //25 Caracteres
    String Nombre;
    //25 Caracteres
    String Apellido;
    //35 Caracteres
    String Direccion;
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
