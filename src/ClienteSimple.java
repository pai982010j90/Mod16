import java.net.*;
import java.io.*;

/**
 *
 * @author nanohp
 */
public class ClienteSimple {
    public static void main(String[] args) {
        try{
            Socket s1 = new Socket("127.0.0.1", 15432);
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
