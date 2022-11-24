package nttdatacenters.main;

import nttdatacenters.builder.Edificio;
import nttdatacenters.builder.EdificioBuilder;
import nttdatacenters.prototype.VideojuegoImpl;
import nttdatacenters.singleton.Equipo;

//Clase Principal para hacer pruebas
public class Principal {

	public static void main(String[] args) {
		//-----------SINGLETON-----------
		Equipo eq = Equipo.getEquipo();
		eq.jugarPartido();
		
		//-----------BUILDER-------------
		EdificioBuilder eb = new EdificioBuilder();
		eb.setNumPlantas(2);
		eb.setNumTrabajadores(10);
		eb.abrirEdificio();
		
		Edificio ed = eb.getEdificio();
		System.out.println(ed);
		
		//-----------BUILDER-------------
		VideojuegoImpl original = new VideojuegoImpl();
		original.setEdicion(23);
		
		VideojuegoImpl clon = (VideojuegoImpl) original.clonar();
		VideojuegoImpl clon2 = new VideojuegoImpl();
		
		if(clon != null) {
			System.out.println(original);
		}
		
		System.out.println(clon);
		System.out.println(clon2);
	}

}
