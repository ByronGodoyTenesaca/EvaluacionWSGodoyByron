package ec.edu.ups.EvaluacionWSGodoyTenesaca.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EvaluacionWSGodoyTenesaca.DAO.EstudianteDAO;
import ec.edu.ups.EvaluacionWSGodoyTenesaca.modelo.Estudiante;

@Stateless
public class EstudianteON {

	@Inject
	private EstudianteDAO daoEstudiante;
	
	public void actualizarEstudiante(Estudiante e) {
		
		daoEstudiante.actualizar(e);
	}
}
