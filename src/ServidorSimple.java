
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nanohp
 */
public class ServidorSimple {

    public static void main(String[] args) {
        ServerSocket s = null;
        try {
            s = new ServerSocket(15432);
        } catch (IOException ex) {
            Logger.getLogger(ServidorSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(true){
            try{
                Socket s1 = s.accept();
                
                OutputStream s1out = s1.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));
                
                System.out.println("Hola");
                bw.write("Bienvenido a la red\n");
                
                bw.close();
                s1.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                       
            }
        }
        
    }
}
