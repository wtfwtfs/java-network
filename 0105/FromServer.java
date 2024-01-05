import java.net.*;
import java.io.*;

public class FromServer {
    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(1000);
        Socket socket = serverSocket.accept();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(System.out);
        PrintStream out2 = new PrintStream(socket.getOutputStream());

        String message= "";

        while(!(message=in.readLine()).equals("quit")){
            out.println(message);
            out2.println(message+"from Server");
        }
        System.out.println("Client가 quit를 입력해 종료합니다.");
        socket.close();
        
    }
}