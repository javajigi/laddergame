package ladder;

public class Row {
	int[] persons;

	public Row(int noOfPersons) {
		persons = new int[noOfPersons];
	}

	void drawLine(int startPosition) {
		persons[startPosition] = 1;
		persons[startPosition + 1] = 1;
	}

	int moveRow(int nthOfPerson) {
		if (isNotLine(nthOfPerson)) {
			return nthOfPerson;
		}

		if (isNotLeftEnd(nthOfPerson) && canLeft(nthOfPerson)) {
			return nthOfPerson - 1;
		}

		return nthOfPerson + 1;
	}

	private boolean canLeft(int nthOfPerson) {
		return persons[nthOfPerson - 1] == 1;
	}

	private boolean isNotLeftEnd(int nthOfPerson) {
		return nthOfPerson - 1 >= 0;
	}

	private boolean isNotLine(int nthOfPerson) {
		return persons[nthOfPerson] == 0;
	}
}
