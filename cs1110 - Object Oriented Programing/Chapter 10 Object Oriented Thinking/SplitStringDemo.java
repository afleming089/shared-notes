public class SplitStringDemo{
	public static void main(String[] args){

		System.out.println("Demonstrating matches and equals");
		System.out.println("Java".matches("Java"));
		System.out.println("Java".equals("Java"));

		System.out.println("Java is fun".matches("Java.*"));
		System.out.println("Java is cool".matches("Java.*"));

		System.out.println("Java is fun".matches("J"));
		System.out.println("Java is fun".matches("J.*"));

		System.out.println("\n\n");

		System.out.println("Demonstrating split");
		String[] tokens = "Java#HTML#Perl".split("#", 0);
		for (int i = 0; i < tokens.length; i++)
		  System.out.print(tokens[i] + " ");


		System.out.println("\n\nAnother split example");
		tokens = "Java,C?C#,C++".split("[.,:;?]");

		for (int i = 0; i < tokens.length; i++)
		  System.out.println(tokens[i]);

		System.out.println("\n\nAnother split example on hyphen");
		String s = "1-800-Flowers";
		tokens = s.split("[-]");

		for (int i = 0; i < tokens.length; i++)
		  System.out.println(tokens[i]);

		  //replaceAll
		  s = "a+b$#c".replaceAll("[$+#]", "NNN");
		  System.out.println(s);
	}
}