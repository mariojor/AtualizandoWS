package br.com.droid.fachada;

import java.util.List;

import br.com.droid.dao.AnuncioDAO;
import br.com.droid.interfaces.InterfaceAnuncioDAO;
import br.com.droid.model.Oferta;

public class FachadaAnuncio implements InterfaceAnuncioDAO{
	
	public AnuncioDAO getAnuncioDAOInstance() {
		AnuncioDAO anuncioDAO = new AnuncioDAO();
		return anuncioDAO.getAnuncioDAOInstance();
	}
	public String CadastrarOferta(Oferta ofe) {
	
		return getAnuncioDAOInstance().CadastrarOferta(ofe);
	}
	public List<Oferta> buscarAnuncios() {
		return getAnuncioDAOInstance().buscarAnuncios();
	}

	


}
