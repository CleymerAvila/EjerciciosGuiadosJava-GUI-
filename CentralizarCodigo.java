import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CentralizarCodigo {
    public static void main(String[] args) {
        Ventana9 miVentana = new Ventana9();
        miVentana.setTitle("Centralizar Codigo Ejemplo GUI");
    }


}

class Ventana9 extends JFrame {

    private static JMenuBar barraMenu;
    private static JMenu menuCalcular;
    private static JMenuItem menuSumar;
    private static JMenuItem menuRestar;
    private static JMenuItem menuBorrar;
    private static JLabel etiqueta1;
    private static JLabel etiqueta2;
    private static JTextField txtNumero1;
    private static JTextField txtNumero2;
    private static JLabel etiResultado;
    private static JButton btnSumar;
    private static JButton btnRestar;
    private static JButton btnBorrar;
    Ventana9(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        Panel8 miPanel = new Panel8();
        add(miPanel);
        setVisible(true);;
    }

    private class Panel8 extends JPanel {

        
        Panel8(){
            setLayout(null);
            barraMenu = new JMenuBar();
            barraMenu.setBounds(0,0,400,30);
            menuCalcular = new JMenu("Calcular");
            barraMenu.add(menuCalcular);
            menuSumar = new JMenuItem("Sumar");
            menuRestar = new JMenuItem("Restar");
            menuBorrar = new JMenuItem("Borrar");
            menuCalcular.add(menuSumar);
            menuCalcular.add(menuRestar);
            menuCalcular.add(menuBorrar);

            etiqueta1 = new JLabel("Numero 1:");
            etiqueta2 = new JLabel("Numero 2:");
            etiqueta1.setBounds(50, 80, 100, 25);
            etiqueta2.setBounds(50, 150, 100, 25);
            txtNumero1 = new JTextField("0");
            txtNumero2 = new JTextField("0");
            txtNumero1.setBounds(130, 80, 180, 30);
            txtNumero2.setBounds(130, 150, 180, 30);
            etiResultado = new JLabel("Resultado: ");
            etiResultado.setBounds(50, 210, 200, 30);
            btnSumar = new JButton("Sumar");
            btnRestar = new JButton("Restar");
            btnBorrar = new JButton("Borar");

            btnSumar.setBounds(50, 270, 260, 25);
            btnRestar.setBounds(50, 310, 260, 25);
            btnBorrar.setBounds(50, 350, 260, 25);

            add(barraMenu);
            add(etiqueta1);
            add(etiqueta2);
            add(txtNumero1);
            add(txtNumero2);
            add(etiResultado);
            add(btnSumar);
            add(btnRestar);
            add(btnBorrar);

            Evento evento = new Evento();
            menuSumar.addActionListener(evento);
            menuRestar.addActionListener(evento);
            menuBorrar.addActionListener(evento);

            txtNumero1.addActionListener(evento);
            txtNumero2.addActionListener(evento);

            btnSumar.addActionListener(evento);
            btnRestar.addActionListener(evento);
            btnBorrar.addActionListener(evento);
        }

        class Evento implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==btnSumar || e.getSource()==menuSumar || e.getSource()==txtNumero1 || e.getSource()==txtNumero2) {
                    sumar();
                } else if (e.getSource()==btnRestar || e.getSource()==menuRestar) {
                    restar();
                } else if (e.getSource()==btnBorrar || e.getSource()==menuBorrar){
                    borrar();
                }
            }     
        }

    }



    public static void sumar(){
        String cad1, cad2;
        int a, b, s;

        cad1 = txtNumero1.getText();
        cad2 = txtNumero2.getText();
        a = Integer.parseInt(cad1);
        b = Integer.parseInt(cad2);

        s = a + b;
        etiResultado.setText("Resultado: "+s);
    }

    public static void restar(){
        String cad1, cad2;
        int a, b, r;

        cad1 = txtNumero1.getText();
        cad2 = txtNumero2.getText();
        a = Integer.parseInt(cad1);
        b = Integer.parseInt(cad2);

        r = a - b;
        etiResultado.setText("Resultado: "+r);
    }

    public static void borrar(){
        etiResultado.setText("Resultado: ");
        txtNumero1.setText("");
        txtNumero2.setText("");

    }
}
