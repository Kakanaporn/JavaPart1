package Variables;

public class Variable {
	public static void main( String [] args) {
	/* Data type: integer
		Variable name: myInt
	 */
	// Assign value
	// Integer
	int myInt = 20;
	System.out.println("This is a Integer: "+ myInt);
	// Float
	float myFloat = 5.99f ;
	System.out.println("This is a Float: "+ myFloat);
	// Double
	double myDouble = 500.005d;
	System.out.println("This is a Double: "+ myDouble);
	// String
	String myString = "Mavel";
	System.out.println("This is a String: "+ myString);
	// Character
	char myLetter = 'D';
	System.out.println("This is a Characters: "+ myLetter);
	// Boolean
	boolean myBoolean = true;
	System.out.println("This is a Boolean: "+ myBoolean);
	
	for(int counter = 0; counter < 5; counter++ ) {
		if (counter == 2)
			continue;
		System.out.println("Counter :"+ counter);
	}
	
	}
}
