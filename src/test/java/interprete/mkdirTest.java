package interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import commands.Mkdir;

class mkdirTest {
	
	static Context context;
	static Mkdir mkdir;
	
	@BeforeAll
	static void setup() {
		context = new Context();
		mkdir = new Mkdir(context);
	}
	@Test
	void testExecution() {
		String nameDir = "carpeta";
		mkdir.execute(nameDir);
		assertTrue(context.carpetaActual.getDirectories().containsKey(nameDir));
	}

}
