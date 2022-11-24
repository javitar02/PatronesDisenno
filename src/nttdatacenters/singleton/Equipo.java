package nttdatacenters.singleton;

public class Equipo {
	//Atributo Equipo
	private static Equipo Team; 
	
	//Constructor vacío
	private Equipo() {
		
	}
	
	//Método para recuperar la instancia
	public static Equipo getEquipo() {
		if(Team == null) {
			Team = new Equipo();
		}
		return Team;
	}
	
	//Método de prueba
	public void jugarPartido() {
		System.out.println("Partido Jugado");
	}
}
