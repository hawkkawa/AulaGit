package com.springmongodb.mongodb.service;

import java.util.List;

import com.springmongodb.mongodb.model.Consulta;

public interface ConsultaService {
	
	public List<Consulta> obterTodos();
	
	public Consulta obterPorCod(String cod);
	
	public Consulta criar(Consulta medico);

	public Consulta atualizar(String id, Consulta consulta);
}
