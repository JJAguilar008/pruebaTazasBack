package com.test.spring.boot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tazas")
public class Taza implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTaza;
	@Column(nullable = false)
	private String calidad;
	@Column(nullable = false)
	private int capacidad;
	@Column(nullable = false)
	private String color;
	@Column(nullable = false)
	private String material;
	@Column(nullable = false)
	private String modelo;
	private int cantidad;

	public Long getIdTaza() {
		return idTaza;
	}

	public void setIdTaza(Long idTaza) {
		this.idTaza = idTaza;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
