package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {
    
    private int idProducto;
    private String descripcion;
    private int cantidad;
    
    private double precioUnitario;
    private double precioTotal;
    
    private double precioTotalIVA;
}
