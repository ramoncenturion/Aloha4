package interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import commands.Pwd;

class PwdTest {

	static Context context;
	static Pwd pwd;
	
	@BeforeAll
	static void setup() {
		context = new Context();
		pwd = new Pwd(context);
	}
	
	@Test
	void testExecution() {
		pwd.execute("");
		assertEquals("/root", context.carpetaActual.getPath());
	}

}
