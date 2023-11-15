package Yavirac2.Andres.estudiante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app/est")
@CrossOrigin({ "*" })
public class EstudianteController {
       @Autowired
    private EstudianteServices estudianteServices;

    @PostMapping("/Create")
    public Estudiante save(@RequestBody Estudiante entity) {
        return estudianteServices.save(entity);
    }

    @GetMapping("/{id}/")
    public Estudiante read(@PathVariable Long id) {
        return estudianteServices.findById(id);
    }

    @PostMapping("/{id}/")
    public Estudiante update(@RequestBody Estudiante entity) {
        return estudianteServices.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable int id) {
        estudianteServices.deleteById(id);
    }

    @GetMapping("/") 
    public List<Estudiante> findAll() {
        return estudianteServices.findAll();
    }
}
