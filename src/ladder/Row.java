package ladder;

public class Row {
	private static final int LEFT_DIRECTION = -1;
	private static final int CENTER_DIRECTION = 0;
	private static final int RIGHT_DIRECTION = 1;
	
	int[] persons;

	public Row(int noOfPersons) {
		persons = new int[noOfPersons];
	}

	void drawLine(int startPosition) {
		persons[startPosition] = RIGHT_DIRECTION;
		persons[startPosition + 1] = LEFT_DIRECTION;
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
		return persons[nthOfPerson] == RIGHT_DIRECTION;
	}

	private boolean isNotLine(int nthOfPerson) {
		return persons[nthOfPerson] == CENTER_DIRECTION;
	}
}
