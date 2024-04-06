
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class ScrollPane {
    public static void main(String[] args) {
        Ventana7 miVentana = new Ventana7();
        miVentana.setTitle("Ejemplo ScrollPane");
    }


}

class Ventana7 extends JFrame {
    Ventana7(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 550);
        setLocationRelativeTo(null);
        setResizable(true);

        PanelDesplazamiento scplImagen = new PanelDesplazamiento();
        add(scplImagen);
        setVisible(true);
    }

    private class PanelDesplazamiento extends JPanel {
        private static JScrollPane paneldesplazamiento;
        PanelDesplazamiento(){
            setLayout(new BorderLayout());
            paneldesplazamiento = new JScrollPane();
            paneldesplazamiento.setPreferredSize(new Dimension(550, 350));
            ImageIcon miImagen = new ImageIcon("C:/Users/CLEYMER/OneDrive/Imágenes/new/denji-chainsaw-man_1920x1080_xtrafondos.com.jpg");
            JLabel etiImagen = new JLabel(miImagen);
            paneldesplazamiento.setViewportView(etiImagen);
            add(paneldesplazamiento, BorderLayout.CENTER);
        }
    }
}