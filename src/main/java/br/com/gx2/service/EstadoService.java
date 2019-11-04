package br.com.gx2.service;

import java.util.List;

import br.com.gx2.entity.Estado;

public interface EstadoService {

	public boolean create(Estado estado);
	
	public boolean update(Estado estado);
	
	public boolean delete(Estado estado);
	
	public Estado findById(Estado estado);
	
	public List<Estado> listAll();
	
}
