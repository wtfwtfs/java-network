import java.io.*;
public class StreamTest{
    public static void main(String[] args) throws Exception{

        DataInputStream in = new DataInputStream(new FileInputStream("1.png"));
        DataOutputStream out = new DataOutputStream(new FileOutputStream("2.png");)

        byte[] data = new byte[1024*8];
        int size;

        while((size=fileIn.read(data))!=-1){
            out.write(data,0,size);
            out.flush();
            
        }
        in.close();
        out.close();
    }
}