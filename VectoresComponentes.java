
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class VectoresComponentes extends javax.swing.JFrame {

    JCheckBox vcuadros[];
    JButton btnAceptar;
    public static void main(String[] args) {
        VectoresComponentes ventana = new VectoresComponentes();
        ventana.setVisible(true);
    }

    VectoresComponentes(){
        CreacionVentana();
    }

    public void CreacionVentana(){
        setTitle("Vectores de componentes GUI");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        vcuadros = new JCheckBox[10];

        String vTextos[] = {"Rojo", "Amarillo", "Azul", "Celeste", "Marron", "Violeta", "Verde", "Anaranjado", "Negro", "Blanco"};
        // Se rellena el vector
        for (int i = 0; i < vcuadros.length; i++) {
            vcuadros[i] = new JCheckBox();
            vcuadros[i].setText(vTextos[i]);
            vcuadros[i].setBounds(10, 10+30*i, 100, 20);
            this.getContentPane().add(vcuadros[i]);
        }

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(140, 40, 100, 25);
        this.getContentPane().add(btnAceptar);

        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnAceptarActionPerformed(e);
            }
        });



    }

    public void btnAceptarActionPerformed(ActionEvent e){
        int count=0;

        for (int i = 0; i < vcuadros.length; i++) {
            if (vcuadros[i].isSelected()) {
                count++;
            }
        }

        JOptionPane.showMessageDialog(rootPane, "El numero de colores seleccionados es "+ count);
    }
}


