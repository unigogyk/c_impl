package c.impl.ch4;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Practice7Test {

	@Before
	public void setUp() throws Exception {
		System.out.println();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPreChar() {
		assertThat(Practice7.getPreChar('a'), is('a'));
		for(int i=1; i<=25; i++){
			System.out.println((char)((int)('a')+i) + " " + (char)((int)('a')+i-1));
			assertThat(Practice7.getPreChar((char)((int)('a')+i)), is((char)((int)('a')+i-1)));
		}
		System.out.println("==============");
		assertThat(Practice7.getPreChar('A'), is('A'));
		for(int i=1; i<=25; i++){
			System.out.println((char)((int)('A')+i) + " " + (char)((int)('A')+i-1));
			assertThat(Practice7.getPreChar((char)((int)('A')+i)), is((char)((int)('A')+i-1)));
		}
	}

	@Test
	public void testGetNextChar() {
		for(int i=0; i<25; i++){
			System.out.println((char)((int)('a')+i) + " " + (char)((int)('a')+i+1));
			assertThat(Practice7.getNextChar((char)((int)('a')+i)), is((char)((int)('a')+i+1)));
		}
		assertThat(Practice7.getNextChar('z'), is('z'));
		System.out.println("===========");
		for(int i=0; i<25; i++){
			System.out.println((char)((int)('A')+i) + " " + (char)((int)('A')+i+1));
			assertThat(Practice7.getNextChar((char)((int)('A')+i)), is((char)((int)('A')+i+1)));
		}
		assertThat(Practice7.getNextChar('Z'), is('Z'));
	}

}
