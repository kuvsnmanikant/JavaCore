import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Assignment5Q2 {
	
	public static void main(String[] args) {
		List<News> list = new ArrayList<>();
		Scanner ss= new Scanner(System.in);
		
		System.out.print("enter the number of news you want to enter : ");
		int n= ss.nextInt();
		
        for(int i=1;i<=n;i++) {
	   		 
	   		System.out.print("enter id of news "+i+"                : ");
	   		int id= ss.nextInt();
	   		 
	   		System.out.print("enter the postedByUser of news "+i+"  : ");
	   		String pu= ss.next();
			
			System.out.print("enter the commentByUser of news "+i+" : ");
			String cu= ss.next();
			
			System.out.print("enter comment of news "+i+"           : ");
	   	    String c= ss.next();
	   	    
	   	    System.out.println("--------------------------------------------");
	   		 
	   		list.add(new News(id,pu,cu,c));
	   	 }
        
        System.out.println("newsId which has received maximum comments : "+maxComments(list));
        System.out.println("how many times the word 'budget' arrived in user comments all news : "+budgetCount(list));
        System.out.println("user has posted maximum comments : "+maxCommentsByUser(list));
        sortMaxCommentsByUser(list).forEach((k,v)-> System.out.println(k+"  "+v));
        
	}
	
	
	
    public static int maxComments(List<News> news) {
    	int max=0;
    	int a=0;
    	for (News n: news) {
    		int c=0;
    		for (News m: news){	
    			if ((m.getNewsId()) == (n.getNewsId())){ c++; }	
    			}
    		if(c>max) {
    			max=c;
    			a=n.getNewsId();
    		}
    	}
    	return a;
    }
    
    
    

    public static int budgetCount (List < News > news) {
   
    	 int c=0;
     	 for (News n: news) {
     		 c+=count(n.getComment());
     	 }
     	 return c;
    }
    
    
    
    
    public static String maxCommentsByUser (List < News > news) {
    	String a="";
    	int max=0;

    	for (News n: news) {
    		int c=0;
    		
    		for (News m: news){	
    			if ((m.getCommentByUser()).equals(n.getCommentByUser())){ c++; }	
    		}
    		
    		if(c>max){ a=n.getCommentByUser();  max=c; }
    	}
    	
    	return a;
    }
    
    

    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {
    	Map<String,Integer> map=new HashMap<>();
    	for (News n: news) {
    		int c=0;
    		
    		for (News m: news){	
    			if ((m.getCommentByUser()).equals(n.getCommentByUser())){ c++; }	
    		}
    		
    		map.put(n.getCommentByUser(),c);
    	}
    	return map;
    }
    
    
    
    public static int count(String a) {
    	
    	String[] arr =a.split(" ");
    	int c = 0;	
        for (int j = 0; j < arr.length; j++) {
            if ("budget".equals(arr[j])) {c++;}
        }
       return c;	
    }
     
}




class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    
    
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}


	public int getNewsId() {return newsId;}
	public String getPostedByUser() {return postedByUser;}
	public String getCommentByUser() {return commentByUser;}
	public String getComment() {return comment;}

	
	
}



