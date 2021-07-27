package ec.edu.ups.EvaluacionWSGodoyTenesaca.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EvaluacionWSGodoyTenesaca.modelo.Titulo;
import ec.edu.ups.EvaluacionWSGodoyTenesaca.modelo.Estudiante;

@Stateless
public class TituloDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void ingresarTitulo(Titulo t) {
		em.persist(t);
	}
	
	public Titulo buscarT(int codigo) {
		
		Titulo t=em.find(Titulo.class,codigo);
		
		return t;
	}
	
	public List<Estudiante> buscarTitulos(Titulo t) {
		
		String sql="SELECT e FROM Estudiante es WHERE titulo like ?1";
		Query query= em.createQuery(sql, Estudiante.class);
		
		query.setParameter(1, t);
		
		List<Estudiante> est=query.getResultList();
		
		return est;
	}
}
