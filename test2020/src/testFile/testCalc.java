package testFile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pcalss.calc;

class testCalc {

	@Test
	public void test() {
		calc c = new calc();
		assertEquals(404, c.add(402, 2));
		assertEquals(540, c.add(500, 40));

		
	}


}
