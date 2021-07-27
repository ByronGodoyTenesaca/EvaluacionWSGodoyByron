package ec.edu.ups.EvaluacionWSGodoyTenesaca.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EvaluacionWSGodoyTenesaca.DAO.TituloDAO;
import ec.edu.ups.EvaluacionWSGodoyTenesaca.modelo.Estudiante;
import ec.edu.ups.EvaluacionWSGodoyTenesaca.modelo.Titulo;

@Stateless
public class TituloON {

	@Inject
	private TituloDAO daoTitulo;
	
	public void insertarTitulo(Titulo t) {
		daoTitulo.ingresarTitulo(t);
	}
	
	public List<Estudiante> buscarTitulo(Titulo t){
		
		List<Estudiante> es=daoTitulo.buscarTitulos(t);
		return es;
	}
}
