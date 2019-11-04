package br.com.gx2.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.gx2.dao.ContatoDAO;
import br.com.gx2.dao.imp.ContatoDAOImp;
import br.com.gx2.entity.Contato;
import br.com.gx2.factory.dao.exception.DAOException;

public class ContatoBusiness {
	
	
	public boolean verificaContato(String contato) throws DAOException {
		ContatoDAO dao = new ContatoDAOImp();
		Map<String, Object> parametros = new HashMap<String, Object>();
		List<Contato> contatos = dao.findByParams(parametros);
		if(contatos.size()>0)
			return true;
		return false;
	}
	

	public boolean CadastroUsuario(Contato contato) throws DAOException {
		boolean existe = false;
		ContatoDAO dao;
		existe = verificaContato(contato.getNome());
		if(existe) {
			dao = new ContatoDAOImp();
			dao.create(contato);
			return true;
		}
		return false;
	}
	
}