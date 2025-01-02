package MsPago.MsPago;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import MsPago.MsPago.model.PagoModel;
import MsPago.MsPago.repository.IPagoRepository;

@Service
public class PagoService {
    
    @Autowired
    private IPagoRepository pagoRepository;
    
    public PagoModel save(PagoModel pago) {
        return pagoRepository.save(pago);
    }
    
    public List<PagoModel> findAll() {
        return pagoRepository.findAll();
    }
    
    public Optional<PagoModel> findById(int id) {
        return pagoRepository.findById(id);
    }
    
    public void deleteById(int id) {
        pagoRepository.deleteById(id);
    }
    
}
