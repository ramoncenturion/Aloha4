package interprete;

import java.util.ArrayList;
import java.util.List;

public class Context {

	List<String> entradas = new ArrayList<>();
	List<String> salida = new ArrayList<>();
	Directory carpetaActual;
	
	public Context() {
		this.carpetaActual = new Directory("root","carpeta");
	}

    public List<String> getSalida(){
        return salida;
    }
    
    public List<String> getEntradas(){
        return entradas;
    }
    
    public void addEntrada(String entrada){
        this.entradas.add(entrada);
    }
    
    public void addSalida(String salida){
        this.salida.add(salida);
    }

	public Directory getCarpetaActual() {
		return carpetaActual;
	}

	public void setCarpetaActual(Directory carpetaActual) {
		this.carpetaActual = carpetaActual;
	}

	public void setEntradas(List<String> entradas) {
		this.entradas = entradas;
	}

	public void setSalida(List<String> salida) {
		this.salida = salida;
	}
    
}
