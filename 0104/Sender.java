import java.io.*;
import java.util.*;

public class Sender {
    public static void main(String []args) throws Exception{

        HashMap<String,HashMap<String,Object>> persons = new HashMap<>();
        HashMap<String,Object> person = new HashMap<>();

        person.put("name","이순신");
        person.put("address","여수시");
        person.put("age",20);
        persons.put((String)person.get("name"),person);
        
        person = new HashMap<>();
        person.put("name","이방원");
        person.put("address","한양시");
        person.put("age",30);
        persons.put((String)person.get("name"),person);
        
        person = new HashMap<>();
        person.put("name","이도");
        person.put("address","서울시");
        person.put("age",42); 
        persons.put((String)person.get("name"),person);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persons"));
        out.writeObject(persons);
        out.close();
        
    }
}