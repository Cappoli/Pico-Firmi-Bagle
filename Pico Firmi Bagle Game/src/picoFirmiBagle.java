
public class picoFirmiBagle {
	int a = 0;
	int b = 0;
	int c = 0;
	
	int guessA = 0;
	int guessB = 0;
	int guessC = 0;
	int guessCheck = 0;
	int correctAnswer = 0;
	
	String outcomeA;
	String outcomeB;
	String outcomeC;
			
	String pico = "Pico";
	String firmi = "Firmi";
	String bagel = "Bagel";

	public static void main(String[] args) {
	}
		// TODO Auto-generated method stub
		
				
		//Generate three random single digit numbers 0-0-0 to 9-9-9
	
	public static int randomNumbers(int min, int max) {
		
		min = 0;
		max = 9;
		
		
		int f = (int) (Math.random()*((max-min)+1))+min;
		
		return f;
		
		
	}
		
		//Player enters 3 numbers
		
		//Check if player has guessed any number in the correct spot
		
		//Check to see if player has guessed the correct number in any slot
		
		/* Output results
		 * 
		 * 			Pico - used number in wrong spot
		 * 			Firmi - used number in correct spot
		 * 			Bagel - no numbers guessed are used */
		
		public void comparator() {
			
			
		if( guessA == a ) {										//Firmi is returned
			outcomeA = firmi;
		}else if( guessA == b || guessA == c) {					//Pico is returned
			outcomeA = pico;
		}else if( guessA != a && guessA != b && guessA != c ) {	//Bagel is returned
			outcomeA = bagel;
		}
		
		if( guessB == b ) {										//Firmi is returned
			outcomeB = firmi;
		}else if( guessB == a || guessB == c) {					//Pico is returned
			outcomeB = pico;
		}else if( guessB != b && guessB != a && guessB != c ) {	//Bagel is returned
			outcomeB = bagel;
		}
		
		if( guessC == c ) {										//Firmi is returned
			outcomeC = firmi;
		}else if( guessC == b || guessC == a) {					//Pico is returned
			outcomeC = pico;
		}else if( guessC != a && guessC != b && guessC != c ) {	//Bagel is returned
			outcomeC = bagel;
		}
		
		}
		
		//Remember guesses and results
		//

}
