package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divtest {

	@Test
	void Truecase() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(10,5);
		assertEquals(2,output);
		
	}
	
	@Test
	void Falsecase() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(15,3);
		assertEquals(1000,output);
		
	}

}
