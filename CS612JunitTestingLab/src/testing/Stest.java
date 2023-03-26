package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Stest extends JunitTesting{

	@Test
	void squaretest() {
		JunitTesting squaretest = new JunitTesting();
		int output= squaretest.square(9);
		assertEquals(81,output);
				
		
	}

}
