package Commands;

import interprete.Context;

public class Quit extends Command {

	@Override
	public String execute(String parameters, Context context) {
		return "exit";
	}

}
