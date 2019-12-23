package com.gm.mundopc;

public class Monitor {
	
	private int idMonitor;
	private String marca;
	private double tamaño;
	private static int contadorMonitores;
	
	private Monitor() {
		idMonitor = contadorMonitores++;
	}
	
	public Monitor(String marca,Double tamaño) {
		this();
		this.marca = marca;
		this.tamaño = tamaño;
	}


	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private double getTamaño() {
		return tamaño;
	}

	private void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	private static int getContadorMonitores() {
		return contadorMonitores;
	}

	private static void setContadorMonitores(int contadorMonitores) {
		Monitor.contadorMonitores = contadorMonitores;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamaño + "]";
	}
	
	

}
