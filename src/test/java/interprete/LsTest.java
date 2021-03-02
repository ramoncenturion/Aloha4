package interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import commands.Ls;
import commands.Mkdir;

class LsTest {
	

	static Context context;
	static Ls ls;
	
	@BeforeAll
	static void setup() {
		Context context = new Context();
		Mkdir mkdir = new Mkdir(context);
		mkdir.execute("carpeta");
		ls = new Ls(context);
	}
	
	@Test
	void testExecution() {
		System.out.print(ls.execute(""));
		assertEquals("carpeta"+System.lineSeparator(),ls.execute(""));
	}

}
