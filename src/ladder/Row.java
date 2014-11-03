package ladder;

class Row {
	private enum Direction {
		LEFT(-1),
		CENTER(0),
		RIGHT(1);
		
		private int no;
		
		private Direction(int no) {
			this.no = no;
		}
		
		public int getNo() {
			return no;
		}
	}
	
	private int[] persons;

	Row(int noOfPersons) {
		persons = new int[noOfPersons];
	}

	void drawLine(int startPosition) {
		persons[startPosition] = Direction.RIGHT.getNo();
		persons[startPosition + 1] = Direction.LEFT.getNo();
	}

	int move(int nthOfPerson) {
		if (isNotLine(nthOfPerson)) {
			return nthOfPerson;
		}

		if (isRightDirection(nthOfPerson)) {
			return nthOfPerson + 1;
		}

		return nthOfPerson += -1;
	}

	private boolean isRightDirection(int nthOfPerson) {
		return persons[nthOfPerson] == Direction.RIGHT.getNo();
	}

	private boolean isNotLine(int nthOfPerson) {
		return persons[nthOfPerson] == Direction.CENTER.getNo();
	}
}
