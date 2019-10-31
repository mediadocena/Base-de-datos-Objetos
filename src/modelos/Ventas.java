package modelos;

public class Ventas {
	private int codVenta;
	private Articulos codarti;
	private Clientes numcli ;
	private int univen;
	private String fecha;
	
	public Ventas(int codVenta, Articulos codarti, Clientes numcli, int univen, String fecha) {
		super();
		this.codVenta = codVenta;
		this.codarti = codarti;
		this.numcli = numcli;
		this.univen = univen;
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return " codVenta=" + codVenta + ", codarti= " + codarti.getCodarti() +", denominacion:"+codarti.getDenom()+ ", numcli=" + numcli.getNombre() + ", univen=" + univen
				+ ", fecha=" + fecha +", importe:"+codarti.getPvp();
	}

	public int getCodVenta() {
		return codVenta;
	}
	public void setCodVenta(int codVenta) {
		this.codVenta = codVenta;
	}
	public Articulos getCodarti() {
		return codarti;
	}
	public void setCodarti(Articulos codarti) {
		this.codarti = codarti;
	}
	public Clientes getNumcli() {
		return numcli;
	}
	public void setNumcli(Clientes numcli) {
		this.numcli = numcli;
	}
	public int getUniven() {
		return univen;
	}
	public void setUniven(int univen) {
		this.univen = univen;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
