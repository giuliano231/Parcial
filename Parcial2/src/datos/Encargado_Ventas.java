package datos;

import java.util.LinkedList;

import javax.swing.JOptionPane;




public class Encargado_Ventas {

	private String nombre;
	private String apellido;
	private String Dni;
	
	public Encargado_Ventas(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		Dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	@Override
	public String toString() {
		return "Encargado_Ventas [nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + "]";
	}
	
	public static void SacarCafeMasVendido(LinkedList<Venta> Lista_De_Ventas) {
		int cont_Latte=0;
		int cont_Flat_White=0;
		int cont_Lágrima=0;
		int cont_Expresso=0;
		for (Venta Venta : Lista_De_Ventas) {
			for (int i = 0; i < Lista_De_Ventas.size(); i++) {
				
				switch (Lista_De_Ventas.get(i).getCafe()) {
			
				case "Latte":
					cont_Latte= + Lista_De_Ventas.indexOf(Lista_De_Ventas.get(i).getCantidad());
					
					break;
					
				case "Flat White":
					
					cont_Flat_White= + Lista_De_Ventas.indexOf(Lista_De_Ventas.get(i).getCantidad());
					break;
					
				case "Lágrima":
					cont_Lágrima= + Lista_De_Ventas.indexOf(Lista_De_Ventas.get(i).getCantidad());
					break;
					
				case "Expresso":
					cont_Expresso= + Lista_De_Ventas.indexOf(Lista_De_Ventas.get(i).getCantidad());
					break;
				
				}
				}
		}	
		
		if (cont_Latte>cont_Flat_White && cont_Latte>cont_Lágrima &&cont_Latte>cont_Expresso) {
			JOptionPane.showMessageDialog(null, "El cafe mas vendido fue "+ "Latte " +"Que se vendio "+cont_Latte+ " veces el dia de hoy");
		}else if (cont_Flat_White>cont_Latte && cont_Flat_White>cont_Lágrima &&cont_Flat_White>cont_Expresso) {
			JOptionPane.showMessageDialog(null, "El cafe mas vendido fue "+ "Flat White " +"Que se vendio "+cont_Flat_White+ " veces el dia de hoy");
		}else if (cont_Lágrima>cont_Latte && cont_Lágrima>cont_Flat_White &&cont_Lágrima>cont_Expresso) {
			JOptionPane.showMessageDialog(null, "El cafe mas vendido fue "+ "Lágrima " +"Que se vendio "+cont_Lágrima+ " veces el dia de hoy");
		}else if(cont_Expresso>cont_Latte && cont_Expresso>cont_Flat_White &&cont_Expresso>cont_Lágrima){
			JOptionPane.showMessageDialog(null, "El cafe mas vendido fue "+ "Expresso " +"Que se vendio "+cont_Expresso+ " veces el dia de hoy");
		}
	
	}
	
	public static void MostrarVentas(LinkedList<Venta> Lista_De_Ventas ){
		for (Venta Venta : Lista_De_Ventas) {
			JOptionPane.showMessageDialog(null, Venta.getId_venta() + " Se vendio "+ Venta.getCantidad()+ " Cafes  " + Venta.getCafe());
			
		}
	} 
	
	public static void MostrarDescuentos(LinkedList<Venta> Lista_De_Ventas ){
		for (Venta Venta : Lista_De_Ventas) {
			if(Venta.getTarjeta_Socio()==true){
				JOptionPane.showMessageDialog(null, Venta.getId_venta() + " Se vendio "+ Venta.getCantidad()+ " Cafes  " + Venta.getCafe()+ " Y como era socio tuvo un 15% de descuento");	
			}
			
		}
	} 
}
