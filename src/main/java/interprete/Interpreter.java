package interprete;

import java.util.*;

import commands.*;

public class Interpreter {
    
	private Map<String, Command> commandsPool;
	private Context contexto;
	
    Interpreter(){
    	this.contexto = new Context();
    	Command cd = new Cd(contexto);
    	Command ls = new Ls(contexto);
    	Command mkdir = new Mkdir(contexto);
    	Command pwd = new Pwd(contexto);
    	Command quit = new Quit(contexto);
    	Command touch = new Touch(contexto);
    	this.commandsPool = new HashMap<String, Command>();
    	this.commandsPool.put("cd",cd);
    	this.commandsPool.put("ls",ls);
    	this.commandsPool.put("mkdir",mkdir);
    	this.commandsPool.put("pwd",pwd);
    	this.commandsPool.put("quit",quit);
    	this.commandsPool.put("touch",touch);
    }
    
    public String interpretar(String line){
        String command;
        String parameters;
        String [] split;
        String unrecognizedCommand = "Unrecognized Command";
    	
        try {
    		split = line.split(" ",0);
    		command = split[0];
    		parameters = split.length > 1? split[1] : "" ;
    		return commandsPool.get(command).execute(parameters);
    	} catch(Exception e) {
    		System.out.println(e.getMessage());
    		return unrecognizedCommand;
    	}
    }
}
