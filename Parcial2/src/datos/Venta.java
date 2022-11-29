package datos;

public class Venta{

	private int id_venta;
	private String cafe;
	private int cantidad;
	private Boolean Tarjeta_Socio;
	
	public Venta(int id_ventas, String cafe, int cantidad, Boolean tarjeta_Socio) {
		super();
		this.id_venta = id_ventas;
		this.cafe = cafe;
		this.cantidad = cantidad;
		Tarjeta_Socio = tarjeta_Socio;
	}

	public int getId_venta() {
		return id_venta;
	}

	public void setId_venta(int id_ventas) {
		this.id_venta = id_ventas;
	}

	public String getCafe() {
		return cafe;
	}

	public void setCafe(String cafe) {
		this.cafe = cafe;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Boolean getTarjeta_Socio() {
		return Tarjeta_Socio;
	}

	public void setTarjeta_Socio(Boolean tarjeta_Socio) {
		Tarjeta_Socio = tarjeta_Socio;
	}

	@Override
	public String toString() {
		return "Ventas [id_venta=" + id_venta + ", cafe=" + cafe + ", cantidad=" + cantidad + ", Tarjeta_Socio="
				+ Tarjeta_Socio + "]";
	}
	
}
