package commands;

import interprete.Context;

public class Quit extends Command {

	public Quit(Context context) {
		super(context);
	}

	@Override
	public String execute(String parameters) {
		return "exit";
	}

}
