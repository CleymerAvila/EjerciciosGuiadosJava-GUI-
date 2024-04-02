import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModelosCuadroLista implements ActionListener{
    private static JComboBox<String> cboNumeros;
    private static DefaultComboBoxModel<String> modelo;  

    private static JButton btnPares;
    private static JButton btnImpares;
    private static JLabel etiResultado;
    
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Modelos De Cuadro Lista");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500,400);
        ventana.setResizable(false);
        JPanel principalPan = new JPanel();
        principalPan.setBackground(Color.white);
        ventana.add(principalPan);
        principalPan.setLayout(null);
        
        modelo = new DefaultComboBoxModel<>();
        modelo.addElement("");
        modelo.addElement("");
        modelo.addElement("");
        modelo.addElement("");
        modelo.addElement("");
        modelo.addElement("");

        cboNumeros = new JComboBox<>();
        cboNumeros.setModel(modelo);
        cboNumeros.setBounds(40, 40, 200, 25);
        cboNumeros.setBackground(Color.white);
        principalPan.add(cboNumeros);

        btnPares = new JButton("Pares");
        btnPares.setBounds(260, 40, 70, 25);
        principalPan.add(btnPares);
        btnImpares = new JButton("Impares");
        btnImpares.setBounds(350, 40, 90 , 25);
        principalPan.add(btnImpares);

        etiResultado = new JLabel();
        etiResultado.setBounds(40, 250, 150, 25);
        principalPan.add(etiResultado);
        ventana.setVisible(true);

        btnPares.addActionListener(new ModelosCuadroLista());
        btnImpares.addActionListener(new ModelosCuadroLista());
        cboNumeros.addActionListener(new EventoCombo());


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnPares) {    
            int i;   
            DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();       
            for (i=0;i<10;i+=2) {
                modelo.addElement("Nº "+i);
            }       
            cboNumeros.setModel(modelo);        
        } else if (e.getSource()==btnImpares) {
            int i;
            DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();      
            for (i=1;i<10;i+=2) {
                modelo.addElement("Nº "+i);
            }       
            cboNumeros.setModel(modelo);
        }
    }

    private static class EventoCombo implements ActionListener {
        public void actionPerformed(ActionEvent e){
            etiResultado.setText(cboNumeros.getSelectedItem().toString());
        }

    }   
}