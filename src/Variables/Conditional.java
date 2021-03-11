package Variables;

public class Conditional {
	public static void main( String [] args) {
		int i = 20;
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
		System.out.println("value value1 is 'D' OR value value2 is 'D'");
	}
}
