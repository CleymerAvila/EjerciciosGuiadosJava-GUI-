//Importamos las librerias necesarias
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

//Creamos la clase principal con el metodo Main
public class BarraDeMenus {
    public static void main(String[] args) {
        //Dentro del Main creamos la instacia de la ventana
        // le damos un titulo y ya podemos ejecutarlo
        Ventana3 miVentana = new Ventana3();
        miVentana.setTitle("Barra Menu");
    }
}

//Creamos la clase Ventan heredando de JFrame para la ventana
class Ventana3 extends JFrame {
    Ventana3(){ // En el constructor definimos el estado inicial de la Ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        Panel3  miLamina = new Panel3();
        add(miLamina);
        setVisible(true);
    }

    private static class Panel3 extends JPanel {

        // Definimos las variables con el private y el static para poder usarla
        private static JMenuBar barraDeMenu;
    
        private static JMenu menuArchivo;
        private static JMenu menuEdicion;
        private static JMenu menuInsertar;
        private static JMenu menuColores;
    
        private static JMenuItem abrir;
        private static JMenuItem guardar;
        private static JSeparator separador;
        private static JMenuItem salir;
        private static JMenuItem menuItemRojo;
        private static JMenuItem menuItemVerde;
        private static JMenuItem menuItemAzul;
        Panel3(){
            // Iniciamos las instacias de los objetos necesarios 
            // Le damos nombre y le pasamos texto si es necesario//
            setLayout(null);
            barraDeMenu = new JMenuBar();
            barraDeMenu.setBounds(0, 0, 400, 20);
            menuArchivo = new JMenu("Archivo");
            menuEdicion = new JMenu("Edicion");
            menuInsertar = new JMenu("Insertar");
            abrir = new JMenuItem("Abrir");
            guardar = new JMenuItem("Guardar");
            separador = new JSeparator();
            salir = new JMenuItem("Salir");

            // Añadimos los objetos de menu dentro del Menu Archivo
            menuArchivo.add(abrir);
            menuArchivo.add(guardar);
            menuArchivo.add(separador);
            menuArchivo.add(salir);
            menuColores = new JMenu("Colores");
            menuItemRojo = new JMenuItem("Rojo");
            menuItemVerde = new JMenuItem("Verde");
            menuItemAzul = new JMenuItem("Azul");

            // Se hace lo mismo con el menu Colores
            menuColores.add(menuItemRojo);
            menuColores.add(menuItemAzul);
            menuColores.add(menuItemVerde);
            menuEdicion.add(menuColores);
            barraDeMenu.add(menuArchivo);
            barraDeMenu.add(menuEdicion);
            barraDeMenu.add(menuInsertar);

            // Se añade a la barra los menus
            add(barraDeMenu);
    
            // Creamos las Instacias de los Eventos
            // Añadimos los Eventos a los componente necesarios del menu
            EventoRojo eventoRojo = new EventoRojo();
            menuItemRojo.addActionListener(eventoRojo);
    
            EventoAzul eventoAzul = new EventoAzul();
            menuItemAzul.addActionListener(eventoAzul);
    
            EventoVerde eventoVerde = new EventoVerde();
            menuItemVerde.addActionListener(eventoVerde);
    
        }
    

        // Creamos cada uno de los Eventos con ActionListener
        class EventoRojo implements ActionListener {
    
            @Override
            public void actionPerformed(ActionEvent e) {
                // Establecemos el color de fondo de la lamina 
                // De acuerdo al evento correspondiente 
                setBackground(Color.RED);
            }
            
        }
    
        // Se hace lo mismo con el azul
        class EventoAzul implements ActionListener {
    
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLUE);
            }
            
        }
    
        // Igual con el evento Verde
        class EventoVerde implements ActionListener {
    
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.GREEN);
            }
            
        }
    }
    
}

