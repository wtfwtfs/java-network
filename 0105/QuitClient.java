import java.net.*;
import java.io.*;

public class QuitClient{
    public static void main(String[] args) throws Exception{
        
        Socket socket = new Socket("192.168.54.71",1000);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        String message = "";

        while(!(message=in.readLine()).equals("quit")){
            
            out.println(message);
            
        }
        out.println("quit");
        socket.close();
    }
}
