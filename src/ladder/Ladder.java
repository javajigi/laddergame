package ladder;

public class Ladder {
	int[][] rows;

	public Ladder(int countOfRow, int noOfPerson) {
		rows = new int[countOfRow][noOfPerson];
	}

	public void drawLine(int noOfRow, int startPosition) {
		rows[noOfRow][startPosition] = 1;
		rows[noOfRow][startPosition + 1] = 1;
	}

	public int run(int nthOfPerson) {
		for (int i = 0; i < rows.length; i++) {
			int[] row = rows[i];
			
			nthOfPerson = moveRow(nthOfPerson, row);
		}
		
		return nthOfPerson;
	}

	private int moveRow(int nthOfPerson, int[] row) {
		if (row[nthOfPerson] == 0) {
			return nthOfPerson;
		}

		if (nthOfPerson - 1 >= 0) {
			if (row[nthOfPerson - 1] == 1) {
				return nthOfPerson - 1;
			}
		}

		return nthOfPerson + 1;
	}
}
