import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Spinners {
    public static void main(String[] args) {
        Ventana1 miVentana = new Ventana1();
        miVentana.setTitle("SPINNER JAVA");
    }
}

class Ventana1 extends JFrame {
    Ventana1(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,150);
        setLocationRelativeTo(null);
        setResizable(false);

        Lamina1 lamina = new Lamina1();
        add(lamina);
        setVisible(true);
    }
}

class Lamina1 extends JPanel {
    private static JSpinner spiValor;
    private static JLabel etiValor;
    Lamina1(){
        setLayout(null);
        spiValor = new JSpinner();
        spiValor.setBounds(40, 20, 90, 25);
        etiValor = new JLabel("El valor es: ");
        etiValor.setBounds(40, 70, 100, 25);
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(20);
        nm.setMinimum(0);
        nm.setStepSize(2);
        spiValor.setModel(nm);
        Evento evento = new Evento();
        spiValor.addChangeListener(evento);

        add(spiValor);
        add(etiValor);
        
    }

    class Evento implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            etiValor.setText("");
            etiValor.setText("El valor es: "+spiValor.getValue().toString());
        }
        
    }
}
