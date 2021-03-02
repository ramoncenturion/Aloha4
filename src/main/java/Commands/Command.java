package Commands;

import interprete.Context;

public abstract class Command {

	public abstract String execute(String parameters, Context context);
}
