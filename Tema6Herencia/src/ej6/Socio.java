package ej6;

public class Socio implements Comparable<Socio> {

	private int id = 0;
	private String nombre = "";
	private int edad = 0;

	public Socio(int id, String nombre, int edad) {
		super();
		if (id > 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}

	public int compareTo(Socio p){
		int res = 0;
			if(this.edad < p.edad){
				res = -1;
		} else if(this.edad>p.edad){
			res = 1;
		}
		return res;
		}

	@Override
	public String toString() {
		String res= "Socio \n";
		res+="ID= " + this.id;
		res+="\n nombre= " + this.nombre;
		res+="\n edad= " + this.edad;
		return res;
	}

	
	
}
