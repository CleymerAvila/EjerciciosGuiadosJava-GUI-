package HerenciaDialogo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogoFecha extends JDialog{

    int dia;
    int mes;
    int anio;
    int btnPulsado;

    JTextField txtDia;
    JTextField txtMes;
    JTextField txtAnio;

    public DialogoFecha(java.awt.Frame parent, boolean modal){
        super(parent, modal);
    }

    @Override
    protected void dialogInit() {
        setAlwaysOnTop(true);
        setSize(350, 200);
        setLocationRelativeTo(rootPane);

        JPanel panelDialogo = new JPanel();
        panelDialogo.setLayout(new GridLayout(2, 1));
        panelDialogo.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 30));
        JPanel panFechaNac = new JPanel();
        panFechaNac.setLayout(new GridLayout(1, 6, 3, 10));
        panFechaNac.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel etiDia = new JLabel("Dia: "); 
        txtDia = new JTextField();
        JLabel etiMes = new JLabel("Mes: "); 
        txtMes = new JTextField();
        JLabel etianio = new JLabel("Año: "); 
        txtAnio = new JTextField();

        panFechaNac.add(etiDia);
        panFechaNac.add(txtDia);
        panFechaNac.add(etiMes);
        panFechaNac.add(txtMes);        
        panFechaNac.add(etianio);
        panFechaNac.add(txtAnio);

        JPanel panBotones = new JPanel();
        panBotones.setLayout(new GridLayout(1, 2, 30, 30));
        panBotones.setBorder(BorderFactory.createEmptyBorder(20, 20, 15, 40));
        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");
        panBotones.add(btnAceptar);
        panBotones.add(btnCancelar);
        
        panelDialogo.add(panFechaNac, BorderLayout.CENTER);
        panelDialogo.add(panBotones, BorderLayout.SOUTH);

        add(panelDialogo);

        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnAceptarActionPerformed(e);
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCancelarActionPerformed(e);
            }
        });
        
    }

    public void btnAceptarActionPerformed(ActionEvent e){
        dia = Integer.parseInt(txtDia.getText());
        mes = Integer.parseInt(txtMes.getText());
        anio = Integer.parseInt(txtAnio.getText());

        btnPulsado = 0;
        this.dispose();
    }

    public void btnCancelarActionPerformed(ActionEvent e){
        btnPulsado=1;
        this.dispose();
    }

    public String getFecha(){
        String cadena;

        cadena = dia + "/"+mes+"/"+anio;

        return cadena;
    }

    public String getFechaCompleta(){
        String cadena;

        cadena = dia + " de";

        if (mes==1) {
            cadena = cadena + " Enero";
        } else if (mes==2) {
            cadena = cadena + " Febrero";
        } else if (mes == 3) {
            cadena = cadena + " Marzo";
        } else if (mes==4) {
            cadena = cadena + " Abril";
        } else if (mes==5) {
            cadena = cadena + " Mayo";
        } else if (mes==6) {
            cadena = cadena + " Junio";
        } else if (mes==7) {
            cadena = cadena + " Julio";
        } else if (mes==8) {
            cadena = cadena + " Agosto";
        } else if (mes==9) {
            cadena = cadena + " Septiembre";
        } else if (mes==10) {
            cadena = cadena + " Octubre";
        } else if (mes==11) {
            cadena = cadena + " Noviembre";
        } else if (mes==12) {
            cadena = cadena + " Diciembre";
        }

        cadena = cadena + " de "+ anio;

        return cadena;
    }

    public int getBotonPulsado(){
        return btnPulsado;
    }
    
}
