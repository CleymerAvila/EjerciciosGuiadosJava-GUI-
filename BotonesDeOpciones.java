import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class BotonesDeOpciones implements ActionListener {

    private static JRadioButton optRojo;
    private static JRadioButton optVerde;
    private static JRadioButton optAzul;
    private static JButton btnAceptar;
    private static JLabel etiResultado;
    private static ButtonGroup grupoBotones;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Botones de Opciones");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.pink);
        mainPanel.setSize(400,300);
        mainPanel.setVisible(true);
        frame.add(mainPanel);
        mainPanel.setLayout(null);
        frame.getContentPane().add(mainPanel);

        Container contenedor = new Container();
        contenedor.setLayout(null);
        contenedor.setSize(250, 150);
        contenedor.setLocation(10, 10);
        mainPanel.add(contenedor);

        grupoBotones = new ButtonGroup();
        optRojo = new JRadioButton("Rojo");
        optAzul = new JRadioButton("Azul");
        optVerde = new JRadioButton("Verde");
        optRojo.setBounds(30,30,80,25);
        optAzul.setBounds(30,70,80,25);
        optVerde.setBounds(30,110,80,25);
        optRojo.setBackground(Color.pink);
        optAzul.setBackground(Color.pink);
        optVerde.setBackground(Color.pink);
        contenedor.add(optRojo);
        contenedor.add(optAzul);
        contenedor.add(optVerde);
        grupoBotones.add(optRojo);
        grupoBotones.add(optAzul);
        grupoBotones.add(optVerde);

        frame.setVisible(true);
        JPanel secndPanel = new JPanel();
        secndPanel.setBackground(Color.RED);
        secndPanel.setBounds(0,0, 200,150);
        secndPanel.setVisible(true);
        secndPanel.setBackground(Color.pink);
        contenedor.add(secndPanel);    

        TitledBorder bordeContitulo = new TitledBorder("Colores");
        bordeContitulo.setTitleFont(new Font("Arial",Font.BOLD,14));
        bordeContitulo.setTitleColor(Color.BLUE);


        Border compoundBorder = BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(5, 5, 5, 5), // Borde vacío para espacio alrededor del panel
                bordeContitulo // Borde con título
        );
        // Establecer el borde compuesto en el panel
        secndPanel.setBorder(compoundBorder);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(30, 170, 80, 25);
        btnAceptar.addActionListener(new BotonesDeOpciones());
        mainPanel.add(btnAceptar);

        etiResultado = new JLabel("Resultado");
        etiResultado.setBounds(30, 210, 300, 25);
        mainPanel.add(etiResultado);  
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String mensaje="Color elegido: ";
        if (optRojo.isSelected()) {
            mensaje=mensaje+"Rojo";
        } else if (optVerde.isSelected()) {
            mensaje=mensaje+"Verde";
        } else if (optAzul.isSelected()) {
            mensaje=mensaje+"Azul";
        }
        etiResultado.setText(mensaje);
    }
}
