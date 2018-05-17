
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class FormularioCliente extends JFrame implements ActionListener{
    
    JLabel lblCodigoCliente, lblCodigoTienda, lblNombre, lblApellido, lblEmail, lblDireccion, lblCreateDate, lblLastUpdate, lblActivo;
    JTextField txtCodigoCliente, txtCodigoTienda, txtNombre, txtApellido, txtEmail, txtDireccion;
    JButton btnConsulta, btnValorMagico, btnTienda, btnRenta, btnReporte;
    JComboBox comboActivo;
    
    public FormularioCliente(){
        super("Cliente");
        setSize(750, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        
        lblCodigoCliente = new JLabel("Código_Cliente:");
        lblCodigoCliente.setForeground(Color.black);
        lblCodigoCliente.setBounds(30, 40, 200, 40);
        lblCodigoCliente.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblCodigoCliente);
        
        lblCodigoTienda = new JLabel("Código_Tienda:");
        lblCodigoTienda.setForeground(Color.black);
        lblCodigoTienda.setBounds(30, 100, 200, 40);
        lblCodigoTienda.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblCodigoTienda);
        
        
        lblNombre = new JLabel("Nombre_Cliente:");
        lblNombre.setForeground(Color.black);
        lblNombre.setBounds(30, 160, 200, 40);
        lblNombre.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblNombre);
        
        lblApellido = new JLabel("Apellido_Cliente:");
        lblApellido.setForeground(Color.black);
        lblApellido.setBounds(30, 220, 200, 40);
        lblApellido.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblApellido);
        
        
        lblEmail = new JLabel("Email_Cliente:");
        lblEmail.setForeground(Color.black);
        lblEmail.setBounds(30, 280, 200, 40);
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblEmail);
        
        lblDireccion = new JLabel("Dirección_Cliente:");
        lblDireccion.setForeground(Color.black);
        lblDireccion.setBounds(30, 340, 200, 40);
        lblDireccion.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblDireccion);
        
        lblActivo = new JLabel("Activo:");
        lblActivo.setForeground(Color.black);
        lblActivo.setBounds(30, 400, 200, 40);
        lblActivo.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblActivo);
        
        txtCodigoCliente = new JTextField("");
        txtCodigoCliente.setBounds(220, 45, 120, 35);
        txtCodigoCliente.setToolTipText("Ingrese codigo");
        txtCodigoCliente.setFont(new Font("Arial", 0, 26));
        txtCodigoCliente.setVisible(true);
        this.repaint();
        add(txtCodigoCliente);
        
        txtCodigoTienda = new JTextField("");
        txtCodigoTienda.setBounds(220, 105, 120, 35);
        txtCodigoTienda.setToolTipText("Ingrese codigo");
        txtCodigoTienda.setFont(new Font("Arial", 0, 26));
        txtCodigoTienda.setVisible(true);
        this.repaint();
        add(txtCodigoTienda);
        
        txtNombre = new JTextField("");
        txtNombre.setBounds(220, 165, 120, 35);
        txtNombre.setToolTipText("Ingrese codigo");
        txtNombre.setFont(new Font("Arial", 0, 26));
        txtNombre.setVisible(true);
        this.repaint();
        add(txtNombre);
        
        txtApellido = new JTextField("");
        txtApellido.setBounds(220, 225, 120, 35);
        txtApellido.setToolTipText("Ingrese codigo");
        txtApellido.setFont(new Font("Arial", 0, 26));
        txtApellido.setVisible(true);
        this.repaint();
        add(txtApellido);
        
        txtEmail = new JTextField("");
        txtEmail.setBounds(220, 285, 120, 35);
        txtEmail.setToolTipText("Ingrese codigo");
        txtEmail.setFont(new Font("Arial", 0, 26));
        txtEmail.setVisible(true);
        this.repaint();
        add(txtEmail);
        
        txtDireccion = new JTextField("");
        txtDireccion.setBounds(220, 345, 120, 35);
        txtDireccion.setToolTipText("Ingrese codigo");
        txtDireccion.setFont(new Font("Arial", 0, 26));
        txtDireccion.setVisible(true);
        this.repaint();
        add(txtDireccion);
        
        comboActivo = new JComboBox();
        comboActivo.addItem("Si");
        comboActivo.addItem("No");
        comboActivo.setBounds(220, 405, 120, 35);
        comboActivo.setFont(new Font("Arial", 0, 20));
        comboActivo.setVisible(true);
        this.repaint();
        add(comboActivo);
        

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
        
        btnConsulta.addActionListener(this);
        btnTienda.addActionListener(this);
        btnValorMagico.addActionListener(this);
        btnRenta.addActionListener(this);
        btnReporte.addActionListener(this);
        
    }
    
    public static void main(String[] args) {
        FormularioCliente fc = new FormularioCliente();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btnConsulta) {
            
        }
        if (e.getSource()==btnTienda) {
            FormularioTienda ft = new FormularioTienda();
            dispose();
        }
        if (e.getSource() == btnValorMagico) {
            FormularioValorMagico fvm = new FormularioValorMagico();
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
