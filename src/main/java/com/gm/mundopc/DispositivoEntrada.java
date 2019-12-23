package com.gm.mundopc;

public class DispositivoEntrada {
	
	private String tipoEntrada;
	private String marca;
	
	public DispositivoEntrada(String tipoEntrada,String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	private String getTipoEntrada() {
		return tipoEntrada;
	}

	private void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "DispositivoEntrada [tipoEntrada=" + tipoEntrada + ", marca=" + marca + "]";
	}
	
	

}
