package commands;

import interprete.Context;

public class Pwd extends Command {

	public Pwd(Context context) {
		super(context);
	}

	@Override
	public String execute(String parameters) {
		return context.getCarpetaActual().getPath();
	}

}
