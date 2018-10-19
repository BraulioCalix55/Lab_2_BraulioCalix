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

    private int numode;
    private String codi;
    private int fabrica;
    private int ingreso;
    private int cantidad;
    private int pesomax;
    private int horasvuelo;
    private int numotores;
    private String estado;
    private String nombre;

    public Aviones() {
    }

    public Aviones(int numode, String codi, int fabrica, int ingreso, int cantidad, int pesomax, int horasvuelo, int numotores, String estado, String nombre) {
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

    public int getNumode() {
        return numode;
    }

    public void setNumode(int numode) {
        this.numode = numode;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public int getFabrica() {
        return fabrica;
    }

    public void setFabrica(int fabrica) {
        this.fabrica = fabrica;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPesomax() {
        return pesomax;
    }

    public void setPesomax(int pesomax) {
        this.pesomax = pesomax;
    }

    public int getHorasvuelo() {
        return horasvuelo;
    }

    public void setHorasvuelo(int horasvuelo) {
        this.horasvuelo = horasvuelo;
    }

    public int getNumotores() {
        return numotores;
    }

    public void setNumotores(int numotores) {
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
