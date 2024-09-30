public class ScopeExample{
	public static void main(String[] args){

		int i = 10;

		System.out.println("i in the main is "+ i);

		someMethod();
		System.out.println("i at the end of main is "+ i);

	}

	public static void someMethod(){
		int i = 55;
		System.out.println("i in someMethod is " + i);
	}
}