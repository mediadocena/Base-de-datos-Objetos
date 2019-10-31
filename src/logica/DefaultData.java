package logica;

import java.util.ArrayList;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import modelos.Articulos;
import modelos.Clientes;
import modelos.Ventas;

public class DefaultData {
public static void main(String [] args) {
		ObjectContainer bd =Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"tienda.db4o");
		Clientes cli1 = new Clientes(1,"Antonio Ruiz","Talavera");
		Clientes cli2 = new Clientes(2,"La Alameda S.L.","Talavera");
		Clientes cli3 = new Clientes(7,"Los molinos CB","Madrid");
		Clientes cli4 = new Clientes(8,"Pedro Mor�n S.L.","Talavera");
		Clientes cli5 = new Clientes(12,"Azulejos Mart�n S.L.","Talavera");
		Clientes cli6 = new Clientes(15,"Bar Girasol","Oropesa");
		Clientes cli7 = new Clientes(9,"Escuela Mayores","Talavera");
		Clientes cli8 = new Clientes(17,"Galer�a Madrid S.L.","Madrid");
		Clientes cli9 = new Clientes(19,"El corte Chino","Talavera");
		Clientes cli10 = new Clientes(20,"UNICAS S.A.","Oropesa");
		Clientes cli11 = new Clientes(21,"Deportivo SAS","Talavera");
		Clientes cli12 = new Clientes(22,"Academia Padel","Madrid");
		Articulos ar1 = new Articulos(1,"Mesas", 30, (float)100.5);
		Articulos ar2 = new Articulos(2,"Pupitres", 10, (float)150.7);
		Articulos ar3 = new Articulos(6,"Cuadernos", 100, (float)4.5);
		Articulos ar4 = new Articulos(8,"Tabletas", 10, (float)175.4);
		Articulos ar5 = new Articulos(9,"Bol�grafos", 100, (float)3.5);
		Articulos ar6 = new Articulos(10,"Lapiceros", 300, (float)2.5);
		Articulos ar7 = new Articulos(14,"Sillas", 30, (float)120.5);
		Articulos ar8 = new Articulos(16,"Port�til", 25, (float)400.5);
		Articulos ar11 = new Articulos(17,"Espejo ba�o", 20, (float)100.5);
		Articulos ar21 = new Articulos(18,"Reloj cocina", 10, (float)20.7);
		Articulos ar31 = new Articulos(20,"Tarjetero", 50, (float)14.5);
		Articulos ar41 = new Articulos(22,"Estuches", 110, (float)20.4);
		Articulos ar51 = new Articulos(23,"Libro BD", 10, (float)23.5);
		Articulos ar61 = new Articulos(24,"Tijeras", 30, (float)5.0);
		Articulos ar71 = new Articulos(25,"Cubiertos", 130, (float)10.5);
		Articulos ar81 = new Articulos(26,"Teclado", 25, (float)40.5);
		
		Ventas v1 = new Ventas (1,ar1,cli1,5,"05/06/2014");
		Ventas v2 = new Ventas (2,ar1,cli2,4,"15/06/2014");
		Ventas v3 = new Ventas (3,ar1,cli6,3,"25/06/2014");
		Ventas v4 = new Ventas (4,ar2,cli6,5,"03/07/2014");
		Ventas v5 = new Ventas (5,ar2,cli7,4,"11/08/2014");
		Ventas v6 = new Ventas (6,ar3,cli1,3,"25/04/2014");
		ArrayList<Ventas> vl1 = new ArrayList();
		vl1.add(v1);
		vl1.add(v2);
		vl1.add(v3);
		ArrayList<Ventas> vl2 = new ArrayList();
		vl2.add(v4);
		vl2.add(v5);
		ArrayList<Ventas> vl3 = new ArrayList();
		vl3.add(v6);
		ArrayList<Ventas> vl0 = new ArrayList();
		ar1.setCompras(vl1);
		ar2.setCompras(vl2);
		ar3.setCompras(vl3);
		
		
		bd.store(cli1);
		bd.store(cli2);
		bd.store(cli3);
		bd.store(cli4);
		bd.store(cli5);
		bd.store(cli6);
		bd.store(cli7);
		bd.store(cli8);
		bd.store(cli9);
		bd.store(cli10);
		bd.store(cli11);
		bd.store(cli12);
		
		
		bd.store(ar1);
		bd.store(ar2);
		bd.store(ar3);
		bd.store(ar4);
		bd.store(ar5);
		bd.store(ar6);
		bd.store(ar7);
		bd.store(ar8);
		bd.store(ar11);
		bd.store(ar21);
		bd.store(ar31);
		bd.store(ar41);
		bd.store(ar51);
		bd.store(ar61);
		bd.store(ar71);
		bd.store(ar81);
		
		
		
		bd.store(v1);
		bd.store(v2);
		bd.store(v3);
		bd.store(v4);
		bd.store(v5);
		bd.store(v6);
		
		bd.close();
		}
}