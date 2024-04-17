package entity;

import java.time.LocalDateTime;
import java.util.List;
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
public class Factura {
    
    private int idFactura;
    private LocalDateTime fechaEmision;
    private String direccionEmision;
    
    private Cliente cliente;
    
    private List<Producto> listaProductos;
    
    private double total;
    
}
