import java.util.*;
import java.lang.*;



public class Assignment3Q5 {
    public static void main(String[] args) {

        Hashtable<Employee,String> ht= new Hashtable<>();
        
        Employee e1=new Employee("ma",2);
        Employee e2=new Employee("lp",3);
        Employee e3=new Employee("dr",4);
        
        ht.put(e1,"ma");
        ht.put(e2,"lp");
        ht.put(e3,"dr");
        
        System.out.println("hashtable : "+ht);
        
        System.out.println(ht.get(e2));
    }
}


class Employee {
    private String name;
    private int id;

    public Employee(String n,int i){name= n;id= i;}
    
	public String getName() {return name;}
	public int getId() {return id;}
	
	public void setName(String name) {this.name = name;}
	public void setId(int id) {this.id = id;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result;
		//result = prime * result +id;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
	/*	if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;*/
		return true;
	}
	
	public String toString(){ return "id: "+this.id+"  name: "+this.name+"  ";}

}