package com.desycom.desarrollos;

import com.desycom.ifaces.IValidaLogin;
import com.desycom.ifacesimpl.IValidaLoginImpl;

public class DesarrollosGda {

	public static void main(String[] args) {
		IValidaLoginImpl iValidaLoginImpl = new IValidaLoginImpl();
		System.out.println(iValidaLoginImpl.testServicio());

	}

}
