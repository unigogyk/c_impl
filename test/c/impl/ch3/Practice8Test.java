package c.impl.ch3;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Practice8Test {

	private double pi;
	
	@Before
	public void setUp() throws Exception {
		pi = 3.14;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCircumference() {
		double r = 3;
		//assertEquals(2*pi*r, Practice8.getCircumference(r));
		assertThat(Practice8.getCircumference(r), is(equalTo(2*pi*r)));
		System.out.println(2*pi*r);
		while(r <= 4){
			assertThat(Practice8.getCircumference(r), is(equalTo(2*pi*r)));
			System.out.println(2*pi*r);
			r += 0.1;
		}
	}

	@Test
	public void testGetArea() {
		double r = 3;
		assertThat(Practice8.getArea(r), equalTo(pi*r*r));
		System.out.println(pi*r*r);
		while(r <= 4){
			assertThat(Practice8.getArea(r), equalTo(pi*r*r));
			System.out.println(pi*r*r);
			r += 0.1;
		}
	}

}
