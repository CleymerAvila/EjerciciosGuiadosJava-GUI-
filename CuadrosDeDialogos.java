import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CuadrosDeDialogos {
    public static void main(String[] args) {
        VentanaDialogo miVentana = new VentanaDialogo();
        miVentana.setTitle("Cuadro De Dialogo");
    }
}

class VentanaDialogo extends JFrame {


    private static JLabel etiUnidades;
    private static JLabel etiPrecio;
    private static JTextField txtUnidades;
    private static JTextField txtPrecio;
    private static JLabel etiTotal;
    private static JLabel etiResultado;
    private static JButton btnCalcular;
    private static JButton btnConfiguracion; 
    
    private static double iva;
    private static double descuento;

    private static JButton btnCancelar;
    private static JButton btnAceptar;
    VentanaDialogo(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,390);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        PanelCalcular panel1 = new PanelCalcular();
        PanelBotones panel2 = new PanelBotones();

        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    class PanelCalcular extends JPanel {
        PanelCalcular(){
            setLayout(new GridLayout(3, 2, 10, 20));
            setBorder(BorderFactory.createEmptyBorder(40,20, 100, 100));
            etiUnidades = new JLabel("Unidades: ");
            etiPrecio = new JLabel("Precio: ");
            txtUnidades = new JTextField();
            txtPrecio = new JTextField();
            etiTotal = new JLabel("TOTAL: ");
            etiResultado = new JLabel();

            add(etiUnidades);            
            add(txtUnidades);
            add(etiPrecio);
            add(txtPrecio);
            add(etiTotal);
            add(etiResultado);
        }
    }

    class PanelBotones extends JPanel {
        PanelBotones(){
            setLayout(new GridLayout(1,2, 30, 30));
            setBorder(BorderFactory.createEmptyBorder(20,20,40,100));
            btnCalcular = new JButton("Calcular");
            btnConfiguracion = new JButton("Configuracion...");


            add(btnCalcular);
            add(btnConfiguracion);

            Evento evento = new Evento();
            btnCalcular.addActionListener(evento);

            EventoConfiguracion eventoConfig = new EventoConfiguracion();
            btnConfiguracion.addActionListener(eventoConfig);


        }
    }

    private class DialogoConfiguracion extends JDialog {

        private static JTextField txtIva;
        private static JTextField txtDescuento;
        @Override
        protected void dialogInit() {
            setAlwaysOnTop(true);
            setSize(350, 200);
            setLocationRelativeTo(rootPane);
            JPanel panelDialog = new JPanel();
            panelDialog.setLayout(new GridLayout(3,2,20,20));
            panelDialog.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 70));
            JLabel etiIva = new JLabel("IVA %: ");
            JLabel etiDescuento = new JLabel("DESCUENTO %: ");
            txtIva = new JTextField();
            txtDescuento = new JTextField();
            btnAceptar = new JButton("Aceptar");
            btnCancelar = new JButton("Cancelar");

            panelDialog.add(etiIva);
            panelDialog.add(txtIva);
            panelDialog.add(etiDescuento);
            panelDialog.add(txtDescuento);
            panelDialog.add(btnAceptar);
            panelDialog.add(btnCancelar);

            EventoBotonesDialog eventobtnDialog=new EventoBotonesDialog();
            btnAceptar.addActionListener(eventobtnDialog);
            btnCancelar.addActionListener(eventobtnDialog);

            
            add(panelDialog);
            pack();
            setVisible(true);
        }

        class EventoBotonesDialog implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==btnCancelar) {
                    dispose();
                } else if (e.getSource()==btnAceptar){
                    if (txtIva.getText().isBlank()) {
                        iva=0;
                        dispose();
                    } else if (txtDescuento.getText().isBlank()) {
                        descuento=0;
                        dispose();
                    } else {                    
                        iva = Double.parseDouble(txtIva.getText());
                        descuento=Double.parseDouble(txtDescuento.getText());
                        dispose();
                    }

            
                }
            }
            
        }

    }

    class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==btnCalcular) {
                double unidades; 
                double precio; 
                double total;    //total
                double cantiva;  //cantidad iva
                double cantdes;  //cantidad descuento
                double totalsiniva; //total sin iva
                
                //Recojo los datos de los cuadros de textos (convirtiendolos a números)
                unidades = Double.parseDouble(txtUnidades.getText());
                precio = Double.parseDouble(txtPrecio.getText());
                
                //Calculo el total sin iva, la cantidad de iva y la cantidad de descuento
                totalsiniva=precio*unidades;
                cantiva=totalsiniva*iva/100;
                cantdes=totalsiniva*descuento/100;
                
                //Ahora calculo el precio total:  
                total = totalsiniva+cantiva-cantdes;
                     
                //Coloco el total en la etiqueta:        
                etiResultado.setText(""+total);
        
            }


        }


    }

    class EventoConfiguracion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==btnConfiguracion) {
                DialogoConfiguracion dialogo = new DialogoConfiguracion(); 
                dialogo.setTitle("Configuracion de Iva y descuento");
            }

            
        }
        
    }



}
