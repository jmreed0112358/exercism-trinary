package trinary;

import exceptions.NotImplementedException;

public class Trinary
{
	public static int toDecimal(String input) {
		if (input == null) {
			throw new NullPointerException();
		}
		int result = 0;
		
		if ( validate(input)) {

			input = new StringBuilder(input).reverse( ).toString( );
			
			for ( int i = 0 ; i < input.length( ) ; i++ ) {
				result += Character.digit( input.charAt( i ), 3 ) * Math.pow( 3, i );
			}
		}
		return result;
	}
	
	private static boolean validate(String input) {
		if ( input.isEmpty( ) ) {
			return false;
		}
		
		for ( int i = 0 ; i < input.length( ) ; i++ ) {
			if ( !(input.charAt( i ) == '0') &&
					!(input.charAt( i ) == '1') &&
					!(input.charAt( i ) == '2') ) {
				return false;
			}
		}
		
		return true;
	}
}
