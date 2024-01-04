import java.io.*;
import java.util.*;

public class HashMapHashMap{
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
        
        Set<String> keySet = persons.keySet();

        //String[] keys = keySet.toArray(new String[0]);

        Collection<HashMap<String,Object>> value = persons.values();

        HashMap[] values = value.toArray(new HashMap[0]);

        int sum =0;

        for(HashMap p : value){
            int age = (int)p.get("age");
            System.out.println(p.get("name")+ " : " +age);
            sum=sum+age;
        }

        // for(String key : keySet){
        //     HashMap p = persons.get(key);
        //     int age = (int)p.get("age");
        //     System.out.println(p.get("name")+ " : " + age);
        //     sum=sum+age;
        // }

        // for(int i=0;i<keys.length;i++){
        //     HashMap p = persons.get(keys[i]);
        //     int age = (int)p.get("age");
        //     System.out.println(p.get("name")+ " : " + p.get("age"));
        //     sum=sum+age;
        // }

        System.out.println("평균나이 : " + (double)sum/value.size());
        
    }
}