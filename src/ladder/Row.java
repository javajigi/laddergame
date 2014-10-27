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
		if (persons[nthOfPerson] == 0) {
			return nthOfPerson;
		}

		if (nthOfPerson - 1 >= 0) {
			if (persons[nthOfPerson - 1] == 1) {
				return nthOfPerson - 1;
			}
		}

		return nthOfPerson + 1;
	}
}
