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
	
	public Titulo buscarT(String nombre) {
		
		Titulo t=em.find(Titulo.class,nombre);
		
		return t;
	}
	
	public List<Object[]> buscarTitulos(String t) {
		
		String sql="SELECT * FROM public.estudiante,public.titulo where titulo.titulo like '%"+t+"%' and estudiante.titulo_codigo=titulo.codigo";
		Query query= em.createNativeQuery(sql);
		
		List<Object[]> est=query.getResultList();
		
		return est;
	}
}
