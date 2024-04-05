
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sliders {
    public static void main(String[] args) {
        Marco miMarco = new Marco();
        miMarco.setTitle("Sliders Ejemplo");
    }
    
}

class Marco extends JFrame{
    Marco(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        setSize(350, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        Lamina miLamina = new Lamina();
        add(miLamina);
        setVisible(true); 
    }
}

class Lamina extends JPanel {
    private static JSlider slDeslizador;
    private static JLabel etiResult;

    Lamina(){
        setLayout(new GridLayout(2, 1, 40, 40));
        slDeslizador = new JSlider();
        slDeslizador.setMaximum(500);
        slDeslizador.setMinimum(100);
        slDeslizador.setOrientation(JSlider.HORIZONTAL);
        slDeslizador.setValue(400);
        slDeslizador.setMajorTickSpacing(50);
        slDeslizador.setMinorTickSpacing(10);
        slDeslizador.setSnapToTicks(true);
        slDeslizador.setPaintTrack(false);
        slDeslizador.setPaintLabels(true);
        slDeslizador.setPaintTicks(true);
        etiResult = new JLabel("");

        EventoSlider evento = new EventoSlider();
        slDeslizador.addChangeListener(evento);
        add(slDeslizador);
        add(etiResult);
    }

    class EventoSlider implements ChangeListener  {

        @Override
        public void stateChanged(ChangeEvent e) {
            etiResult.setText("El valor es: "+slDeslizador.getValue());
        } 
    }
}