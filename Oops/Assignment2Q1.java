// singletone class means having only one instance 


class SingletonInheritanceCheck{

	static SingletonInheritanceCheck obj = new SingletonInheritanceCheck(); //create a static instance in it so that only the object is created only once

	private SingletonInheritanceCheck(){} // if we keep our constructor as private then we can't call it in any other class.

	public static SingletonInheritanceCheck getSingle(){return obj;}  // here we are create the static method because to accese the static obj

}


public class Assignment2Q1 {
	public static void main(String[] args) {

		SingletonInheritanceCheck mani = SingletonInheritanceCheck.getSingle();
		
	}

}
