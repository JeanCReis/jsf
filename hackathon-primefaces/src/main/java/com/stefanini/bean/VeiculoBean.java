package com.stefanini.bean;

import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Categoria;
import com.stefanini.model.Modelo;
import com.stefanini.model.Proprietario;
import com.stefanini.model.Veiculos;
import com.stefanini.repository.ModeloRepository;
import com.stefanini.service.CategoriaService;
import com.stefanini.service.DenunciaService;
import com.stefanini.service.ModeloService;
import com.stefanini.service.ProprietarioService;
import com.stefanini.service.VeiculosService;

@Named("veiculosMB")
public class VeiculoBean {

	@Inject
	private VeiculosService veiculosService;

	@Inject
	private Veiculos veiculos;
	
	@Inject
	private ProprietarioService proprietarioService;

	@Inject
	ModeloBean modelo;
	
	private void incluir() {
		veiculosService.incluir(veiculos);
	}
	
//	public void incluir() {
//		categoria.setDescricaiCategoria("Esportivo");
//		categoriaService.incluir(categoria);
//		
//		modelo.setDescricaoModelo("Ferrari");
//		modelo.setIdCategoria(categoria);
//		modeloService.incluir(modelo);
//		
//		proprietario.setNome("Jean");
//		proprietarioService.incluir(proprietario);
//		
//		veiculos.setUf("DF");
//		veiculos.setIdModelo(modelo);
//		veiculos.setCpfProprietario(proprietario);
//		veiculosService.incluir(veiculos);
//	}

	public String chamar() {
		return "teste.jsf";
	}

	public VeiculosService getVeiculosService() {
		return veiculosService;
	}

	public void setVeiculosService(VeiculosService veiculosService) {
		this.veiculosService = veiculosService;
	}

	public Veiculos getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}

}
