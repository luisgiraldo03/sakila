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
public class FormularioValorMagico extends JFrame implements ActionListener {

    JLabel lblValor;
    JTextField txtValor;
    JButton btnConsulta, btnCliente, btnTienda, btnRenta, btnReporte;

    public FormularioValorMagico() {
        super("Cliente");
        setSize(750, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setLayout(null);

        lblValor = new JLabel("Valor:");
        lblValor.setForeground(Color.black);
        lblValor.setBounds(30, 110, 200, 40);
        lblValor.setFont(new Font("Arial", Font.PLAIN, 20));
        this.repaint();
        add(lblValor);

        txtValor = new JTextField("");
        txtValor.setBounds(100, 115, 200, 35);
        txtValor.setToolTipText("Ingrese codigo");
        txtValor.setFont(new Font("Arial", 0, 26));
        txtValor.setVisible(true);
        this.repaint();
        add(txtValor);

        btnConsulta = new JButton("");
        btnConsulta.setBounds(400, 110, 45, 45);
        btnConsulta.setFont(new Font("Arial", 0, 25));
        btnConsulta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/search.png")));
        btnConsulta.setVisible(true);
        this.repaint();
        add(btnConsulta);

        btnTienda = new JButton("Formulario_Tienda");
        btnTienda.setBounds(560, 30, 130, 45);
        btnTienda.setFont(new Font("Arial", 0, 10));
        btnTienda.setVisible(true);
        this.repaint();
        add(btnTienda);

        btnCliente = new JButton("Formulario_cliente");
        btnCliente.setBounds(560, 90, 130, 45);
        btnCliente.setFont(new Font("Arial", 0, 10));
        btnCliente.setVisible(true);
        this.repaint();
        add(btnCliente);

        btnRenta = new JButton("Renta");
        btnRenta.setBounds(560, 150, 130, 45);
        btnRenta.setFont(new Font("Arial", 0, 10));
        btnRenta.setVisible(true);
        this.repaint();
        add(btnRenta);

        btnReporte = new JButton("Reporte");
        btnReporte.setBounds(560, 210, 130, 45);
        btnReporte.setFont(new Font("Arial", 0, 10));
        btnReporte.setVisible(true);
        this.repaint();
        add(btnReporte);

        btnConsulta.addActionListener(this);
        btnCliente.addActionListener(this);
        btnRenta.addActionListener(this);
        btnReporte.addActionListener(this);
        btnTienda.addActionListener(this);

    }

    public static void main(String[] args) {
        FormularioValorMagico fvm = new FormularioValorMagico();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConsulta) {

        }
        if (e.getSource() == btnCliente) {
            FormularioCliente fc = new FormularioCliente();
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
        if (e.getSource() == btnTienda) {
            FormularioTienda ft = new FormularioTienda();
            dispose();
        }

    }
}
