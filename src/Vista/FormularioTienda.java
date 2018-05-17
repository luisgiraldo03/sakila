/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.border.Border;

/**
 *
 * @author DELL
 */
public class FormularioTienda extends JFrame implements ActionListener {

    JLabel lblCodigoTienda, lblNombreTienda, lblCodigoAdmin, lblDescripcion, lblFechaservidor;
    JTextField txtCodigoTienda, txtNombreTienda, txtCodigoAdmin;
    JTextArea taDescripcion;
    JButton btnConsulta, btnValorMagico, btnCliente, btnRenta, btnReporte;

    public FormularioTienda() {
        super("Tienda");
        setSize(750, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setLayout(null);

        lblFechaservidor = new JLabel("");
        lblFechaservidor.setForeground(Color.black);
        lblFechaservidor.setBounds(570, 30, 200, 40);
        lblFechaservidor.setFont(new Font("Arial", Font.PLAIN, 20));
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        lblFechaservidor.setText(formato.format(fecha));
        this.repaint();
        add(lblFechaservidor);

        lblCodigoTienda = new JLabel("Código_Tienda:");
        lblCodigoTienda.setForeground(Color.black);
        lblCodigoTienda.setBounds(40, 100, 200, 40);
        lblCodigoTienda.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblCodigoTienda);

        lblNombreTienda = new JLabel("Nombre_Tienda:");
        lblNombreTienda.setForeground(Color.black);
        lblNombreTienda.setBounds(40, 180, 200, 40);
        lblNombreTienda.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblNombreTienda);

        lblCodigoAdmin = new JLabel("Código_Admin:");
        lblCodigoAdmin.setForeground(Color.black);
        lblCodigoAdmin.setBounds(40, 260, 200, 40);
        lblCodigoAdmin.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblCodigoAdmin);

        lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setForeground(Color.black);
        lblDescripcion.setBounds(40, 340, 200, 40);
        lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblDescripcion);

        txtCodigoTienda = new JTextField("");
        txtCodigoTienda.setBounds(240, 105, 120, 35);
        txtCodigoTienda.setToolTipText("Ingrese su código del producto");
        txtCodigoTienda.setFont(new Font("Arial", 0, 26));
        txtCodigoTienda.setVisible(true);
        this.repaint();
        add(txtCodigoTienda);

        txtNombreTienda = new JTextField("");
        txtNombreTienda.setBounds(240, 185, 120, 35);
        txtNombreTienda.setToolTipText("Ingrese su código del producto");
        txtNombreTienda.setFont(new Font("Arial", 0, 26));
        txtNombreTienda.setVisible(true);
        this.repaint();
        add(txtNombreTienda);

        txtCodigoAdmin = new JTextField("");
        txtCodigoAdmin.setBounds(240, 265, 120, 35);
        txtCodigoAdmin.setToolTipText("Ingrese su código del producto");
        txtCodigoAdmin.setFont(new Font("Arial", 0, 26));
        txtCodigoAdmin.setVisible(true);
        this.repaint();
        add(txtCodigoAdmin);

        taDescripcion = new JTextArea("");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        taDescripcion.setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        taDescripcion.setBounds(240, 345, 200, 70);
        taDescripcion.setToolTipText("Ingrese su código del producto");
        taDescripcion.setFont(new Font("Arial", 0, 14));
        taDescripcion.setVisible(true);
        this.repaint();
        add(taDescripcion);

        btnConsulta = new JButton("");
        btnConsulta.setBounds(400, 210, 45, 45);
        btnConsulta.setFont(new Font("Arial", 0, 25));
        btnConsulta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/search.png")));
        btnConsulta.setVisible(true);
        this.repaint();
        add(btnConsulta);

        btnCliente = new JButton("Formulario_cliente");
        btnCliente.setBounds(560, 140, 130, 45);
        btnCliente.setFont(new Font("Arial", 0, 10));
        btnCliente.setVisible(true);
        this.repaint();
        add(btnCliente);

        btnValorMagico = new JButton("Valor_magico");
        btnValorMagico.setBounds(560, 200, 130, 45);
        btnValorMagico.setFont(new Font("Arial", 0, 10));
        btnValorMagico.setVisible(true);
        this.repaint();
        add(btnValorMagico);

        btnRenta = new JButton("Renta");
        btnRenta.setBounds(560, 260, 130, 45);
        btnRenta.setFont(new Font("Arial", 0, 10));
        btnRenta.setVisible(true);
        this.repaint();
        add(btnRenta);

        btnReporte = new JButton("Reporte");
        btnReporte.setBounds(560, 320, 130, 45);
        btnReporte.setFont(new Font("Arial", 0, 10));
        btnReporte.setVisible(true);
        this.repaint();
        add(btnReporte);

        btnCliente.addActionListener(this);
        btnValorMagico.addActionListener(this);
        btnRenta.addActionListener(this);
        btnReporte.addActionListener(this);

    }

    public static void main(String[] args) {
        FormularioTienda ft = new FormularioTienda();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConsulta) {
            //codigo relacionado con consulta sql
        }
        if (e.getSource() == btnCliente) {
            FormularioCliente fc = new FormularioCliente();
            dispose();
        }
        if (e.getSource() == btnValorMagico) {
            FormularioValorMagico fv = new FormularioValorMagico();
            dispose();
        }
        if (e.getSource() == btnRenta) {
            FormularioRenta fr = new FormularioRenta();
            dispose();
        }
        if (e.getSource() == btnReporte) {
            Reporte r = new Reporte();
            dispose();
        }
    }
}
