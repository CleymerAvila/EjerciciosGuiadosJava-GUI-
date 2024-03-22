import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CuadroVerificacion implements ActionListener {

    private static JCheckBox chkPerro;
    private static JCheckBox chkGato;
    private static JCheckBox chkRaton;
    private static JLabel etiResultado;
    private static JButton btnAceptar;


    public static void main(String[] args) {
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.MAGENTA);
        panel1.setVisible(true);
        JFrame frame = new JFrame("Cuadro Verificacion");
        frame.setVisible(true);
        frame.setSize(400,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        panel1.setLayout(null);
        frame.add(panel1);

        chkPerro = new JCheckBox("Perro");
        chkGato = new JCheckBox("Gato");
        chkRaton = new JCheckBox("Ratón");
        chkPerro.setBounds(30,40,80,25);
        chkGato.setBounds(30,80,80,25);
        chkRaton.setBounds(30,120,80,25);
        chkPerro.setBackground(Color.MAGENTA);
        chkGato.setBackground(Color.MAGENTA);
        chkRaton.setBackground(Color.MAGENTA);
        panel1.add(chkPerro);
        panel1.add(chkGato);
        panel1.add(chkRaton);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(30, 190, 90, 25);
        btnAceptar.addActionListener(new CuadroVerificacion());
        panel1.add(btnAceptar);

        etiResultado = new JLabel("Resultado");
        etiResultado.setBounds(30, 230, 300, 25);
        panel1.add(etiResultado);
        frame.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje = "Animales elegidos: ";
        if (chkPerro.isSelected()) {
            mensaje=mensaje+"Perro ";
        }     
        if (chkGato.isSelected()) {
            mensaje=mensaje+"Gato ";
        }   
        if (chkRaton.isSelected()) {
            mensaje=mensaje+"Raton ";
        }
        etiResultado.setText(mensaje);

    }
}