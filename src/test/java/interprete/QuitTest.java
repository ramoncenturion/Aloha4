package interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import commands.Quit;

class QuitTest {


	static Context context;
	static Quit quit;
	
	@BeforeAll
	static void setup() {
		context = new Context();
		quit = new Quit(context);
	}
	
	@Test
	void testExecution() {
		assertEquals("exit",quit.execute(""));
	}

}
