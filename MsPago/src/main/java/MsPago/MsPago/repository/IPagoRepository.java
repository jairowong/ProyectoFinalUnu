package MsPago.MsPago.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPagoRepository extends CrudRepository<PagoModel, Integer> {   

    
}
