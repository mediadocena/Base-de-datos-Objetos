package modelos;

import java.util.ArrayList;

public class Articulos {
	private int codarti;
	private String denom;
	private int stock;
	private float pvp;
	private ArrayList<Ventas> Compras;
	
	public Articulos(int codarti, String denom, int stock, float pvp, ArrayList<Ventas> compras) {
		super();
		this.codarti = codarti;
		this.denom = denom;
		this.stock = stock;
		this.pvp = pvp;
		Compras = compras;
	}
	public Articulos(int codarti, String denom, int stock, float pvp) {
		super();
		this.codarti = codarti;
		this.denom = denom;
		this.stock = stock;
		this.pvp = pvp;
	
	}
	
	
	@Override
	public String toString() {
		return "Articulos [codarti=" + codarti + ", denom=" + denom + ", stock=" + stock + ", pvp=" + pvp + "]";
	}


	public int getCodarti() {
		return codarti;
	}
	public void setCodarti(int codarti) {
		this.codarti = codarti;
	}
	public String getDenom() {
		return denom;
	}
	public void setDenom(String denom) {
		this.denom = denom;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public float getPvp() {
		return pvp;
	}
	public void setPvp(float pvp) {
		this.pvp = pvp;
	}
	public ArrayList<Ventas> getCompras() {
		return Compras;
	}
	public void setCompras(ArrayList<Ventas> compras) {
		Compras = compras;
	}
	
	
	
}
