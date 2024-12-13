package cl.seis.erp.customer.DB.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "customer")
public class CustomerEntity {

    @Id
    private int id;
    private int rut;
    private String dvCliente;
    private String nombre;
    private Integer telefono;
    private String correo;

    public CustomerEntity() {
    }

    public CustomerEntity(
            Integer id,
            Integer rut,
            String dvCliente,
            String nombre,
            Integer telefono,
            String correo
    ) {
        this.id = id;
        this.rut = rut;
        this.dvCliente = dvCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getDvCliente() {
        return dvCliente;
    }

    public void setDvCliente(String dvCliente) {
        this.dvCliente = dvCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
