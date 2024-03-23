import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CuadrosLista implements ActionListener {

    private static JLabel etiResultado;
    private static JList<String> lstColores;
    private static JButton btnAceptar;
    private static String [] opciones = {"Rojo","Azul","Verde"};;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setVisible(true);
        panel1.setSize(400, 300);
        panel1.setLayout(null);
        frame.add(panel1);

        lstColores = new JList<>(opciones);
        JScrollPane barraDespl = new JScrollPane(lstColores);
        barraDespl.setBounds(20, 20, 100, 120);
        panel1.add(barraDespl);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(20, 150, 80, 25);
        btnAceptar.addActionListener(new CuadrosLista());
        panel1.add(btnAceptar);

        etiResultado = new JLabel("Resultado");
        etiResultado.setBounds(20, 210, 200, 25);
        panel1.add(etiResultado);

        frame.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje;

        if (lstColores.getSelectedIndex()==-1) {
           mensaje="No hay un color seleccionado.";
        } else {
          mensaje="El color seleccionado es: "+lstColores.getSelectedValue().toString();
        }
        etiResultado.setText(mensaje);
         
    }
}
