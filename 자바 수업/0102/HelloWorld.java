import java.io.*;

public class HelloWorld{
    public static void main(String[]args) throws Exception {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
        String data = in.readLine();
        byte[] byteData = data.getBytes("utf-8");

        PrintStream out = new PrintStream(System.out);
        out.write(byteData);
        //PrintStream out2 = new PrintStream("test2.txt");
        //out2.println(data);
    }
} //01.02 실습내용 : 데이터가 어디에서 출발해서 어디로 나왔는가, 데이터를 어디서 얻고, 데이터를 어디로 보낼 것인가(모니터, 파일 등),
// 파일 -> 파일로 보내면 결론은 복사지만 파일에서데이터를 보내서 다른 파일로 보냄.
// 반복문 + 배열로 이미지도 복사됨( txt / 바이너리) 
// 주소록(객체) entity class는 그냥 만들면 안되고 implements Serializable(직렬화)을 해야 객체의 내용과 값이 파일로 저장이됨
// 파일로 저장되면 앞의 객체 생성구간은 주석처리해도 저장된 파일로 출력 가능