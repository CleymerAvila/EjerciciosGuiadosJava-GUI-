
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HerenciaEjercicio {
    public static void main(String[] args) {
        VentanaInicial miVentana = new VentanaInicial();
        miVentana.setVisible(true);
    }
}

class BotonContador extends JButton {
    //propiedades
    int pulsaciones;

    //constructor
    public BotonContador() {
        pulsaciones=0;
    }

    //métodos

    //asigna una cantidad de pulsaciones
    public void setPulsaciones(int p) {
        pulsaciones=p;
    }

    //devuelve las pulsaciones del botón
    public int getPulsaciones() {
        return pulsaciones;
    }

    //incrementa en uno las pulsaciones
    public void incrementa() {
        pulsaciones++;
    }

    //decrementa en uno las pulsaciones
    public void decrementa() {
        pulsaciones--;
    }

    //pone las pulsaciones a cero
    public void reiniciar() {
        pulsaciones=0;
    }

    //aumenta las pulsaciones en una cantidad c
    public void aumenta(int c) {
        pulsaciones=pulsaciones+c;
    }

    //disminuye las pulsaciones en una cantidad c
    public void disminuye(int c) {
        pulsaciones=pulsaciones-c;
    }

}

class VentanaInicial extends JFrame {
    BotonContador btnBotonA;
    BotonContador btnBotonB;
    BotonContador btnBotonC;

    JTextField txtIniciarNumero; 
    
    VentanaInicial(){
        CreacionVentana();
    }

    public void CreacionVentana(){
        this.setLayout(null);
        this.setTitle("Ejercicio de Herencia");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(350, 360);
        this.setLocationRelativeTo(null);

        // Construimos y situamos los botones contadores
        btnBotonA = new BotonContador();
        btnBotonA.setText("Boton A");
        btnBotonA.setBounds(10,10,100,30);
        this.getContentPane().add(btnBotonA);

        btnBotonB = new BotonContador();
        btnBotonB.setText("Boton B");
        btnBotonB.setBounds(120,10,100,30);
        this.getContentPane().add(btnBotonB);

        btnBotonC = new BotonContador();
        btnBotonC.setText("Boton c");
        btnBotonC.setBounds(230, 10, 100, 30);
        this.getContentPane().add(btnBotonC);


        JButton btnVerPulsaciones = new JButton("Ver Pulsaciones");
        btnVerPulsaciones.setBounds(10, 200, 150, 30);
        this.getContentPane().add(btnVerPulsaciones);

        JButton btnReinicar = new JButton("Reiniciar");
        btnReinicar.setBounds(200, 200, 100, 30);
        this.getContentPane().add(btnReinicar);

        txtIniciarNumero = new JTextField();
        txtIniciarNumero.setBounds(10, 260, 180, 30);
        this.getContentPane().add(txtIniciarNumero);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(220, 260, 90, 30);
        this.getContentPane().add(btnIniciar);



        btnBotonA.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                pulsacionBotonA(e);
            }

        });

        btnBotonB.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pulsacionBotonB(e);
            }
            
        });

        btnBotonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                pulsacionBotonC(e);
            }
        });

        btnVerPulsaciones.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnVerPulsacionesActionPerformed(e);
            }
            
        });

        btnReinicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){{
                btnReinicarActionPerformed(e);
            }}
        });

        btnIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnIniciarActionPerformed(e);
            }
        });


    }

    public void pulsacionBotonA(ActionEvent e){
        btnBotonA.incrementa();
    }

    public void pulsacionBotonB(ActionEvent e){
        btnBotonB.incrementa();
    }

    public void pulsacionBotonC(ActionEvent e){
        btnBotonC.aumenta(2);
    }

    public void btnVerPulsacionesActionPerformed(ActionEvent e){
        String info;

        info = "El boton A se ha pulsado "+ btnBotonA.getPulsaciones()+ " veces\n";
        info = info + "EL boton B se ha pulsado "+ btnBotonB.getPulsaciones() + " veces\n";
        info = info + "El boton C se ha pulsado "+ btnBotonC.getPulsaciones() + " veces";

        JOptionPane.showMessageDialog(null,  info);

    }

    public void btnReinicarActionPerformed(ActionEvent e){
        btnBotonA.reiniciar();
        btnBotonB.reiniciar();
        btnBotonC.reiniciar();
    }

    public void btnIniciarActionPerformed(ActionEvent e){
        int num;
        num = Integer.parseInt(txtIniciarNumero.getText());

        btnBotonA.setPulsaciones(num);
        btnBotonB.setPulsaciones(num);
        btnBotonC.setPulsaciones(num);
    }


}
