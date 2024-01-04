import java.io.*;
public class StreamTest1{
    public static void main(String[] args) throws Exception{

        DataInputStream();
        
        
        byte[] data = new byte[1024*8];
        int size;

        while((size=fileIn.read(data))!=-1){
            out.write(data,0,size);
            out.flush();
        }   
        fileIn.close();
        out.close();
    }
}