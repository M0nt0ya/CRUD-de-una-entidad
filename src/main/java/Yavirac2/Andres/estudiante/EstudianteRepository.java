package Yavirac2.Andres.estudiante;


import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends CrudRepository<Estudiante,Long>{
        List<Estudiante>findAll();
}
