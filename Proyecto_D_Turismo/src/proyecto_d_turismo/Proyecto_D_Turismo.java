package proyecto_d_turismo;

import java.io.File;

public class Proyecto_D_Turismo {
    
    public static void main(String[] args) {
        File u=new File("D://dato.dat");
        ALMACENAMIENTO_DATOS b =new ALMACENAMIENTO_DATOS(u);
        b.Borrar();
        Menu a = new Menu(b);
        a.setVisible(true);
        a.setTitle("Menu");
    }
    
}
