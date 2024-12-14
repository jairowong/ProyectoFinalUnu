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
    
    @Column(name="id_alumno")
    private int idAlumno;
    
    @Column(name="fecha_pago")
    private Date fechaPago;
    
    @Column(name="monto_pago")
    private double montoPago;
    
    public PagoModel() {
        
    }
    
    public PagoModel(int idAlumno, Date fechaPago, double montoPago) {
        this.idAlumno = idAlumno;
        this.fechaPago = fechaPago;
        this.montoPago = montoPago;

}
