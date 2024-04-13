import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.*;;

public class VectoresEventos extends javax.swing.JFrame {

    JButton vBotones[];
    public static void main(String[] args) {
        VectoresEventos miventana = new VectoresEventos();
        miventana.setVisible(true);
        
    }

    VectoresEventos(){
        CreacionVentana();
    }

    public void CreacionVentana(){
        setTitle("Vectores Eventos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        vBotones = new JButton[5];

        String textoBotones[] = {"Aceptar", "Cancelar"," Aplicar", " Cerrar", " Salir"};

        for (int i = 0; i < vBotones.length; i++) {
            vBotones[i] = new JButton();
            vBotones[i].setText(textoBotones[i]);
            vBotones[i].setBounds(10+i*100, 100, 90, 20); 
            this.getContentPane().add(vBotones[i]);
        }

        for(int i=0; i<vBotones.length; i++){
            vBotones[i].addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    botonesActionPerformed(e);
                }

            });
        }
    }

    public void botonesActionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Has pulsado uno de los botones");
    }
}
