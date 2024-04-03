package ej3;

public class ProductoPerecedero extends Producto{
	
	private int diasACaducar;


	public ProductoPerecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		
		if (diasACaducar > 0) {
		this.diasACaducar = diasACaducar;
		}
	}
	
	public  double calcular(int cantProductos) {
		 
	double resultado=0;
	
	
	if(this.diasACaducar==1) {
		resultado=super.calcular(cantProductos)/4;
	}else if(diasACaducar==2){
		resultado=super.calcular(cantProductos)/3;
	}else if(diasACaducar==3){
		resultado=super.calcular(cantProductos)/2;
	}else {
		resultado=super.calcular(cantProductos);
	}
	
	return resultado;
	}
	
	@Override
	public String toString() {
		String cadena=super.toString();
		
		return cadena + "[Dias a Caducar=" + diasACaducar + "]";
	}
}
