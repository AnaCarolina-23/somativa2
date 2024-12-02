package com.example.demo.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long petId;

	@NotNull
	private String petNome;

	@NotNull
	private String petTipo;
	
	@NotNull
	private String petRaca;

	@NotNull
	private double petIdade;

	@ManyToOne
	@JoinColumn(name = "clienId")
	private Cliente cliente;

	public Long getPetId() {
		return petId;
	}
	public void setId(Long petId) {
		this.petId = petId;
	}

	public String getPetNome() {
		return petNome;
	}
	public void setPetNome(String petNome) {
		this.petNome = petNome;
	}

	public String getPetTipo() {
		return petTipo;
	}
	public void setPetTipo(String petTipo) {
		this.petTipo = petTipo;
	}

	public String getPetRaca() {
		return petRaca;
	}
	public void setPetRaca(String petRaca) {
		this.petRaca = petRaca;
	}
	
	public double getPetIdade() {
		return petIdade;
	}
	public void setPetIdade(double petIdade) {
		this.petIdade = petIdade;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}