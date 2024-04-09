import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InterfazDesdeCodigo extends JFrame {

    JLabel etiNum1;
    JLabel etiNum2;
    JTextField txtNum1;
    JTextField txtNum2;
    JButton btnSumar;
    JButton btnRestar;

    public static void main(String[] args) {
        InterfazDesdeCodigo ventana = new InterfazDesdeCodigo();
        ventana.setVisible(true);
    }

    public InterfazDesdeCodigo() {
        CreacionVentana();
    }

    public void CreacionVentana() {
        this.setLayout(null);
        this.setTitle("Programa Operaciones");
        this.setSize(350,270);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(100, 100);

        etiNum1 = new JLabel("Numero 1: ");
        etiNum1.setBounds(50,40,100,20);
        this.getContentPane().add(etiNum1);

        etiNum2 = new JLabel("Numero 2:");
        etiNum2.setBounds(50,90,100,20);
        this.getContentPane().add(etiNum2);

        txtNum1 = new JTextField();
        txtNum1.setBounds(170,40, 100,20);
        this.getContentPane().add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(170,90, 100,20);
        this.getContentPane().add(txtNum2);

        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(50,160, 100, 20);
        this.getContentPane().add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(170, 160, 100, 20);
        this.getContentPane().add(btnRestar);
    }
}
