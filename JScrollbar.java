import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class JScrollbar {
    public static void main(String[] args) {
        Ventana2 ventana = new Ventana2();
        ventana.setTitle("JScrollbar");
        
    }
}

class Ventana2 extends JFrame {
    Ventana2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setResizable(false);

        Panel2 lamina = new Panel2();
        add(lamina);
        setVisible(true);
    }
}

class Panel2 extends JLabel {
    private static JScrollBar desValor;
    private static JLabel etiValor;
    Panel2(){
        setLayout(null);
        desValor = new JScrollBar();
        etiValor = new JLabel("El valor es: ");
        desValor.setBounds(20, 60, 350, 20);
        desValor.setOrientation(JScrollBar.HORIZONTAL);
        desValor.setBackground(Color.white);
        desValor.setMinimum(50);
        desValor.setMaximum(150);
        desValor.setUnitIncrement(2);
        desValor.setBlockIncrement(20);
        desValor.setVisibleAmount(5);
        etiValor.setBounds(20, 150, 200, 25);

        Evento evento = new Evento();
        desValor.addAdjustmentListener(evento);

        add(desValor);
        add(etiValor);
    }

    class Evento implements AdjustmentListener {

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            etiValor.setText("El valor es: "+desValor.getValue());
        }
        
    }
}
