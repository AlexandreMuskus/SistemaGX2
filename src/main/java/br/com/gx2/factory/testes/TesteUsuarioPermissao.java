package br.com.gx2.factory.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.gx2.dao.PermissaoDAO;
import br.com.gx2.dao.UsuarioDAO;
import br.com.gx2.dao.imp.PermissaoDAOImp;
import br.com.gx2.dao.imp.UsuarioDAOImp;
import br.com.gx2.entity.Permissao;
import br.com.gx2.entity.Usuario;
import br.com.gx2.factory.dao.exception.DAOException;

public class TesteUsuarioPermissao{
	public static void main(String[] args) throws DAOException {
		
		Permissao p1 = new Permissao(null, null, "Teclado");
		List<Permissao> pl = new ArrayList<Permissao>();
		pl.add(p1);
		
		Usuario u1 = new Usuario(pl, null, "Alexandre Muskus Pawlowski", "19-03-1980", "Analista");
		
		PermissaoDAO permissaoDAO = new PermissaoDAOImp();
		permissaoDAO.create(p1);
		UsuarioDAO usuarioDAO = new UsuarioDAOImp();
		usuarioDAO.create(u1);
	}
}
