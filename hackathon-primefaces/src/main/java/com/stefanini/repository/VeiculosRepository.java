package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Denuncia;
import com.stefanini.model.Veiculos;

public class VeiculosRepository {

	@Inject
	private EntityManager manager;

	public void incluir(Veiculos veiculos) {
		this.manager.persist(veiculos);
	}

	public void altera(Veiculos veiculos) {
		this.manager.merge(veiculos);
	}

	public Veiculos busca(Integer placa) {
		return this.manager.find(Veiculos.class, placa);
	}

	public List<Veiculos> lista() {
		return this.manager.createQuery("select v from veiculos v", Veiculos.class)
				.getResultList();
	}
}
