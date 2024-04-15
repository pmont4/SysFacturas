package entity;

public class Producto {
    
    private int idProcuto;
    private String descripcion;
    private int cantidad;
    private double valor;

    public Producto(int idProcuto, String descripcion, int cantidad, double valor) {
        this.idProcuto = idProcuto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public Producto() {
    }

    public int getIdProcuto() {
        return idProcuto;
    }

    public void setIdProcuto(int idProcuto) {
        this.idProcuto = idProcuto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProcuto=" + idProcuto + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", valor=" + valor + '}';
    }
        
}
