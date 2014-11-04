package ladder;

import junit.framework.TestCase;

public class RowTest extends TestCase {
	private Row row;
	
	@Override
	protected void setUp() throws Exception {
		row = new Row(new NaturalNumber(3));
	}
	
	public void testStartPositionWhenOverNoOfPersons() throws Exception {
		try {
			row.drawLine(new NaturalNumber(3));
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	public void testDrawLineWhenAlreadyDrawingPoint() throws Exception {
		try {
			row.drawLine(new NaturalNumber(1));
			row.drawLine(new NaturalNumber(2));
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	public void testMoveWhenNoLine() throws Exception {
		int target = row.move(new NaturalNumber(1));
		assertEquals(1, target);

		target = row.move(new NaturalNumber(3));
		assertEquals(3, target);
	}
	
	public void testMoveWhenLineLeft() throws Exception {
		// 0 1 1
		row.drawLine(new NaturalNumber(2));
		int target = row.move(new NaturalNumber(3));
		assertEquals(2, target);
	}
	
	public void testMoveWhenLineRight() throws Exception {
		// 0 1 1
		row.drawLine(new NaturalNumber(2));
		
		int target = row.move(new NaturalNumber(2));
		assertEquals(3, target);
	}
}
