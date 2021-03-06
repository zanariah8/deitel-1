// ejercicio 7.22
public class HorseMovesModel {
	private byte horizontal[] = {2, 1, -1, -2, -2, -1, 1, 2};
	private byte vertical[] = {-1, -2, -2, -1, 1, 2, 2, 1};
	private boolean field[][] = new boolean[8][8];
	private byte currentPosition[] = new byte[2];

	public HorseMovesModel (byte initialRow, byte initialColumn) {
		currentPosition[0] = initialRow;
		currentPosition[1] = initialColumn;
		field[initialRow][initialColumn] = true;
	}
	
	public boolean[][] getField () {
		return field;
	}
	
	public boolean makeAMove (byte horizontalMove, byte verticalMove) {
		if (currentPosition[0] + horizontalMove >= 0 &&
				currentPosition[0] + horizontalMove <= 7 &&
				currentPosition[1] + verticalMove >= 0 &&
				currentPosition[1] + verticalMove <= 7 &&
				!field[currentPosition[0] + horizontalMove][currentPosition[1] + verticalMove]) {
			currentPosition[0] += horizontalMove;
			currentPosition[1] += verticalMove;
			field[currentPosition[0]][currentPosition[1]] = true;
			
			return true;
		} else
			return false;
	}
	
	public boolean makeAMove (byte numberOfMove) {
		return makeAMove (horizontal[numberOfMove], vertical[numberOfMove]);
	}
	
	// the moves should be 64
	public void makeAllMoves () {
		byte movesSuccessful = 0;
	
		for (byte j = 0; j < 64; ++j) {
			if (makeAMove ((byte) 0) || makeAMove ((byte) 1) || makeAMove ((byte) 2) || makeAMove ((byte) 3) ||
					makeAMove ((byte) 4) || makeAMove ((byte) 5) || makeAMove ((byte) 6))
				++movesSuccessful;
		}
		
		System.out.printf ("The last position is %d, %d. And the maximun moves was %d\n",
									currentPosition[0],
									currentPosition[1],
									movesSuccessful);
	}
}
