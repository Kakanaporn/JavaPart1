package Variables;

public class Variable {
//	public static int instanceInt = 50; //instance variable
	public static void main( String [] args) {
	/* Data type: integer
		Variable name: myInt
	 */
	// Assign value
	// Integer
//	int myInt = 20;
//	System.out.println("This is a Integer: "+ myInt);
//	// Float
//	float myFloat = 5.99f ;
//	System.out.println("This is a Float: "+ myFloat);
//	// Double
//	double myDouble = 500.005d;
//	System.out.println("This is a Double: "+ myDouble);
//	// String
//	String myString = "Mavel";
//	System.out.println("This is a String: "+ myString);
//	// Character
//	char myLetter = 'D';
//	System.out.println("This is a Characters: "+ myLetter);
//	// Boolean
//	boolean myBoolean = true;
//	System.out.println("This is a Boolean: "+ myBoolean);
//	
//	for(int counter = 0; counter < 5; counter++ ) {
//		if (counter == 2)
//			continue;
//		System.out.println("Counter :"+ counter);
//	}
			
		bark();
		
		int myInt = 5;
		float myFloat = myInt; //Widening
		System.out.println("myInt value: "+ myInt);
		System.out.println("myFloat value: "+ myFloat);
		
		float newFloat = 5.5f;
		int newInt = ( int ) newFloat; //Narrowing
		System.out.println("newFloat value: "+ newFloat);
		System.out.println("newInt value: "+ newInt); // 5
		
		double newDouble = 5.5d;
		float otherFloat = ( float ) newDouble; //Narrowing
		System.out.println("newDouble value: "+ newDouble);
		System.out.println("newFloat value: "+ otherFloat); // 5.5
		
		char newChar = 'S';
		int otherInt = ( int ) newChar; //Narrowing
		System.out.println("newChar value: "+ newChar);
		System.out.println("otherInt value: "+ otherInt);
		
		final String hello = "Hello";
		System.out.println("finalInt value: "+ hello);
		hello = "20";
		System.out.println("finalInt value: "+ hello);
	}
	public static void bark(){
		String dogName = "JOJO"; // local variable
		System.out.println("The Dog name "+ dogName+ " bark");
	}
}
