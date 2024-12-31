package MsPago.MsPago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("api/pago")
public class PagoController {
    private Logger logger = LoggerFactory.getLogger(clazz:PagoController.class);
    
    @Autowired
    private PagoService alumnoService;

    @Autowired
    private UtilsProperties prop;

    @GetMapping("/getAll")
    public String getAll() {
        Map<String, Object> salida = new HashMap<>(), Object> ();
        try {
            List<PagoModel> lista = alumnoService.findAll();

            List<PagoDTO> listaDTO = lista.stream().map(x -> {
                ModeMapper m.map(x, PagoDTO.class);
            }        }    
        return alumnoService.getAll() {
            Map<String, Object> salida = new HashMap<>();
        }
    
}
