package MsPago.MsPago.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UtilsProperties {

    @Value("${prop.MS_MNT.GUARDAR}")
    private String MS_MNT_GUARDAR;
    
    @Value("${prop.MS_MNT.LEER}")
    private String MS_MNT_LEER;
    
    @Value("${prop.MS_MNT.ACTUALIZAR}")
    private String MS_MNT_ACTUALIZAR;
    
    @Value("${prop.MS_MNT.ELIMINAR}")
    private String MS_MNT_ELIMINAR;
    
    public String getMS_MNT_GUARDAR() {
        return MS_MNT_GUARDAR;
    }
    
}
