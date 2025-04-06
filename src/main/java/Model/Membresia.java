package Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "membresia")
public class Membresia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembresia;

    private String tipo;
    private Date fechaInicio;
    private Date fechaFin;

    @OneToOne
    @JoinColumn(name = "id_cliente", unique = true)
    private Cliente cliente;

    public Membresia() {}

    public Membresia(String tipo, Date fechaInicio, Date fechaFin, Cliente cliente) {
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
