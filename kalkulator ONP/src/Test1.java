import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;

import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1 {
	private TabStack stos = null;
	@BeforeEach
	public void prepare() {
		 stos = new TabStack();
	}
	@Test
	void testStartowy() {
		
		assertEquals("Warto�� isEmpty() powinna by� true, nie false", true, stos.isEmpty());
	    //stos.push("5");
		//stos.push("5");
		Assertions.assertThrows(EmptyStackException.class, ()->stos.pop());
		Assertions.assertThrows(EmptyStackException.class, ()->stos.top());
	}
	
	@Test
	void testWyjatku() {
		
		try{
			stos.pop();
		}
		catch(EmptyStackException e) {
			System.out.println("Program rzuci� wyj�tek");
		}
		
		String wart_1 = "5";
		String wart_2 = "+";
		String wart_3 = "2";
		stos.push(wart_1);
		stos.push(wart_2);
		stos.push(wart_3);
		Assertions.assertSame( wart_3, stos.pop(), "Warto�� wyra�enia nie jest poprawna");
		Assertions.assertSame( wart_2, stos.pop(), "Warto�� wyra�enia nie jest poprawna");
		Assertions.assertSame( wart_1, stos.pop(), "Warto�� wyra�enia nie jest poprawna");
	}
	@Test
	void test1_1() {
		String wart_1 = "5";
		String wart_2 = "2";
		String wart_3 = "+";
		String wart_4 = "2";
		String wart_5 = "3";
		//Assertions.assertEquals( false, stos.isEmpty(), "Warto�� isEmpty() powinna by� false, nie true");
		stos.push(wart_1);
		stos.push(wart_2);
		stos.push(wart_3);
		stos.push(wart_4);
		stos.push(wart_5);
		
		Assertions.assertEquals( false, stos.isEmpty(), "Warto�� isEmpty() powinna by� false, nie true");
		Assertions.assertEquals( wart_5, stos.top(), "Warto�� wyra�enia nie jest poprawna");
		stos.pop();
		Assertions.assertEquals( wart_4, stos.top(), "Warto�� wyra�enia nie jest poprawna");
		stos.pop();
		Assertions.assertEquals( wart_3, stos.top(), "Warto�� wyra�enia nie jest poprawna");
		stos.pop();
		Assertions.assertEquals( wart_2, stos.top(), "Warto�� wyra�enia nie jest poprawna");
		stos.pop();
		Assertions.assertEquals( wart_1, stos.top(), "Warto�� wyra�enia nie jest poprawna");
	}
	@Test
	void test1_2() {
		String wart_1 = "5";
		String wart_2 = "2";
		String wart_3 = "+";
		String wart_4 = "2";
		String wart_5 = "3";
		stos.push(wart_1);
		stos.push(wart_2);
		stos.push(wart_3);
		stos.push(wart_4);
		stos.push(wart_5);
		//Assertions.assertThrows(EmptyStackException.class, ()->stos.pop());		
		Assertions.assertSame( wart_5, stos.pop(), "Warto�� wyra�enia nie jest poprawna");
		Assertions.assertSame( wart_4, stos.pop(), "Warto�� wyra�enia nie jest poprawna");
		Assertions.assertSame( wart_3, stos.pop(), "Warto�� wyra�enia nie jest poprawna");
		Assertions.assertSame( wart_2, stos.pop(), "Warto�� wyra�enia nie jest poprawna");
		Assertions.assertSame( wart_1, stos.pop(), "Warto�� wyra�enia nie jest poprawna");
		
		Assertions.assertEquals( true, stos.isEmpty(), "Warto�� isEmpty() powinna by� true, nie false");
		
		Assertions.assertThrows(EmptyStackException.class, ()->stos.pop());
	}
	@Test
	void test_null() {
		stos.push(null);
		//stos.push("5");
		Assertions.assertNull(stos.pop(),"Pobrana warto�� z wierzchu stosu to nie null");
	}
	@AfterEach
	void cleanup() {
		stos = null;
	}
}
