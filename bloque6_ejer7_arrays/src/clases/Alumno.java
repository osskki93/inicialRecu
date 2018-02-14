package clases;

public class Alumno {
	private String nombre;
	private int numExp;
	private Notas not;
	public Alumno()
	{
		this.nombre=null;
		this.numExp=0;
		this.not=null;
	}
	
	public Alumno (String nombre, int numExp)
	{
		this.nombre=nombre;
		this.numExp=numExp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumExp() {
		return numExp;
	}

	public void setNumExp(int numExp) {
		this.numExp = numExp;
	}

	
	
	public Notas getNot() {
		return not;
	}

	public void setNot(Notas not) {
		this.not = not;
	}

	public void mostrar()
	{
		System.out.println("Alumno: "+this.nombre+" Número expediente: "+this.numExp);
	
		System.out.println("Notas:");
		not.mostrar();
		System.out.println("Nota media:"+not.media());
		
	}
	

}
