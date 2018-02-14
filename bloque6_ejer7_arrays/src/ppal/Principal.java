package ppal;

import clases.Alumno;
import clases.Notas;

public class Principal {

	public static void main(String[] args) {
		Alumno al1=new Alumno();
		Notas n1=new Notas();
		al1.setNombre("Pepe");
		al1.setNumExp(123);
		n1.leer();
		al1.setNot(n1);
		al1.mostrar();
		

	}

}
