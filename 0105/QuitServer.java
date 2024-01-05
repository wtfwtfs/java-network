import java.net.*;
import java.io.*;

public class QuitServer {
    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(1000);
        Socket socket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(System.out);
        
        String message= "";

        while(!(message=in.readLine()).equals("quit")){
            
            out.println(message);
            
        }
        out.println("Client가 quit을 입력해 Server를 종료합니다.");
        socket.close();
        
    }
}