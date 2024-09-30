/* example pg. 419  */

public class Example_pg419 {
	public static void main(String[] args){
		new Faculty();

	} //end main
}

class Faculty extends Employee{
	public Faculty(){

		System.out.println("(4) Performs Faculty's tasks");
    }
} //end class Faculty


class Employee extends Person2{
	public Employee(){
		this("(2) Invoke Employee's overloaded constructor");
		System.out.println("(3) Performs Employee's tasks");
	}

	public Employee(String s){

		System.out.println(s);
	}
}//end class Employee


class Person2 {
	public Person2(){

		System.out.println("(1) Performs Person's tasks");
 	}
}//end class Peron



