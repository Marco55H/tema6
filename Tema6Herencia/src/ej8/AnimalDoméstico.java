package ej8;

/**
 * Clase padre de los animales domésticos en la que implementamos la interfaz
 */
abstract public class AnimalDoméstico implements Animal{

	/**
	 * Atributo que nos dará el nombre del animal
	 */
	private String nombre;
	/**
	 * Atributo que nos dará la raza del animal
	 */
	private String raza;
	/**
	 * Atributo que nos dará el color del animal
	 */
	private String color;
	/**
	 * Atributo que nos dará el peso del animal
	 */
	private double peso; 
	
	
	
	/**
	 * Constructor con parámetros
	 * @param nombre
	 * @param raza
	 * @param color
	 * @param peso
	 */
	public AnimalDoméstico(String nombre, String raza, String color, double peso) {
		super();
		if(nombre!= null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(raza!= null && !raza.equals("")) {
			this.raza = raza;
		}
		if(color!= null && !color.equals("")) {
			this.color = color;
		}
		if(peso>0) {
			this.peso = peso;
		}
		
	}
	
	/**
	 * Método de vacuna
	 */
	public void  vacunar() {
		System.out.println("Vacunado");
	}
	
	/**
	 * 
	 */
	abstract public boolean hacerCaso();
	
	/**
	 * 
	 */
	@Override
	public void comer() {
		peso++;
		System.out.println("Ñam");
		
	}

	/**
	 * 
	 */
	@Override
	public void dormir() {
		System.out.println("ZZZ");
		
	}

	/**
	 * 
	 */
	@Override
	public abstract void hacerRuido();
	
	

}
