import java.util.Scanner;

public class BMICategories {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		double bmi;

		System.out.print( "Enter your BMI: ");
		bmi = keyboard.nextDouble();

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "Vey severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}