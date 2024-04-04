import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class BotonesToggles {
    public static void main(String[] args) {
        Ventana mimarco = new Ventana();
        mimarco.setTitle("Botones Toggles Ejemplo");

    }

}

// Crear la clase JFrame
class Ventana extends JFrame{
    Ventana(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        setSize(350, 550);
        setLocationRelativeTo(null);
        setResizable(false);
        PanelPricipal miPanel = new PanelPricipal();
        add(miPanel);
        setVisible(true); 
    }   
    

}

class PanelPricipal extends JPanel {
    private static JTextField textPrecioBase;
    private static JToggleButton tbtnInstalacion;
    private static JLabel etiPrecioInstalacion;
    private static JToggleButton tbtnFormacion;
    private static JLabel etiPrecioFormacion;
    private static JToggleButton tbtnAlimentacionBD;
    private static JLabel etiPrecioAlimentacionBD;
    private static JButton btnCalcular;
    private static JLabel etiTotal;

    PanelPricipal(){
        setLayout(null);
        setBackground(new Color(253,221,202));
        JLabel etiPrecioBase = new JLabel("Precio Base");
        etiPrecioBase.setBounds(40, 10, 100,25);
        textPrecioBase = new JTextField(10);

        textPrecioBase.setBounds(40, 40, 150, 30);
        tbtnInstalacion = new JToggleButton("Instalacion");
        tbtnInstalacion.setBounds(40, 180, 150, 30);
        etiPrecioInstalacion = new JLabel("40");
        etiPrecioInstalacion.setBounds(210, 180, 50, 30);
        tbtnFormacion = new JToggleButton("Formacion");
        tbtnFormacion.setBounds(40, 220, 150, 30);
        etiPrecioFormacion = new JLabel("200");
        etiPrecioFormacion.setBounds(210, 220, 50, 30);
        tbtnAlimentacionBD = new JToggleButton("Alimentacion BD");
        tbtnAlimentacionBD.setBounds(40, 260, 150, 30);
        etiPrecioAlimentacionBD = new JLabel("200");
        etiPrecioAlimentacionBD.setBounds(210, 260, 50, 30);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(40, 360, 150, 30);

        etiTotal = new JLabel("TOTAL: ");
        etiTotal.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
        etiTotal.setBounds(40, 400, 300, 30);

        Evento evento = new Evento();
        textPrecioBase.addActionListener(evento);
        tbtnInstalacion.addActionListener(evento);
        tbtnFormacion.addActionListener(evento);
        tbtnAlimentacionBD.addActionListener(evento);
        btnCalcular.addActionListener(evento);
        
        add(etiPrecioBase);
        add(textPrecioBase);
        add(tbtnInstalacion);
        add(etiPrecioInstalacion);
        add(tbtnFormacion);
        add(etiPrecioFormacion);
        add(tbtnAlimentacionBD);
        add(etiPrecioAlimentacionBD);
        add(btnCalcular);
        add(etiTotal);
    }

    class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                double precio_base;
                double precio_instal; //precio instalación
                double precio_for; //precio formacion
                double precio_ali; //precio alimentacion
                        
                //Recojo datos desde la ventana:
    
                        
                precio_base = Double.parseDouble(textPrecioBase.getText());
                precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
                precio_for = Double.parseDouble(etiPrecioFormacion.getText());
                precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());
                        
                //Ahora que tengo los datos, puedo hacer cálculos.
                        
                //Al precio base se le van añadiendo precio de extras
                //según estén o no activados los JToggleButtons
                        
                double precio_total;
                        
                precio_total = precio_base;
                        
                if (tbtnInstalacion.isSelected()) { //Si se seleccionó instalación
                   precio_total = precio_total+precio_instal;
                }
                        
                if (tbtnFormacion.isSelected()) { //Si se seleccionó formación
                   precio_total = precio_total+precio_for;            
                }
                        
                if (tbtnAlimentacionBD.isSelected()) { //Si se seleccionó Alimentación BD
                   precio_total = precio_total+precio_ali;
                }
                        
                                
                if (e.getSource()==btnCalcular) {
                    etiTotal.setText("TOTAL: ");
                    //Finalmente pongo el resultado en la etiqueta
                    etiTotal.setText(etiTotal.getText()+ precio_total +" €");
                }
            } catch (Exception exception) {
                if (e.getSource()==btnCalcular) {
                    etiTotal.setText("Error! Precio Base invalido");

                }
            }
        }
        
    }
}

