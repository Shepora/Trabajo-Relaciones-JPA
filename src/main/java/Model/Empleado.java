package Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;

    private String nombre;
    private String cargo;
    private String telefono;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<Reserva> reservas;

    public Empleado() {}

    public Empleado(String nombre, String cargo, String telefono) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.telefono = telefono;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
