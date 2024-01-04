import java.util.*;

public class CollectionTest{
    public static void main(String[] args) throws Exception{
        HashMap<String,Object> map = new HashMap<>();
        map.put("name","kim");
        map.put("address","gimhae");
        map.put("age",20);

        map.put("name","lee");

        System.out.println(map.get("name"));
        System.out.println(map.get("age"));

        ArrayList<Object> array = new ArrayList<>();
        ArrayList<HashMap<String,String>> array2 = new ArrayList<>();

        array2.get(3).get("name");

        array.add("kim");
        array.add(20);
        //array.add(map);

        //System.out.println(array.get(0));
        // System.out.println(array.get(2)).get("name");
        map.put("array",array);
        //HashMap map2 = (HashMap)array.get(2);
        //System.out.println(map2.get("name"));
        

    

        // Hashmap과 arraylist의 차이. 
        // 프로그램 언어마다 달라도 서로 알수 있도록 json형태로 표현될 수 있음
        // collection 겉핡기 (hashmap, array) / object는 아무거나 들어갈 수 있음
        // array에도 array가 들어가짐
    }
}