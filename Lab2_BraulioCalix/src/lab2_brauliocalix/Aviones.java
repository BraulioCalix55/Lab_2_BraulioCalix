/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_brauliocalix;

/**
 *
 * @author User
 */
public class Aviones {

    private String numode;
    private String codi;
    private String fabrica;
    private String ingreso;
    private String cantidad;
    private String pesomax;
    private String horasvuelo;
    private String numotores;
    private String estado;
    private String nombre;

    public Aviones() {
    }

    public Aviones(String numode, String codi, String fabrica, String ingreso, String cantidad, String pesomax, String horasvuelo, String numotores, String estado, String nombre) {
        this.numode = numode;
        this.codi = codi;
        this.fabrica = fabrica;
        this.ingreso = ingreso;
        this.cantidad = cantidad;
        this.pesomax = pesomax;
        this.horasvuelo = horasvuelo;
        this.numotores = numotores;
        this.estado = estado;
        this.nombre = nombre;
    }

    public String getNumode() {
        return numode;
    }

    public void setNumode(String numode) {
        this.numode = numode;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPesomax() {
        return pesomax;
    }

    public void setPesomax(String pesomax) {
        this.pesomax = pesomax;
    }

    public String getHorasvuelo() {
        return horasvuelo;
    }

    public void setHorasvuelo(String horasvuelo) {
        this.horasvuelo = horasvuelo;
    }

    public String getNumotores() {
        return numotores;
    }

    public void setNumotores(String numotores) {
        this.numotores = numotores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    @Override
    public String toString() {
        return "Aviones{" + "numode=" + numode + ", codi=" + codi + ", fabrica=" + fabrica + ", ingreso=" + ingreso + ", cantidad=" + cantidad + ", pesomax=" + pesomax + ", horasvuelo=" + horasvuelo + ", numotores=" + numotores + ", estado=" + estado + ", nombre=" + nombre + '}';
    }

}
