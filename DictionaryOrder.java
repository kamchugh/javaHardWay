import java.util.Scanner;

public class DictionaryOrder {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String name;

		System.out.print( "Make up the name of a programmimg language! " );
		name = keyboard.nextLine();

		if ( name.compareTo("c++") < 0 )
			System.out.println( name + " comes BEFORE c++" );
		if ( name.compareTo("c++") == 0 )
			System.out.println( "c++ isn't a made up language!" );
		if ( name.compareTo("c++") > 0 )
			System.out.println( name + " comes AFTER c++" );

		if ( name.compareTo("go") < 0 )
			System.out.println( name + " comes BEFORE go" );
		if ( name.compareTo("go") == 0)
			System.out.println( "go isn't a made up language!" );
		if ( name.compareTo("go") > 0 )
			System.out.println( name + " comes AFTER go" );

		if ( name.compareTo("java") < 0 )
			System.out.println( name + " comes BEFORE java" );
		if ( name.compareTo( "java") == 0 )
			System.out.println( "java isn't a made-up language!" );
		if ( name.compareTo("java") > 0 )
			System.out.println( name + " comes AFTER java" );
	}
}