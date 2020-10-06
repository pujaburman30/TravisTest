package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class SampleApplicationTest {
	
	@Test
	public void testPrint() {
		assertEquals(SampleApplication.print(),"Hello World");
	}
}
