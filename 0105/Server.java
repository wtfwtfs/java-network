import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(1000);
        Socket socket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(System.out);

        String message=in.readLine();
        out.println(message);
        socket.close();
    }
}