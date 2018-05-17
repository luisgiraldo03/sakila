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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Reporte extends JFrame implements ActionListener{
    
    JButton btnConsulta, btnCliente, btnTienda, btnValorMagico, btnRenta;
    JLabel lblFechaInicio, lblFechaFin;
    JTextField txtFechaIncio, txtFechaFin;
    
    private DefaultTableModel datamodel;
    private Object[] datos;
    JTable tabladatos = new JTable();
    JPanel paneldatos = new JPanel();
    
    public Reporte(){
        super("Reporte");
        setSize(750, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        
        lblFechaInicio = new JLabel("Fecha_inicio:");
        lblFechaInicio.setForeground(Color.black);
        lblFechaInicio.setBounds(30, 40, 200, 40);
        lblFechaInicio.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblFechaInicio);
        
        lblFechaFin = new JLabel("Fecha_Fin:");
        lblFechaFin.setForeground(Color.black);
        lblFechaFin.setBounds(30, 100, 200, 40);
        lblFechaFin.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblFechaFin);
        
        txtFechaIncio = new JTextField("");
        txtFechaIncio.setBounds(180, 45, 120, 35);
        txtFechaIncio.setToolTipText("Ingrese codigo");
        txtFechaIncio.setFont(new Font("Arial", 0, 26));
        txtFechaIncio.setVisible(true);
        this.repaint();
        add(txtFechaIncio);
        
        txtFechaFin = new JTextField("");
        txtFechaFin.setBounds(180, 105, 120, 35);
        txtFechaFin.setToolTipText("Ingrese codigo");
        txtFechaFin.setFont(new Font("Arial", 0, 26));
        txtFechaFin.setVisible(true);
        this.repaint();
        add(txtFechaFin);
        
        btnConsulta = new JButton("");
        btnConsulta.setBounds(370, 70, 45, 45);
        btnConsulta.setFont(new Font("Arial", 0, 25));
        btnConsulta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/search.png")));
        btnConsulta.setVisible(true);
        this.repaint();
        add(btnConsulta);

        btnTienda = new JButton("Formulario_Tienda");
        btnTienda.setBounds(560, 20, 130, 45);
        btnTienda.setFont(new Font("Arial", 0, 10));
        btnTienda.setVisible(true);
        this.repaint();
        add(btnTienda);

        btnCliente = new JButton("Valor_magico");
        btnCliente.setBounds(560, 80, 130, 45);
        btnCliente.setFont(new Font("Arial", 0, 10));
        btnCliente.setVisible(true);
        this.repaint();
        add(btnCliente);

        btnValorMagico = new JButton("valor Magico");
        btnValorMagico.setBounds(560, 140, 130, 45);
        btnValorMagico.setFont(new Font("Arial", 0, 10));
        btnValorMagico.setVisible(true);
        this.repaint();
        add(btnValorMagico);
        
        btnRenta = new JButton("Renta");
        btnRenta.setBounds(560, 200, 130, 45);
        btnRenta.setFont(new Font("Arial", 0, 10));
        btnRenta.setVisible(true);
        this.repaint();
        add(btnRenta);
        
        datamodel = new DefaultTableModel();
        tabladatos = new JTable(datamodel);
        datos = new Object[2];
        datos[0] = "Fecha incio";
        datos[1] = "Fecha fin";
 
        datamodel.setColumnIdentifiers(datos);

        tabladatos.setBackground(new Color(5, 224, 165));
        paneldatos.setBackground(new Color(5, 255, 255));
        JScrollPane scroolpndatos = new JScrollPane(tabladatos);
        scroolpndatos.setBounds(40, 200, 460, 200);
        paneldatos.setBounds(40, 200, 460, 200);
        add(scroolpndatos);
        add(paneldatos);
        show();
        
        btnCliente.addActionListener(this);
        btnConsulta.addActionListener(this);
        btnRenta.addActionListener(this);
        btnTienda.addActionListener(this);
        btnValorMagico.addActionListener(this);
        
    }
    
    public static void main(String[] args) {
        Reporte r = new Reporte();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnConsulta) {
            
        }
        if (e.getSource()==btnCliente) {
            FormularioCliente fc = new FormularioCliente();
            dispose();
        }
        if (e.getSource()==btnRenta) {
            FormularioRenta fr = new FormularioRenta();
            dispose();
        }
        if (e.getSource()==btnTienda) {
            FormularioTienda ft = new FormularioTienda();
            dispose();
        }
        if (e.getSource()==btnValorMagico) {
            FormularioValorMagico fvm = new FormularioValorMagico();
            dispose();
        }
    }
    
}
