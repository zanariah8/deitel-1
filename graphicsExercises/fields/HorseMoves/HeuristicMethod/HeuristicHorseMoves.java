// ejercicio 7.22 y 7.26
public class HeuristicHorseMoves {

	public static void main (String args[]) {
		HeuristicHorseMovesModel hhmm = new HeuristicHorseMovesModel ();

		for (byte j = 0; j < 8; ++j) {
			for (byte k = 0; k < 8; ++k) {
				System.out.printf ("Initial position: %d, %d\t", j, k);
				hhmm.restartAll ((byte) j, (byte) k);
				hhmm.makeAllMoves ();
			}
		}
	}
}
