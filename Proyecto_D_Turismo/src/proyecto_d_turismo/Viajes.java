package proyecto_d_turismo;
public class Viajes {
    //5 caracteres
    String Codigo;
    Lugar Sitio;
    //2 caracteres
    int Dias;
    //2 caracteres
    int Personas;
    //4 caracteres
    int Costo;
    //42 caracteres
    public Viajes (String Codigo, Lugar Sitio, int Dias, int Personas, int Costo){
        this.Codigo = Codigo;
        this.Sitio = Sitio;
        this.Dias = Dias;
        this.Personas = Personas;
        this.Costo = Costo;
    }
    public String getCodigo(){
        return Codigo;
    }
    public String getLugar(){
        return Lugar;
    }
    public int getDias(){
        return Dias;
    }
    public int getPersonas(){
        return Personas;
    }
    public int getCosto(){
        return Costo;
    }
}

