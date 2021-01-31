import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment3Q8a {
    public static void failFast(Map<String, String> cityCode)
    {
        Iterator iterator = cityCode.keySet().iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.println(cityCode.get(iterator.next())); 
            cityCode.put("Istanbul", "Turkey");
        }
    }
    public static void main(String[] args) 
    {
    	Map<String, String> m = new HashMap<String, String>(); 
        m.put("A", "a"); 
        m.put("B", "b"); 
        m.put("C", "c"); 
        failFast(m);
    }
}