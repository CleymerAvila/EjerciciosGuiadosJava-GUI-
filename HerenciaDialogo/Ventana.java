package HerenciaDialogo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    JLabel etiFechaNacimiento;
    JLabel etiFechaNacimientoLargo;
    JButton btnFechaNacimiento;
    JPanel panelPrincipal;

    DialogoFecha nacimiento;

    public static void main(String[] args) {
        Ventana ventanaPrincipal =  new Ventana();
        ventanaPrincipal.setVisible(true);
        
    }

    Ventana(){
        CreacionVentana();
        nacimiento = new DialogoFecha(null, true);
    }

    public void CreacionVentana(){
        setTitle("Ventana Principal");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(true);
        setLocationRelativeTo(null);
        
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        btnFechaNacimiento = new JButton("Introducir Fecha de Nacimiento");
        btnFechaNacimiento.setBounds(50, 50, 230,25);
        panelPrincipal.add(btnFechaNacimiento);

        etiFechaNacimiento = new JLabel();
        etiFechaNacimiento.setBorder(BorderFactory.createLineBorder(Color.black));
        etiFechaNacimiento.setBounds(50, 150, 250, 25);
        panelPrincipal.add(etiFechaNacimiento);

        etiFechaNacimientoLargo = new JLabel();
        etiFechaNacimientoLargo.setBorder(BorderFactory.createLineBorder(Color.black));
        etiFechaNacimientoLargo.setBounds(50, 200, 300, 25);
        panelPrincipal.add(etiFechaNacimientoLargo);

        add(panelPrincipal, BorderLayout.CENTER);

        btnFechaNacimiento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnFechaNacimientoActionPerformed(e);
            }
        });


    }

    public void btnFechaNacimientoActionPerformed(ActionEvent e){
        nacimiento.setVisible(true);

        if (nacimiento.getBotonPulsado()==0) { // SI pulso aceptar
            etiFechaNacimiento.setText(nacimiento.getFecha());
            etiFechaNacimientoLargo.setText(nacimiento.getFechaCompleta());
        } else {
            etiFechaNacimiento.setText("");
            etiFechaNacimientoLargo.setText("");
        }

    }


}
