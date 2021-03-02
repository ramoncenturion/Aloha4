package interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import commands.Touch;

class TouchTest {
	static Touch touch;
	static Context context;
	
	@BeforeAll
	static void setup() {
		context = new Context();
		touch = new Touch(context);
	}
	
	@Test
	void testExecution() {
		String nameFile = "archivo";
		touch.execute(nameFile);
		assertTrue(context.carpetaActual.getFiles().containsKey(nameFile));
	}

}
