import java.net.*;
import java.io.*;

public class FileServer {
    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(1000);
        Socket socket = serverSocket.accept();
        FileInputStream in = new FileInputStream("1.png");
        //DataInputStream in = new DataInputStream(new FileInputStream("1.png"));
        PrintStream out = new PrintStream(socket.getOutputStream());

        byte[] data = new byte[1024*8];
        int size;

        while((size=in.read(data))!=-1){
            out.write(data,0,size);
            out.flush();
            
        }

        socket.close();
        
        

        

    }
}