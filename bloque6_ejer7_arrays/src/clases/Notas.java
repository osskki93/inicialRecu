package clases;

import java.util.Scanner;

public class Notas {
	private double notas[];
	
	public Notas()
	{
		this.notas=new double[5];
	}
	
	public void leer()
	{
		int i;
		Scanner sc=new Scanner(System.in);
		for (i=0; i<this.notas.length;i++)
		{
			System.out.println("Introduce la nota: "+i);
			this.notas[i]=sc.nextDouble();
		}
	}
	public double media()
	{
		double med=0;
		int i;
		for (i=0; i<this.notas.length;i++)
		{
			med=med+this.notas[i];
		}
		med=med/this.notas.length;
		return med;
	}
	public void mostrar()
	{
		int i;
		for (i=0; i<this.notas.length;i++)
		{
			System.out.println("Nota asignatura: "+i+" :"+this.notas[i]);
		}
	}

}
