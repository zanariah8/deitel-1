// ejercicio 7.23
import java.util.Random;
import java.util.Scanner;

public class RandomHorseMoves {
	RandomHorseMovesModel rhmm = new RandomHorseMovesModel ();
	Random randomNumber = new Random ();

	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Insert 0 to run the 7.23.b exercise or 1 to run 7.23.c");
		char option = input.next ().charAt (0);
		
		RandomHorseMoves rhm = new RandomHorseMoves ();
		if (option == '0')
			rhm.bExercise ();
		else
			rhm.cExercise ();
	}
	
	public void bExercise () {
		byte[] successfulMoves = new byte[1000];

		for (short j = 0; j < 1000; ++j) {
			rhmm.restartAll ((byte) randomNumber.nextInt (8), (byte) randomNumber.nextInt (8));
			successfulMoves[j] = rhmm.makeAllMoves ();
		}
		
		System.out.printf ("The maximun number of moves is %d\n", max (successfulMoves));
	}
	
	public void cExercise () {
		long attempts = 0;
		byte successfulMoves = 0;

		while (successfulMoves != 64) {
			rhmm.restartAll ((byte) randomNumber.nextInt (8), (byte) randomNumber.nextInt (8));
			successfulMoves = rhmm.makeAllMoves ();
			++attempts;
		}
		
		System.out.printf ("The number of attempts is %d\n", attempts);
	}
	
	public static byte max (byte[] array) {
		byte maxValue = array[0];
	
		for (int j = 1; j < array.length; ++j) {
			if (maxValue < array[j])
				maxValue = array[j];
		}
		
		return maxValue;
	}
}
