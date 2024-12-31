package MsPago.MsPago.service;

import java.util.List;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PagoService {
    @Autowired
    private IPagoRepository pagoRepository;

    public List<PagoModel> getAll() {
        return (List<PagoModel>) pagoRepository.findAll();
    }

    public PagoModel add(PagoModel model) {
        return pagoRepository.save(model);
}

public PagoModel add(PagoModel model) {
    return pagoRepository.save(model);
    }
}
