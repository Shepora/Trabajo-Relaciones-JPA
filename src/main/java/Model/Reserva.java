package Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;

    private Date fechaReserva;
    private String zona;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    public Reserva() {}

    public Reserva(Date fechaReserva, String zona, Cliente cliente, Empleado empleado) {
        this.fechaReserva = fechaReserva;
        this.zona = zona;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
