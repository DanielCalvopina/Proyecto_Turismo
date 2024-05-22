/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_d_turismo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Usuarios {
    private File file;
    //User 15 chars 30 bytes
    //Passwords 15 chars 30 bytes
    public Usuarios(File A)
    {
        file=A;
    }
    public boolean Comprobacion(String User,String Password)
    {
        try(RandomAccessFile RAC = new RandomAccessFile(file, "r"))
        {
            String AUser="";
            String APassword="";
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                 AUser="";
                 APassword="";
                for(int i=0;i<15;i++)
                {
                    AUser=AUser+RAC.readChar();
                }
                for(int i=0;i<15;i++)
                {
                    APassword=APassword+RAC.readChar();
                }
                if(User.equals(AUser)&&Password.equals(APassword))
                {
                    RAC.close();
                    return true;
                }
            }
            RAC.close();
            return false;
        }
        catch(IOException e)
        {
            return false;
        }
    }
    
}