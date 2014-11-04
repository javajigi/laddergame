package ladder;

import junit.framework.TestCase;

public class LadderTest extends TestCase {
	public void testRunWhenMultiRows() throws Exception {
		// 1 1 0 0
		// 0 1 1 0
		// 0 0 1 1
		Ladder ladder = new Ladder(new NaturalNumber(3), new NaturalNumber(4));
		ladder.drawLine(new NaturalNumber(1), new NaturalNumber(1));
		ladder.drawLine(new NaturalNumber(2), new NaturalNumber(2));
		ladder.drawLine(new NaturalNumber(3), new NaturalNumber(3));
		
		assertEquals(4, ladder.run(new NaturalNumber(1)));
		assertEquals(1, ladder.run(new NaturalNumber(2)));
		assertEquals(2, ladder.run(new NaturalNumber(3)));
		assertEquals(3, ladder.run(new NaturalNumber(4)));
	}
	
	public void testDrawLineWhenOverNoOfRows() throws Exception {
		try {
			Ladder ladder = new Ladder(new NaturalNumber(3), new NaturalNumber(4));
			ladder.drawLine(new NaturalNumber(4), new NaturalNumber(4));
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
}
