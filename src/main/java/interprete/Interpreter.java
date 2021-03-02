package interprete;

import java.util.*;
import Commands.*;

public class Interpreter {
    
	private Map<String, Command> commandsPool;
	private Context contexto;
	
    Interpreter(){
    	this.contexto = new Context();
    	Command cd = new Cd();
    	Command ls = new Ls();
    	Command mkdir = new Mkdir();
    	Command pwd = new Pwd();
    	Command quit = new Quit();
    	Command touch = new Touch();
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
    		return commandsPool.get(command).execute(parameters, contexto);
    	} catch(Exception e) {
    		System.out.println(e.getMessage());
    		return unrecognizedCommand;
    	}
//            
//            if(comando.equals("pwd")){
//            	
//                contexto.addSalida(contexto.carpetaActual.getPath());
//            } else if (comando.contains("mkdir") || comando.contains("touch")){
//                String [] comandoSplit = comando.split(" ");
//                if (comandoSplit.length == 2 && (comandoSplit[0].equals("mkdir") || comandoSplit[0].equals("touch") || comandoSplit[0].equals("cd"))){
//                    if (comandoSplit[1].length()>100){
//                        contexto.addSalida("Invalid File or Folder Name");
//                    } else {
//                        if (comandoSplit[0].equals("mkdir")){
//                            if (!contexto.crearCarpeta(comandoSplit[1])){
//                                contexto.addSalida("Directory already exists");
//                            }
//                        } else if (comandoSplit[0].equals("cd")){
//                            //cd
//                        } else {
//                            // touch
//                            
//                        }
//                    }
//                } else {
//                    contexto.addSalida(invalidCommand);
//                }
//            } else if (comando.equals("quit")){
//                
//            } else {
//                contexto.addSalida(unrecognizedCommand);
//            }
//        }
    }
}
