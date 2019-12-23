package com.gm.mundopc;

public class Orden {
	
	private int idOrder;
	private Computadora[] computadoras;
	private static int contadorOrdenes;
	private static int contadorComputadoras;
	private static int maxComputadoras =10;
	
	public Orden() {
		this.idOrder = contadorOrdenes++;
		computadoras = new Computadora[maxComputadoras];
	}
	
	public void agregarComputadora(Computadora computadora) {
		if(contadorComputadoras < maxComputadoras) {
			computadoras[contadorComputadoras++] = computadora;
		}
	}
	
	public void mostrarOrden() {
		System.out.println("Orden #: "+idOrder);
		System.out.println("Orden: ");
		for (int i = 0; i < contadorComputadoras; i++) {
			System.out.println(computadoras[i]);
		}
	}

}
