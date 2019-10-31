package logica;

import java.util.ArrayList;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import modelos.Articulos;
import modelos.Clientes;
import modelos.Ventas;

public class funcionalidades {
	
	public void VisualizarVentas(Ventas v) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"tienda.db4o");
		ObjectSet res= bd.queryByExample(v);
		while(res.hasNext()) {
			System.out.println(res.next());
		}
		bd.close();
		
	}
	public void VisualizarArticulos(Articulos a) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"tienda.db4o");
		ObjectSet res = bd.queryByExample(a);
		while(res.hasNext()) {
			System.out.println(res.next());
		}
		bd.close();
	}
	public void VisualizarClientes(Clientes c) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"tienda.db4o");
		ObjectSet res = bd.queryByExample(c);
		ArrayList<Clientes> clientes = new ArrayList();
		int ventas=0;
		while(res.hasNext()) {
			clientes.add((Clientes) res.next());
		}
		for(int i=0;i<clientes.size();i++) {
			System.out.println(clientes.get(i));
		}
		bd.close();
	}
}
