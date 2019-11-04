package br.com.gx2.service.imp;

import java.util.ArrayList;
import java.util.List;

import br.com.gx2.dao.EstadoDAO;
import br.com.gx2.dao.imp.EstadoDAOImp;
import br.com.gx2.entity.Estado;
import br.com.gx2.service.EstadoService;

public class EstadoServiceImp implements EstadoService {

//	@Override
	public boolean create(Estado estado) {
		try {
			EstadoDAO dao = new EstadoDAOImp();
			dao.create(estado);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

//	@Override
	public boolean update(Estado estado) {
		try {
			EstadoDAO dao = new EstadoDAOImp();
			dao.update(estado);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public boolean delete(Estado estado) {
		try {
			EstadoDAO dao = new EstadoDAOImp();
			dao.delete(estado);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public Estado findById(Estado estado) {
		Estado response = new Estado();
		try {
			EstadoDAO dao = new EstadoDAOImp();
			response = dao.findById(estado.getId());
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	@Override
	public List<Estado> listAll() {
		List<Estado> response = new ArrayList<Estado>();
		try {
			EstadoDAO dao = new EstadoDAOImp();
			response = dao.listAll();
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
