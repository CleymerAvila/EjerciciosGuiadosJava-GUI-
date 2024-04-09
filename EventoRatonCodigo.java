import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventoRatonCodigo extends JFrame {

    public static JLabel etiZona;
    public static JLabel etitexto;
    public static void main(String[] args) {
        EventoRatonCodigo miVentana = new EventoRatonCodigo();
        miVentana.setVisible(true);
    }

    EventoRatonCodigo(){
        CreacionVentana();
        
    }

    public void CreacionVentana(){
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Progracion Eventos de Raton");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);


        etitexto = new JLabel();
        etitexto.setText("---");
        etitexto.setBounds(50, 10, 300, 25);
        this.getContentPane().add(etitexto);

        etiZona = new JLabel();
        etiZona.setBounds(50, 50, 300, 250);
        etiZona.setText("");
        etiZona.setOpaque(true);
        etiZona.setBackground(Color.red);
        this.getContentPane().add(etiZona);
        
        etiZona.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                etiZonaMouseEntered(e);
            }

            public void mouseExited(MouseEvent e){
                etiZonaMouseExited(e);
            }

            public void mousePressed(MouseEvent e){
                etiZonaMousePressed(e);
            }
        });
    }

    public void etiZonaMouseEntered(MouseEvent e){
        etitexto.setText("El raton acaba de entrar a la etiqueta");
    }

    public void etiZonaMouseExited(MouseEvent e){
        etitexto.setText("El raton acaba de salir de la etiqueta");
    }

    public void etiZonaMousePressed(MouseEvent e){
        if (e.getButton()==MouseEvent.BUTTON1) {
            etitexto.setText("Acabas de pulsar el boton izquierdo");
        } else if (e.getButton()==MouseEvent.BUTTON2) {
            etitexto.setText("Acabas de pulsar el boton central");
        } else if (e.getButton()==MouseEvent.BUTTON3) {
            etitexto.setText("Acabas de pulsar el boton derecho");
        }
    }


}
