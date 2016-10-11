package c.impl.ch3;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Practice11Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPreChar() {
		assertThat(Practice11.getPreChar('a'), is('a'));
		assertThat(Practice11.getPreChar('A'), is('A'));
		assertThat(Practice11.getPreChar('b'), is('a'));
		assertThat(Practice11.getPreChar('c'), is('b'));
		assertThat(Practice11.getPreChar('B'), is('A'));
	}

	@Test
	public void testGetNextChar() {
		assertThat(Practice11.getNextChar('a'), is('b'));
		assertThat(Practice11.getNextChar('z'), is('z'));
		assertThat(Practice11.getNextChar('y'), is('z'));
		assertThat(Practice11.getNextChar('x'), is('y'));
		assertThat(Practice11.getNextChar('A'), is('B'));
		assertThat(Practice11.getNextChar('C'), is('D'));
		assertThat(Practice11.getNextChar('X'), is('Y'));
		assertThat(Practice11.getNextChar('Y'), is('Z'));
	}

}
