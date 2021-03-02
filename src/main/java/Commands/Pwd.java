package Commands;

import interprete.Context;

public class Pwd extends Command {

	@Override
	public String execute(String parameters, Context context) {
		return context.getCarpetaActual().getPath();
	}

}
