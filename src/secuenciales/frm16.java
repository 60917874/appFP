package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHoras, txtTarifa;
    JLabel lblSBasico, lblSBruto, lblSNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm16 frame = new frm16();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm16() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHoras = new JLabel("Horas trabajadas:");
        lblHoras.setBounds(50, 50, 150, 30);
        getContentPane().add(lblHoras);

        JLabel lblTarifa = new JLabel("Tarifa por hora:");
        lblTarifa.setBounds(50, 90, 150, 30);
        getContentPane().add(lblTarifa);

        lblSBasico = new JLabel("Sueldo básico:");
        lblSBasico.setBounds(50, 210, 200, 30);
        getContentPane().add(lblSBasico);

        lblSBruto = new JLabel("Sueldo bruto:");
        lblSBruto.setBounds(50, 240, 200, 30);
        getContentPane().add(lblSBruto);

        lblSNeto = new JLabel("Sueldo neto:");
        lblSNeto.setBounds(50, 270, 200, 30);
        getContentPane().add(lblSNeto);

        txtHoras = new JTextField();
        txtHoras.setBounds(220, 50, 60, 30);
        txtHoras.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHoras.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHoras);

        txtTarifa = new JTextField();
        txtTarifa.setBounds(220, 90, 60, 30);
        txtTarifa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTarifa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTarifa);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
        
    }

    protected void btnCalcular_actionPerformed() {
        int horasTrabajadas = Integer.parseInt(txtHoras.getText());
        double tarifaHora = Double.parseDouble(txtTarifa.getText());

        double sueldoBasico = horasTrabajadas * tarifaHora;

        double sueldoBruto = sueldoBasico * 1.20;

        double sueldoNeto = sueldoBruto * 0.90;

        lblSBasico.setText("Sueldo básico: " + sueldoBasico);
        lblSBruto.setText("Sueldo bruto: " + sueldoBruto);
        lblSNeto.setText("Sueldo neto: " + sueldoNeto);
    }
}