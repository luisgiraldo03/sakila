/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class FormularioRenta extends JFrame implements ActionListener{
    
    JLabel lblCodigoRenta, lblFechaRenta, lblCodigoInventario, lblCodigoCliente, lblFechaDevolucion, lblCodigoEmpleado, lblLastUpdate;
    JTextField txtCodigoRenta, txtFechaRenta, txtCodigoInventario, txtCodigoCliente, txtFechaDevolucion, txtCodigoEmpleado;
    JButton btnConsulta, btnCliente, btnTienda, btnValorMagico, btnReporte;
    
    public FormularioRenta(){
        super("Renta");
        setSize(750, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        
        lblCodigoRenta = new JLabel("Codigo_Renta:");
        lblCodigoRenta.setForeground(Color.black);
        lblCodigoRenta.setBounds(30, 100, 200, 40);
        lblCodigoRenta.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblCodigoRenta);
        
        
        lblFechaRenta = new JLabel("Fecha_Renta:");
        lblFechaRenta.setForeground(Color.black);
        lblFechaRenta.setBounds(30, 160, 200, 40);
        lblFechaRenta.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblFechaRenta);
        
        lblCodigoInventario = new JLabel("Código_Inventario:");
        lblCodigoInventario.setForeground(Color.black);
        lblCodigoInventario.setBounds(30, 220, 200, 40);
        lblCodigoInventario.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblCodigoInventario);
        
        
        lblCodigoCliente = new JLabel("Codigo_Cliente:");
        lblCodigoCliente.setForeground(Color.black);
        lblCodigoCliente.setBounds(30, 280, 200, 40);
        lblCodigoCliente.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblCodigoCliente);
        
        lblFechaDevolucion = new JLabel("Fecha_devolucion:");
        lblFechaDevolucion.setForeground(Color.black);
        lblFechaDevolucion.setBounds(30, 340, 200, 40);
        lblFechaDevolucion.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblFechaDevolucion);
        
        
        lblCodigoEmpleado = new JLabel("Codigo_Empleado:");
        lblCodigoEmpleado.setForeground(Color.black);
        lblCodigoEmpleado.setBounds(30, 400, 200, 40);
        lblCodigoEmpleado.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblCodigoEmpleado);
        
        txtCodigoRenta = new JTextField("");
        txtCodigoRenta.setBounds(220, 105, 120, 35);
        txtCodigoRenta.setToolTipText("Ingrese codigo");
        txtCodigoRenta.setFont(new Font("Arial", 0, 26));
        txtCodigoRenta.setVisible(true);
        this.repaint();
        add(txtCodigoRenta);
        
        txtFechaRenta = new JTextField("");
        txtFechaRenta.setBounds(220, 165, 120, 35);
        txtFechaRenta.setToolTipText("Ingrese codigo");
        txtFechaRenta.setFont(new Font("Arial", 0, 26));
        txtFechaRenta.setVisible(true);
        this.repaint();
        add(txtFechaRenta);
        
        txtCodigoInventario = new JTextField("");
        txtCodigoInventario.setBounds(220, 225, 120, 35);
        txtCodigoInventario.setToolTipText("Ingrese codigo");
        txtCodigoInventario.setFont(new Font("Arial", 0, 26));
        txtCodigoInventario.setVisible(true);
        this.repaint();
        add(txtCodigoInventario);
        
        txtCodigoCliente = new JTextField("");
        txtCodigoCliente.setBounds(220, 285, 120, 35);
        txtCodigoCliente.setToolTipText("Ingrese codigo");
        txtCodigoCliente.setFont(new Font("Arial", 0, 26));
        txtCodigoCliente.setVisible(true);
        this.repaint();
        add(txtCodigoCliente);
        
        txtFechaDevolucion = new JTextField("");
        txtFechaDevolucion.setBounds(220, 345, 120, 35);
        txtFechaDevolucion.setToolTipText("Ingrese codigo");
        txtFechaDevolucion.setFont(new Font("Arial", 0, 26));
        txtFechaDevolucion.setVisible(true);
        this.repaint();
        add(txtFechaDevolucion);
        
        txtCodigoEmpleado = new JTextField("");
        txtCodigoEmpleado.setBounds(220, 405, 120, 35);
        txtCodigoEmpleado.setToolTipText("Ingrese codigo");
        txtCodigoEmpleado.setFont(new Font("Arial", 0, 26));
        txtCodigoEmpleado.setVisible(true);
        this.repaint();
        add(txtCodigoEmpleado);
        
        
        btnConsulta = new JButton("");
        btnConsulta.setBounds(400, 210, 45, 45);
        btnConsulta.setFont(new Font("Arial", 0, 25));
        btnConsulta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/search.png")));
        btnConsulta.setVisible(true);
        this.repaint();
        add(btnConsulta);

        btnTienda = new JButton("Formulario_Tienda");
        btnTienda.setBounds(560, 140, 130, 45);
        btnTienda.setFont(new Font("Arial", 0, 10));
        btnTienda.setVisible(true);
        this.repaint();
        add(btnTienda);

        btnCliente = new JButton("Valor_magico");
        btnCliente.setBounds(560, 200, 130, 45);
        btnCliente.setFont(new Font("Arial", 0, 10));
        btnCliente.setVisible(true);
        this.repaint();
        add(btnCliente);

        btnValorMagico = new JButton("valor Magico");
        btnValorMagico.setBounds(560, 260, 130, 45);
        btnValorMagico.setFont(new Font("Arial", 0, 10));
        btnValorMagico.setVisible(true);
        this.repaint();
        add(btnValorMagico);
        
        btnReporte = new JButton("Reporte");
        btnReporte.setBounds(560, 320, 130, 45);
        btnReporte.setFont(new Font("Arial", 0, 10));
        btnReporte.setVisible(true);
        this.repaint();
        add(btnReporte);
        
        btnCliente.addActionListener(this);
        btnConsulta.addActionListener(this);
        btnReporte.addActionListener(this);
        btnTienda.addActionListener(this);
        btnValorMagico.addActionListener(this);
         
    }
    public static void main(String[] args) {
        FormularioRenta fr = new FormularioRenta();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btnConsulta) {
            
        }
        if (e.getSource()== btnCliente) {
            FormularioCliente fc = new FormularioCliente();
            dispose();
        }
        if (e.getSource()==btnReporte) {
            Reporte r = new Reporte();
            dispose();
        }
        if (e.getSource()==btnTienda) {
            FormularioTienda ft = new FormularioTienda();
            dispose();
        }
        if (e.getSource()== btnValorMagico) {
            FormularioValorMagico fvm = new FormularioValorMagico();
            dispose();
        }
    }
}
