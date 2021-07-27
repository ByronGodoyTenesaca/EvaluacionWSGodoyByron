package ec.edu.ups.EvaluacionWSGodoyTenesaca.DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.EvaluacionWSGodoyTenesaca.modelo.Estudiante;

@Stateless
public class EstudianteDAO {

	
	@PersistenceContext
	private EntityManager em;
	
	public void actualizar(Estudiante e) {
		em.merge(e);
	}
	
	public Estudiante buscarEstudiante(String cedula) {
		Estudiante es=em.find(Estudiante.class, cedula);
		return es;
	}
}
