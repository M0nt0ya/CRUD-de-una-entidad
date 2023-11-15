package Yavirac2.Andres.estudiante;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServices {
    
    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante save(Estudiante entity) {
        return estudianteRepository.save(entity);
    }

    public Estudiante findById(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        estudianteRepository.deleteById(id);
    }

    public List<Estudiante> findAll(){
        return estudianteRepository.findAll();
    } 
}
