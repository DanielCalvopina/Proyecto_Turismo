package proyecto_d_turismo;

import java.io.File;

public class Proyecto_D_Turismo {
    
    public static void main(String[] args) {
        File u=new File("D://dato.dat");
        File cli=new File("D://cli.dat");
        ALMACENAMIENTO_DATOS b =new ALMACENAMIENTO_DATOS(u);
        ALMACENAMIENTO_CLIENTES c = new ALMACENAMIENTO_CLIENTES(cli);
        //b.Borrar();
        Menu a = new Menu(b, c);
        a.setVisible(true);
        a.setTitle("Menu");
    }
    
}
