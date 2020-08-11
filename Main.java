import java.util.ArrayList;

public class Main {
	
	public static void mostrarProductos (ArrayList<Producto> p) {
		for (int i=0;i<p.size();i++) {
			System.out.println(p.get(i));
		}
	}
	
	public static void calcularPrecio (ArrayList<Producto> p) {
		System.out.println("analizando....");
		double precio = 0.00d;
		double iva = 0.00d;
		double total = 0.00d;
		for (int i=0;i<p.size();i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.09;
			total = precio+iva;
			p.get(i).setPrecio(total);
			
		}
		}
	
	
public static void main(String[] args) {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		Producto p1 = new Producto(1512, "pollo", 12.20, 12, 06, 2020, " funda de pollo ");
		Producto p2 = new Producto (1512, "carne", 12.20, 20, 04, 2020, " funda de carne");
	    Producto p3  = new Producto(5630, "aceite", 5.00, 10, 01, 2021, "funda de aceite");
	    
	   productos.add(p1);
       productos.add(p2);
       productos.add(p3);
	 
	    calcularPrecio(productos);
	    
}
}

	    
	    
		