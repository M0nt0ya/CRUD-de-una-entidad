package Yavirac2.Andres.instituto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutoServices {

    @Autowired
    private InstitutoRepository institutoRepository;

    public Instituto save(Instituto entity) {
        return institutoRepository.save(entity);
    }

    public Instituto findById(Long id) {
        return institutoRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        institutoRepository.deleteById(id);
    }

    public List<Instituto> findAll(){
        return institutoRepository.findAll();
    } 
}