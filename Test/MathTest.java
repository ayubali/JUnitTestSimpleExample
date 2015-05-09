import static org.junit.Assert.fail;
import junit.framework.TestCase;

import org.junit.Test;

public class MathTest extends TestCase {

	private int value1;
	private int value2;

	public MathTest(String testName) {
		super(testName);
	}

	@Override
	protected void setUp() throws Exception {
		value1 = 15;
		value2 = 10;
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		value1 = 0;
		value2 = 0;
		super.tearDown();
	}

	@Test
	public void testAdd() {
		int total = 25;
		int sum = Calculation.add(value1, value2);
		assertEquals(sum, total);
	}

	@Test
	public void testAddFail() {
		int total = 20;
		int sum = Calculation.add(value1, value2);
		assertNotSame(sum, total);
	}
	
	@Test
	public void testSub() {
		int total = 5;
		int sub = Calculation.sub(value1, value2);
		assertEquals(sub, total);
	}

	@Test
	public void testSubFail() {
		int total = 50;
		int sub = Calculation.sub(value1, value2);
		assertNotSame(sub, total);
	}
}
