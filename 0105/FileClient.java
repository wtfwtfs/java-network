import java.net.*;
import java.io.*;

public class FileClient{
    public static void main(String[] args) throws Exception{
        
        Socket socket = new Socket("192.168.54.93",1000);

        DataInputStream in = new DataInputStream(socket.getInputStream());
        FileOutputStream out = new FileOutputStream("2.png");

        byte[] data = new byte[1024*8];
        int size;

        while((size=in.read(data))!=-1){
            out.write(data,0,size);
            out.flush();
            
        }
        
        System.out.println("파일 전송 완료");
        socket.close();
    }
}
