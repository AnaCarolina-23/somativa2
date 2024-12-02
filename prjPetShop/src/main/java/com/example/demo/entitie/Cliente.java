package com.example.demo.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clienId;

	@NotNull
	private String clienNome;
	
	@NotNull
	private String clienTel;
	
	@NotNull
	private String clienEmail;

	
	public Long getClienId() {
	    return clienId;
	}
	public void setClienId(Long clienId) {
	    this.clienId = clienId;
	}

	public String getClienNome() {
	    return clienNome;
	}
	public void setClienNome(String clienNome) {
	    this.clienNome = clienNome;
	}

	public String getClienTel() {
	    return clienTel;
	}
	public void setClienTel(String clienTel) {
	    this.clienTel = clienTel;
	}

	public String getClienEmail() {
	    return clienEmail;
	}
	public void setClienEmail(String clienEmail) {
	    this.clienEmail = clienEmail;
	}

}