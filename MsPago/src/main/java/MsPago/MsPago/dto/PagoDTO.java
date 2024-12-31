package MsPago.MsPago.dto;

import java.sql.Date;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public class PagoDTO {
    private Integer id;
    private Integer idMatr;
    private String fecha;
    private String monto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdMatr() {
        return idMatr;
    }

    public void setIdMatr(Integer idMatr) {
        this.idMatr = idMatr;
    }    

    public Date getFechaMatr() {
        return fechaMatr;
    }

    public void setFechaMatr(Date fechaMatr) {
        this.fechaMatr = fechaMatr;
    }
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
