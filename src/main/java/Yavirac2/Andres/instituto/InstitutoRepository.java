package Yavirac2.Andres.instituto;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface InstitutoRepository extends CrudRepository<Instituto,Long>{
    List<Instituto>findAll();
}
