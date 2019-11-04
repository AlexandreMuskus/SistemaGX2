package br.com.gx2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.gx2.entity.Contato;
import br.com.gx2.entity.Estado;
import br.com.gx2.service.EstadoService;
import br.com.gx2.service.imp.EstadoServiceImp;

@ManagedBean
public class EstadoController {

	private Estado estadoSelecionado;
	private EstadoService service;
	private List<Estado> estados = new ArrayList<>();

	public EstadoController() {
		estadoSelecionado = new Estado();
		service = new EstadoServiceImp();
		estados = service.listAll();
	}

	public List<Estado> getContatos() {
		return estados;
	}
}
