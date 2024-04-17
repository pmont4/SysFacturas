package frames;

import entity.Cliente;
import entity.Factura;
import entity.Producto;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lombok.Getter;
import lombok.Setter;

public class BillPrintingFrame extends javax.swing.JFrame {
    
    @Getter
    @Setter
    private Factura factura;
    
    @Getter
    private final JFrame mainFrame;
    
    public BillPrintingFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
        
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void generateFactura() {
        List<String> msg = new ArrayList<>();
        
        Cliente cliente = this.getFactura().getCliente();
        List<Producto> productos = this.getFactura().getListaProductos();
        
        msg.add("------ Datos de la factura ------");
        msg.add("-");
        msg.add("- ID: " + this.getFactura().getIdFactura());
        msg.add("- Lugar de emision: " + this.getFactura().getDireccionEmision());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = Date.from(this.getFactura().getFechaEmision().toInstant(ZoneOffset.UTC));
        String datestr = sdf.format(date);
        
        msg.add("- Fecha de emision: " + datestr);
        msg.add("-");
        msg.add("------ Datos del cliente ------");
        msg.add("--");
        msg.add("-- Nombre: " + cliente.getNombre());
        Optional<Integer> optNit = cliente.getNit();
        if (optNit.isPresent()) {
            msg.add("-- NIT: " + optNit.get());
        } else {
            msg.add("-- NIT: C/F");
        }
        msg.add("-- Direccion: " + cliente.getDireccion());
        msg.add("--");
        msg.add("------ Productos ------");
        msg.add("---");
        DecimalFormat df = new DecimalFormat("#.##");
        for (Producto p : productos) {
            double precioUnitario = Double.parseDouble(df.format(p.getPrecioUnitario()));
            double precioIVA = Double.parseDouble(df.format(p.getPrecioTotalIVA()));
            
            String pdesc = "--- ID: " + p.getIdProducto() + " Detalles: " + p.getDescripcion() + " Precio C/U: Q." + precioUnitario + " Cantidad: " + p.getCantidad() + " Precio total (IVA): Q." + precioIVA;
            msg.add(pdesc);
        }
        
        double total = Double.parseDouble(df.format(this.getFactura().getTotal()));
        msg.add("---");
        msg.add("------ Total: Q." + total);
        
        for (int i = 0; i < msg.size(); i++) {
            String txt = msg.get(i);
            this.txtAreaFactura.setText(this.txtAreaFactura.getText() + "\n" + txt);
        }
    }
    
    public void printFactura() {
        this.generateFactura();
        this.setVisible(true);
        
        JOptionPane.showMessageDialog(null, "Factura con el ID: " + this.getFactura().getIdFactura() + " correctamente generada.", "Impresion de facturas", JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaFactura = new javax.swing.JTextArea();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Impresion factura");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Impresion de factura"), new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));

        txtAreaFactura.setColumns(20);
        txtAreaFactura.setRows(5);
        txtAreaFactura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtAreaFactura.setFocusable(false);
        jScrollPane1.setViewportView(txtAreaFactura);

        btnCerrar.setText("Cerrar");
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCerrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaFactura;
    // End of variables declaration//GEN-END:variables
}
