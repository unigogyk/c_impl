package c.impl.ch3;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Practice9Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseNumber() {
		assertThat(Practice9.reverseNumber(4), equalTo(4));
		assertThat(Practice9.reverseNumber(12), equalTo(21));
		assertThat(Practice9.reverseNumber(123), equalTo(321));
		assertThat(Practice9.reverseNumber(1234), equalTo(4321));
		assertThat(Practice9.reverseNumber(12531), equalTo(13521));
		assertThat(Practice9.reverseNumber(123456), equalTo(654321));
		assertThat(Practice9.reverseNumber(1234567), equalTo(7654321));
	}

}
