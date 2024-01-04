import java.util.*;

public class HashMapArrayList {
    public static void main(String[] args) throws Exception{

        HashMap<String,Object> person = new HashMap<>();
        ArrayList<HashMap<String,Object>> persons = new ArrayList<>();

        person.put("name","이순신");
        person.put("address","여수시");
        person.put("age",20);
        persons.add(person);

        person = new HashMap<>();
        person.put("name","이방원");
        person.put("address","한양시");
        person.put("age",30);
        persons.add(person);

        person = new HashMap<>();
        person.put("name","이도");
        person.put("address","서울시");
        person.put("age",42); 
        persons.add(person);    
        
        int sumAge =0;

        for(int i=0;i<persons.size();i++){

            System.out.println((String)persons.get(i).get("name"));

            System.out.println((int)persons.get(i).get("age"));
            //sumAge=sumAge+((Integer)persons.get(i).get("age").intvalue());
            sumAge=sumAge+(int)persons.get(i).get("age");
        }

        System.out.println("나이 평균 : " + (double)sumAge/persons.size());

    }
}