package logica;

import Utiles.Salieri;
import modelos.Articulos;
import modelos.Clientes;
import modelos.Ventas;

public class menu {

	
	public void Menu() {
		int opcion;
		funcionalidades f = new funcionalidades();
		Salieri ex = new Salieri();
		do {
		opcion = ex.controlaenteroSt(
				"1-visualizar datos de ventas. \n"
				+ " 2-Informacion de artículos. \n"
				+ " 3-Informe Clientes. \n"
				+ " 4-Artículo mas vendido. \n"
				+ " 5-Media de importe ventas por artículo. \n"
				+ " 6-Cliente que mas ha gastado. \n"
				+ " 7-Cliente con mas ventas. \n"
				+ " 8-Salir"
				);
		switch(opcion) {
		case 1:
			Ventas v = new Ventas(ex.controlaenteroSt("Codigo Venta:"),null, null, 0, null);
			f.VisualizarVentas(v);
			break;
		case 2:
			Articulos a = new Articulos(0,null,0,0);
			f.VisualizarArticulos(a);
			break;
		case 3:
			Clientes c = new Clientes(0,null,null);
			f.VisualizarClientes(c);
			break;
		case 4:
			
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		}
		
	
		}while(opcion!=8);

	}
}