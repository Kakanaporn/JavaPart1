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
//		boolean isHandSome = true;
//		score(isHandSome);
//		int score = 80;
//		switchCase(score);
		
		/* Lab6-7-8
		System.out.println("\nForLoop 1-10 ");
		for(int counter = 0; counter <= 10; counter++) {	
			System.out.println("Counter: "+ counter);
		}
		
		
		System.out.println("\nSumerize 1-10 ");
		int sum = 0;
		for(int counter = 0; counter <= 10; counter++) {	
			sum += counter;
		}
		System.out.println("Sum = "+ sum);
		
		System.out.println("\nMod by 12: ");
		for (int i=1; i<100; i++) {
			if (i%12==0) System.out.print(i +", ");			
		}
		System.out.println("\nForEach array[]");
		int myArray[] = { 1,2,3,4,5};
		for(int counter :myArray) {
			System.out.println("CounterArray :"+counter);
		}
		
		System.out.println("\nCountDown form 20 ");
		int counter = 20;
		do{
		System.out.println("Counter :"+ counter--);
		} while (counter >= 0 );
		
		System.out.println("\nCheck Even-Odd nuber");
		int num = 20;
		do{
			System.out.println("Counter : Even number" );
			counter--;		
		} while (num%2 != 0);
		System.out.println("Counter : Odd number" );
		
		System.out.println("\nBreak and For");
		for(int i = 0; i <= 20; i++) {
			if(i == 11) {
				System.out.println("Counter : "+ i);
				System.out.println("break");
				break;
			}
		}*/
		
		// Lab 9-10
		System.out.println("\nLab9: Continue and For");
		for(int i = 0; i <= 20; i++) {
			if(i == 11) {
				System.out.println("Counter : "+ i);
				continue;
			}
			System.out.println("Hello");
		}
		System.out.println("\nLab10");
		for(int i = 0; i <= 10; i++) {
			if(i == 2) {	
				continue;
			}
			System.out.println("Counter : "+ i);
		}
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
	
	public static void switchCase(int number) {

		switch(number) {
		case 80:
		System.out.println("A"); 
		break;
		case 70:
		System.out.println("B"); 
		break;
		case 60:
		System.out.println("C"); 
		break;
		case 50:
		System.out.println("D"); 
		break;
		case 40:
		System.out.println("F"); 
		break;
		default:
		System.out.println("E");
		}
	}
}

