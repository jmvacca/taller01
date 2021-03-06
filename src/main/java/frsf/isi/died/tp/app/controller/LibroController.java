package frsf.isi.died.tp.app.controller;

import java.util.Calendar;
import java.util.Date;

import frsf.isi.died.tp.modelo.productos.Libro;
import frsf.isi.died.tp.modelo.productos.Relevancia;

public class LibroController {
	
	public static Libro agregarLibro(Integer id, String titulo, Double costo, Double precioCompra, Integer paginas, Date fechaPublicacion, Relevancia relevancia) {
		Libro nuevo = new Libro(id, titulo, costo, precioCompra, paginas, fechaPublicacion, relevancia);
		System.out.println("Se cre� el nuevo libro:"+nuevo);
		//TODO guardar libro en almacenamiento
		return nuevo;
	}

	public static Libro buscarLibro(int id) {
		//creo un nuevo libro para simular la busqueda
		//TODO implementar busqueda de libro
		Libro nuevo = new Libro(id, "Java", 56.4, 41.6, 100, Calendar.getInstance().getTime(), Relevancia.ALTA);
		//TODO buscar libro en el almacenamiento
		return nuevo;
	}

	public static void editarLibro(Libro libro, String titulo, double costo, double precioCompra, int paginas,
			Date fechaPublicacion, Relevancia relevancia) {
		
		libro.setTitulo(titulo);
		libro.setCosto(costo);
		libro.setPrecioCompra(precioCompra);
		libro.setCosto(costo);
		libro.setFechaPublicacion(fechaPublicacion);
		libro.setRelevancia(relevancia);
		
		System.out.println("Se edit� el libro: "+libro);
		//TODO editar libro en el almacenamiento persistente
	}

	public static void eliminarLibro(Libro libro) {
		// TODO eliminar libro del almacenamiento
		System.out.println("Libro Eliminado: "+libro);
	}
	
}
