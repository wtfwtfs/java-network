import java.io.*;

public class MultiLine{
    public static void main(String[] args) throws Exception{

        BufferedReader keyIn = new BufferedReader(new InputStreamReader(System.in));
        
        PrintStream out = new PrintStream(System.out);
        PrintStream out2 = new PrintStream("test.txt");
        String data="";
        while(!(data=keyIn.readLine()).equals("quit")){
            out2.println(data);
            out.println(data);
        }
        out2.close();
        //뒤에 다시 읽고 출력하면서 충돌 할수도 있어 out2 닫기
        BufferedReader fileIn = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));

        while((data=fileIn.readLine())!=null){
            out.println(data);
        }
        
        
    }
}