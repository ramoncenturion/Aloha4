package commands;

import interprete.Context;

public abstract class Command {

	public Context context;
	
	Command(Context context){
		this.context = context;
	}
	
	public abstract String execute(String parameters);
}
