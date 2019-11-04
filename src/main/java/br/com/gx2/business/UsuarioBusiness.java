package br.com.gx2.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.gx2.dao.UsuarioDAO;
import br.com.gx2.dao.imp.UsuarioDAOImp;
import br.com.gx2.entity.Usuario;
import br.com.gx2.factory.dao.exception.DAOException;
import br.com.gx2.util.Criptografia;

public class UsuarioBusiness {
	
	public boolean verificaUsuario(String usuario) throws DAOException {
		UsuarioDAO dao = new UsuarioDAOImp();
		Map<String, Object> parametros = new HashMap<String, Object>();
		List<Usuario> contatos = dao.findByParams(parametros);
		if(contatos.size()>0)
			return true;
		return false;
	}
	

	public boolean CadastroUsuario(Usuario usuario) throws DAOException {
		boolean existe = false;
		UsuarioDAO dao;
		existe = verificaUsuario(usuario.getNome());
		if(existe) {
			dao = new UsuarioDAOImp();
			usuario.setSenha(Criptografia.md5(usuario.getSenha()));
			dao.create(usuario);
			return true;
		}
		return false;
	}
}