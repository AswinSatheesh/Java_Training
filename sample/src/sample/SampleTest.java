package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SampleTest {

	@Test
	@Order(1)
	public void addition() {
		Sample obj = new Sample();
		int result = obj.add(10, 20);
		System.out.println(result);
		int expected = 30;
		assertEquals(expected,result);
	}
	
	@Test
	@Order(2)
	public void subtract() {
		Sample obj = new Sample();
		int result = obj.sub(20, 20);
		int expected = 0;
		System.out.println(result);
		assertEquals(expected,result);
	}
	
	@Test
	@Order(3)
	public void multiplication() {
		Sample obj = new Sample();
		int result = obj.mult(2, 2);
		int expected = 4;
		System.out.println(result);
		assertEquals(expected,result);
	}

}
