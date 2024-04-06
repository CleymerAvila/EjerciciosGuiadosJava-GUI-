import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VariablesGlobales {
    public static void main(String[] args) {
        Ventana8 miVentana = new Ventana8();
        miVentana.setTitle("Variables Globales");
    }

}

class Ventana8 extends JFrame {
    private static int coches;
    Ventana8(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        Panel7 miPanel = new Panel7();
        add(miPanel);
        setVisible(true);
    }

    private class Panel7 extends JPanel {
        private static JButton btnEntro;
        private static JButton btnSalio;
        private static JButton btnReiniciar;
        private static JLabel etiTitulo;
        private static JLabel etiCoches;
        Panel7(){
            setLayout(null);
            btnEntro = new JButton("Entro un coche");
            btnEntro.setBounds(30, 20, 130, 30 );
            btnSalio = new JButton("Salio un coche");
            btnSalio.setBounds(30, 90, 130, 30 );
            btnReiniciar = new JButton("Reiniciar");
            btnReiniciar.setBounds(30, 170, 130, 30 );

            etiTitulo = new JLabel("Coches en el Parking: ");
            etiTitulo.setBounds(30, 290, 140, 30 );
            etiCoches = new JLabel("0");
            etiCoches.setBounds(170, 290, 30, 30 );
            
            add(btnEntro);
            add(btnSalio);
            add(btnReiniciar);
            add(etiTitulo);
            add(etiCoches);

            Evento evento = new Evento();
            btnEntro.addActionListener(evento);
            btnSalio.addActionListener(evento);
            btnReiniciar.addActionListener(evento);
        }

        class Evento implements ActionListener {
            public void actionPerformed(ActionEvent  e){
                if (e.getSource()==btnEntro) {
                    coches=coches+1;
                    etiCoches.setText(""+coches);

                } else if (e.getSource()==btnSalio) {
                    if (coches>0) {
                        coches=coches-1;
                        etiCoches.setText(""+coches);
                    }
                      
                } else {
                    coches=0;
                    etiCoches.setText("0");
                }
                
            }
        }
    }
}
