import java.net.*;
import java.io.*;

public class Client{
    public static void main(String[] args) throws Exception{
        
        Socket socket = new Socket("192.168.54.93",1000);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(socket.getOutputStream());

        String message = in.readLine();
        out.println(message);
        socket.close();
    }
}
