package entity;

public class Cliente {
    
    private String nombre;
    private int nit;

    public Cliente(String nombre, int nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", nit=" + nit + '}';
    }
    
}
