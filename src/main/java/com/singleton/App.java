package com.singleton;

import com.singleton.model.Connection;

public class App {

	public static void main(String[] args) {
		//Instanciación por constructor prohíbido por ser "private"
		//Conexion c = new Conexion();
		Connection c = Connection.getInstance();
		c.connect();
		c.desconnect();
		
		boolean rpta = c instanceof Connection;
		System.out.println(rpta);
	}
	
	//Otro ejemplo en: https://www.youtube.com/watch?v=qiFeiYLzIH8
	//Spring Framework gestiona sus beans como Singleton por defecto
}
