package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countA extends JunitTesting{

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.count("VARUNTEJA");
		assertEquals(2,output);
		
	}

}
