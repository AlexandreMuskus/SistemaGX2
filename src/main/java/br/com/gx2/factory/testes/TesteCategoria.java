package br.com.gx2.factory.testes;

import br.com.gx2.dao.CategoriaDAO;
import br.com.gx2.dao.ProdutoDAO;
import br.com.gx2.dao.imp.CategoriaDAOImp;
import br.com.gx2.dao.imp.ProdutoDAOImp;
import br.com.gx2.entity.Categoria;
import br.com.gx2.entity.Produto;
import br.com.gx2.factory.dao.exception.DAOException;

public class TesteCategoria {

	public static void main(String[] args) throws DAOException {
		// TODO Auto-generated method stub
		Categoria c1 = new Categoria(null, "Informática");
//		Categoria c2 = new Categoria(null, "Suprimentos");
//		Categoria c3 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Teclado", 125.0);
//		Produto p2 = new Produto(null, "Caderno", 15.0);
		Produto p3 = new Produto(null, "Computador", 3500.0);
		
		
		
		CategoriaDAO categoriaDAO = new CategoriaDAOImp();
		ProdutoDAO produtoDAO = new ProdutoDAOImp();
		categoriaDAO.create(c1);
		produtoDAO.create(p1);
		produtoDAO.create(p3);
	}
}
