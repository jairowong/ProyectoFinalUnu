package MsPago.MsPago.model;

import jakarta.persistence.Column;

@Entity    
@Table(name="pago")
public class PagoModel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq_pago")
    @SequenceGenerator(name = "seqPagos", allocationSize = 1, sequenceName = "SEQ_PAGOS")
    @Column(name="id_pago")
    private int idPago;
    
    @Column(name="id_matricula")
    private integer idMatricula;
    
    @Column(name="fecha_pago")
    private Date fechaMatr;
    
    private double montoPago;

    public int getIdPago() {        
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }        

    public int getIdMatricula() {
        return idMatricula;
    }        

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }        

    public Date getFechaMatr() {
        return fechaMatr;
    }

    public void setFechaMatr(Date fechaMatr) {
        this.fechaMatr = fechaMatr;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }
    
    
}
