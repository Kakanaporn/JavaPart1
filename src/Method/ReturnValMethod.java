package Method;

public class ReturnValMethod {
	public static void main( String [] args) {
		String myWord = "Hello World";
		System.out.println(greeting(myWord));
		sayHello(myWord);
	}
	public static String greeting( String word) {
		return word;
	}
	public static void sayHello( String word) {
		System.out.println(word);
	}

}
