import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CuadrosCombinados implements ActionListener{
    //Definir variables
    private static JComboBox<String> cboColores;
    private static JLabel etiSelecciona;
    private static JLabel etiResultado;
    private static JButton btnAceptar;
    public static void main(String[] args) {

        //Crear Ventana
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(390, 330);;
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        //Crear Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setSize(frame.getSize());
        mainPanel.setBackground(Color.lightGray);
        mainPanel.setVisible(true);
        mainPanel.setLayout(null);
        frame.getContentPane().add(mainPanel);


        //Crear Componenetes necesarios
        etiSelecciona = new JLabel("Selecciona un color");
        cboColores = new JComboBox<>();
        cboColores.addItem("Rojo");
        cboColores.addItem("Azul");
        cboColores.addItem("Verde");
        JScrollPane barraColores = new JScrollPane(cboColores);
        btnAceptar = new JButton("Aceptar");
        etiResultado = new JLabel("Resultado");
        
        //Definir tamaño y posicion
        etiSelecciona.setBounds(40, 30, 150, 25);
        barraColores.setBounds(40 , 60, 150, 25);
        btnAceptar.setBounds(40, 170, 100, 25);
        etiResultado.setBounds(40, 220, 250, 25);

        //agregar componentes al panel
        mainPanel.add(etiSelecciona);
        mainPanel.add(barraColores);
        mainPanel.add(btnAceptar);
        mainPanel.add(etiResultado);

        frame.setVisible(true);

        btnAceptar.addActionListener(new CuadrosCombinados());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje="El color elegido es ";
        
        mensaje=mensaje+cboColores.getSelectedItem().toString();
        etiResultado.setText(mensaje);

    }
}
