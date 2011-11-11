import java.net.*;
import java.io.*;

/**
 *
 * @author nanohp
 */
public class ClienteSimple {
    public static void main(String[] args) {
        try{
            String ip, puerto;
            
            System.out.println("IP:");
            InputStreamReader isr0 = new InputStreamReader(System.in);
            BufferedReader br0 = new BufferedReader(isr0);
            ip = br0.readLine();
            
            System.out.println("Puerto:");
            InputStreamReader isr1 = new InputStreamReader(System.in);
            BufferedReader br1 = new BufferedReader(isr1);
            puerto = br1.readLine();
            
            Socket s1 = new Socket(ip, Integer.parseInt(puerto));
            InputStream is = s1.getInputStream();
            //DataInputStream dis = new DataInputStream(is);
            InputStreamReader dis = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(dis);
            System.out.println("-"+br.readLine());
            br.close();
            s1.close();
        } catch (ConnectException connExc) {
            System.err.println("Imposible conectar");
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
