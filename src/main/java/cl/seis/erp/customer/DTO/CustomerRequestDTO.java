package cl.seis.erp.customer.DTO;

import org.springframework.data.annotation.Id;

public class CustomerRequestDTO {

    private Integer rut;
    private String dvCliente;
    private String nombre;
    private Integer telefono;

    public CustomerRequestDTO() {
    }

    public CustomerRequestDTO(Integer rut, String dvCliente, String nombre, Integer telefono, String correo) {

        this.rut = rut;
        this.dvCliente = dvCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    private String correo;

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
