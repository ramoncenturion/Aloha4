package interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import commands.Cd;
import commands.Mkdir;

class CdTest {
	
	static Context context;
	static Cd cd;
	
	@BeforeAll
	static void setup() {
		context = new Context();
		Mkdir mkdir = new Mkdir(context);
		mkdir.execute("carpeta");
		cd = new Cd(context);
	}
	
	@Test
	void testExecution() {
		String nameDir = "carpeta";
		cd.execute(nameDir);
		assertEquals("/root/"+nameDir,context.carpetaActual.getPath());
	}

}
