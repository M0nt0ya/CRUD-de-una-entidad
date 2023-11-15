package Yavirac2.Andres.instituto;

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
@RequestMapping("/app/int")
@CrossOrigin({ "*" })
public class InstitutoController {

    @Autowired
    private InstitutoServices institutoServices;

    @PostMapping("/Create")
    public Instituto save(@RequestBody Instituto entity) {
        return institutoServices.save(entity);
    }

    @GetMapping("/{id}/")
    public Instituto read(@PathVariable Long id) {
        return institutoServices.findById(id);
    }

    @PostMapping("/{id}/")
    public Instituto update(@RequestBody Instituto entity) {
        return institutoServices.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable int id) {
        institutoServices.deleteById(id);
    }

    @GetMapping("/") 
    public List<Instituto> findAll() {
        return institutoServices.findAll();
    }
}
