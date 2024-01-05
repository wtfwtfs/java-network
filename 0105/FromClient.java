import java.net.*;
import java.io.*;

public class FromClient{
    public static void main(String[] args) throws Exception{
        
        Socket socket = new Socket("192.168.54.93",1000);
        
            
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String message = "";

        while(!(message=in.readLine()).equals("quit")){
            
            out.println(message);
            System.out.println(in2.readLine());
        }
        out.println("quit");
        socket.close();
    }
}
