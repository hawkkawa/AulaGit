package com.springmongodb.mongodb.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document() // registro de um colecao
public class Consulta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nomePaciente;
	private String dataConsulta;
	
	@DBRef
	private Medico medico;

	public Consulta(String id, String nomePaciente, String dataConsulta, Medico medico) {
		this.id = id;
		this.nomePaciente = nomePaciente;
		this.dataConsulta = dataConsulta;
		this.medico = medico;
	}

	public Consulta() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	
	
}
