package entity;

import java.util.Date;
import java.util.List;

public class Factura {
    
    private int idFactura;
    private Date fechaEmision;
    private String direccionEmision;
    private Cliente cliente;
    
    private List<Producto> listaProductos;
    
    private double total;

    public Factura(int idFactura, Date fechaEmision, String direccionEmision, Cliente cliente, List<Producto> listaProductos, double total) {
        this.idFactura = idFactura;
        this.fechaEmision = fechaEmision;
        this.direccionEmision = direccionEmision;
        this.cliente = cliente;
        this.listaProductos = listaProductos;
        this.total = total;
    }

    public Factura() {
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDireccionEmision() {
        return direccionEmision;
    }

    public void setDireccionEmision(String direccionEmision) {
        this.direccionEmision = direccionEmision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", fechaEmision=" + fechaEmision + ", direccionEmision=" + direccionEmision + ", cliente=" + cliente + ", listaProductos=" + listaProductos + ", total=" + total + '}';
    }
    
}
