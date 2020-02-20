package com.desycom.ifacesimpl;

import com.desycom.ifaces.IValidaLogin;

public class IValidaLoginImpl implements IValidaLogin{

	public String testServicio() {
		StringBuilder cadena = new StringBuilder();
		
		cadena.append("PRIMERO");
		cadena.append("\n");
		cadena.append("VALORES");
		System.out.println(cadena.toString());
		return cadena.toString();
	}

}
