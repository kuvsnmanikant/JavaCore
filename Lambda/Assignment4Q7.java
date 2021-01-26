import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Assignment4Q7 {
	
	public static void main(String[] args) {
		
    	HashMap<String,Integer> m = new LinkedHashMap<String,Integer>();   	
    	Scanner ss= new Scanner(System.in);
   	 
	   	 System.out.print("enter the number of elements you want to enter : ");
	   	 int s= ss.nextInt();
	   	 
	   	 
	   	 for(int i=1;i<=s;i++) {
	   		 
	   		 System.out.print("enter the key "+i+" in the map   : ");
	   		 String st= ss.next();
	   		 
	   		 System.out.print("enter the value "+i+" in the map : ");
	   		 int stt= ss.nextInt();
	   		 
	   		 m.put(st,stt);
	   	 }
	   	 
	   	System.out.print(new Assignment4Q7().convertKeyValueToString(m));
    }
	
	
	
    public String convertKeyValueToString(HashMap<String, Integer> map) {
    	
    	StringBuilder sb=new StringBuilder("");

    	map.entrySet().stream().forEach(e -> {sb.append(e.getKey()); sb.append(e.getValue());});
    	
    	return sb.toString();
    	
    }

}
