package proyecto_d_turismo;
public class Viajes {
    String Codigo;
    String Lugar;
    int Dias;
    int Personas;
    int Costo;
    public Viajes (String Codigo, String Lugar, int Dias, int Personas, int Costo){
        this.Codigo = Codigo;
        this.Lugar = Lugar;
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
