package Variables;

public class Conditional {
	public static void main( String [] args) {
		/*int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);
		float value_1 = 1.005f;
		float value_2 = 2.005f;
		if(( value_1 == 1) && ( value_2 == 2))
		System.out.println("value value1 is 1 AND value value2 is 2");
		char char1 = 'S';
		char char2 = 'D';
		if(( char1 == 'D') || ( char2 == 'D'))
		System.out.println("value value1 is 'D' OR value value2 is 'D'");*/
		boolean isHandSome = true;
		score(isHandSome);
	}
	
	public static void score(boolean isHandSome) {
		int marks = 50;
		if (isHandSome == true) {
		System.out.println("Good");
		} else if (marks < 50) {
		System.out.println("fail");
		} else if (marks >= 50) {
		System.out.println("normal");
		} else if (marks >= 70) {
		System.out.println("normal");
		} else if (marks >= 80) {
		System.out.println("Good");
		} 
	}
}
