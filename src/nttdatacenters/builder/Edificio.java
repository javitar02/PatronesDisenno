package nttdatacenters.builder;

//Clase edificio
public class Edificio {
	//Atributos
	private int numPlantas;
	private int numTrabajadores;
	
	//Constructor
	public Edificio(int numPlantas, int numTrabajadores) {
		super();
		this.numPlantas = numPlantas;
		this.numTrabajadores = numTrabajadores;
	}
	
	//Getters-Setters
	public int getNumPlantas() {
		return numPlantas;
	}
	
	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	//To string
	@Override
	public String toString() {
		return "Edificio [numPlantas=" + numPlantas + ", numTrabajadores=" + numTrabajadores + "]";
	}
	
	
}
