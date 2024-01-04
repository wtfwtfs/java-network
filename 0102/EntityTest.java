import java.util.HashMap;
import java.io.*;

public class EntityTest{
    public static void main(String[] args) throws Exception{

        Person person = new Person();

        person.name="Kim";
        person.tel="01012345678";
        person.address="gimhae";
        person.birth="000101";

        HashMap<String,String> person3 = new HashMap<>();
        person3.put("name","lee");
        person3.put("tel","01023456789");
        person3.put("address","ulsan");
        person3.put("birth","991010");

       //PrintStream out = new PrintStream("Object.txt");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.txt"));
        out.writeObject(person);
        out.close();

        ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream("Object.txt"));
        Person p = (Person)fileIn.readObject();
        System.out.println(p.name);
        fileIn.close();

        // System.out.println(person.name);
        // System.out.println(person3.get("name"));

    }
}