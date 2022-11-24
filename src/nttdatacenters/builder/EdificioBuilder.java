package nttdatacenters.builder;

//Clase builder de edificio que contiene solo los setters 
public class EdificioBuilder implements IEdificio{
	//Atributos
	private int numPlantas;
	private int numTrabajadores;

	//Setters
	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	//Método implementado de la interfaz
	@Override
	public void abrirEdificio() {
		System.out.println("Edificio abierto");
		
	}
	
	//Método para recuperar la instancia 
	public Edificio getEdificio() {
		return new Edificio(numPlantas, numTrabajadores);
	}
}
