package ladder;

public class Row {
	int[] persons;

	public Row(int noOfPersons) {
		persons = new int[noOfPersons];
	}

	void drawLine(int startPosition) {
		persons[startPosition] = 1;
		persons[startPosition + 1] = -1;
	}

	int move(int nthOfPerson) {
		if (isNotLine(nthOfPerson)) {
			return nthOfPerson;
		}

		if (isRightDirection(nthOfPerson)) {
			return nthOfPerson + 1;
		}

		return nthOfPerson +=- 1;
	}

	private boolean isRightDirection(int nthOfPerson) {
		return persons[nthOfPerson] == 1;
	}

	private boolean isNotLine(int nthOfPerson) {
		return persons[nthOfPerson] == 0;
	}
}
