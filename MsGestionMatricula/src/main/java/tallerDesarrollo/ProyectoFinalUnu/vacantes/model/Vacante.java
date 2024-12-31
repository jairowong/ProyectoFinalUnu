package main.java.tallerDesarrollo.ProyectoFinalUnu.vacantes.model;



@En
@Table(name="Vacante")

public class Vacante {

    @Idvacante
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idgrado;
    public int idseccion;
    public int vacantes_disponible;
    public date año_electivo;

    
    public vacante(int idgrado, int idseccion, int vacantes_disponible, date año_electivo) {
        this.idgrado = idgrado;
        this.idseccion = idseccion;
        this.vacantes_disponible = vacantes_disponible;
        this.año_electivo = año_electivo;
    }

    
    public int getIdgrado() {
        return idgrado;
    }
    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
    }
    public int getIdseccion() {
        return idseccion;
    }
    public void setIdseccion(int idseccion) {
        this.idseccion = idseccion;
    }
    public int getVacantes_disponible() {
        return vacantes_disponible;
    }
    public void setVacantes_disponible(int vacantes_disponible) {
        this.vacantes_disponible = vacantes_disponible;
    }
    public date getAño_electivo() {
        return año_electivo;
    }
    public void setAño_electivo(date año_electivo) {
        this.año_electivo = año_electivo;
    }

    
    
}
