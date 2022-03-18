package com.singleton.model;

public class Connection {
	
	//Declaración
	private static Connection instance;
	//private static Conexion instancia = new Conexion();
	
	//Para evitar instancia mediante operador "new"
	private Connection() {
		
	}
	
	//Para obtener la instancia unicamente por este metodo
	//Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
	public static Connection getInstance() {
		if(instance == null) {
			instance = new Connection();
		}
		return instance;
	}
	
	//Método de prueba
	public void connect() {
		System.out.println("Me conecté a la BD");
	}
	
	//Método de prueba
	public void desconnect() {
		System.out.println("Me desconecté de la BD");
	}

}
