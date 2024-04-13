package PaquetePrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.border.Border;


public class VentanaPrincipal extends javax.swing.JFrame {

    SalaCine central; // SalaCine central
    SalaCine vo;      // Sala de cine Version original

    // Panel de la sala Central
    JPanel panelCentral;
    // Componenetes necesrios 
    JButton btnCentralNueva;
    JButton btnCentralCambiar;
    JButton btnCentralOcupacion;
    JButton btnCentralIngresos;
    JButton btnCentralvaciar;
    JLabel etiCentralPelicula;
    JLabel etiCentralSala;
    JLabel etiPelicula;

    // Panel de la sala Original
    JPanel panelVOriginal;

    // Componentes necesarios
    JButton btnOriginalNueva;
    JButton btnOriginalCambiar;
    JButton btnOriginalOcupacion;
    JButton btnOriginalIngresos;
    JButton btnOriginalvaciar;
    JLabel etiOriginalPelicula;
    JLabel etiOriginalSala;

    JPanel panIngrTotal;
    JButton btnIngresosTotales;

    public static void main(String[] args) {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        miVentana.setVisible(true);

    }

    VentanaPrincipal(){
        CreacionVentana();
        central = new SalaCine();
        vo = new SalaCine();

        central.setAforo(800);
        central.setEntrada(8.0);

        vo.setAforo(80);
        vo.setEntrada(6.0);
    }

    public void CreacionVentana(){
        this.setLayout(new BorderLayout());
        this.setTitle("Sala De Cines");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(550, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Panel Sala Central
        panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());
        panelCentral.setBorder(BorderFactory.createEmptyBorder(30, 30, 0, 20));
        etiCentralSala = new JLabel("SALA CENTRAL");
        etiCentralSala.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
        etiCentralSala.setFont(new Font("Arial", Font.BOLD, 14));
        panelCentral.add(etiCentralSala, BorderLayout.NORTH);

        Border bordeLinea = BorderFactory.createLineBorder(Color.BLACK, 3);
        Border borderCompuesto = BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(15, 10, 30, 10),
             bordeLinea
        );

        JPanel panPrincipal = new JPanel();
        panPrincipal.setLayout(new BorderLayout(15, 10));
        panPrincipal.setBorder(BorderFactory.createEmptyBorder(30, 10, 40, 10));


        panelCentral.setBorder(borderCompuesto);
        etiPelicula = new JLabel("Película: ");
        etiPelicula.setBounds(20, 60, 70, 25);
        etiCentralPelicula = new JLabel();
        etiCentralPelicula.setBounds(100, 60, 250, 25);
        Border bordePeli = BorderFactory.createLineBorder(Color.BLACK);
        etiCentralPelicula.setBorder(bordePeli);
        btnCentralCambiar = new JButton("Cambiar");
        btnCentralCambiar.setBounds(280, 60, 80, 25);
        panPrincipal.add(BorderLayout.WEST, etiPelicula);
        panPrincipal.add(BorderLayout.CENTER,etiCentralPelicula);
        panPrincipal.add(BorderLayout.EAST, btnCentralCambiar);

        panelCentral.add(panPrincipal, BorderLayout.CENTER);

        JPanel panBotones = new JPanel();
        panBotones.setLayout(new FlowLayout(FlowLayout.LEFT));
        panBotones.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 40));
        btnCentralNueva = new JButton("Nueva Venta");
        panBotones.add(btnCentralNueva);
        btnCentralOcupacion = new JButton("% Ocupacion");
        panBotones.add(btnCentralOcupacion);
        btnCentralvaciar = new JButton("Vaciar");
        panBotones.add(btnCentralvaciar);
        btnCentralIngresos = new JButton("Ingreso");
        panBotones.add(btnCentralIngresos);
        panelCentral.add(panBotones, BorderLayout.SOUTH);

        add(panelCentral, BorderLayout.NORTH);

        // Panel sala Version Original
        panelVOriginal = new JPanel();
        panelVOriginal.setLayout(new BorderLayout());
        panelVOriginal.setBorder(BorderFactory.createEmptyBorder(0, 30, 10, 20));
        etiOriginalSala = new JLabel("SALA VERSION ORIGINAL");
        etiOriginalSala.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 5));
        etiOriginalSala.setFont(new Font("Arial", Font.BOLD, 14));
        panelVOriginal.add(etiOriginalSala, BorderLayout.NORTH);

        JPanel panPrincipal1 = new JPanel();
        panPrincipal1.setLayout(new BorderLayout(15, 10));
        panPrincipal1.setBorder(BorderFactory.createEmptyBorder(40, 10, 40, 10));


        panelVOriginal.setBorder(borderCompuesto);
        etiPelicula = new JLabel("Película: ");
        etiPelicula.setBounds(20, 60, 70, 25);
        etiOriginalPelicula = new JLabel();
        etiOriginalPelicula.setBounds(100, 60, 250, 25);
        etiOriginalPelicula.setBorder(bordePeli);
        btnOriginalCambiar = new JButton("Cambiar");
        btnOriginalCambiar.setBounds(280, 60, 80, 25);
        panPrincipal1.add(BorderLayout.WEST, etiPelicula);
        panPrincipal1.add(BorderLayout.CENTER,etiOriginalPelicula);
        panPrincipal1.add(BorderLayout.EAST, btnOriginalCambiar);

        panelVOriginal.add(panPrincipal1, BorderLayout.CENTER);

        JPanel panBotones1 = new JPanel();
        panBotones1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panBotones1.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 40));
        btnOriginalNueva = new JButton("Nueva Venta");
        panBotones1.add(btnOriginalNueva);
        btnOriginalOcupacion = new JButton("% Ocupacion");
        panBotones1.add(btnOriginalOcupacion);
        btnOriginalvaciar = new JButton("Vaciar");
        panBotones1.add(btnOriginalvaciar);
        btnOriginalIngresos = new JButton("Ingreso");
        panBotones1.add(btnOriginalIngresos);
        panelVOriginal.add(panBotones1, BorderLayout.SOUTH);

        add(panelVOriginal, BorderLayout.CENTER);

        panIngrTotal = new JPanel();
        panIngrTotal.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panIngrTotal.setBorder(BorderFactory.createEmptyBorder(0, 10, 20, 10));
        btnIngresosTotales = new JButton("Ingresos Totales");
        panIngrTotal.add(btnIngresosTotales);

        add(panIngrTotal, BorderLayout.SOUTH);

        // Agregar Eventos a los componentes 

        // Agregar Eventos de la sala Central de Cine
        btnCentralCambiar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCentralCambiarActionPerformed(e);
            }
            
        });

        btnCentralNueva.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCentralNuevaActionPerformed(e);
            }
            
        });

        btnCentralOcupacion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCentralOcupacionActionPerformed(e);
            }
            
        });

        btnCentralvaciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCentralvaciarActionPerformed(e);
            }
            
        });

        btnCentralIngresos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCentralIngresosActionPerformed(e);
            }
        });

        // Agregar Eventos de la sala Version Original de Cine
        btnOriginalCambiar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnOriginalCambiarActionPerformed(e);
            }
            
        });

        btnOriginalNueva.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnOriginalNuevaActionPerformed(e);
            }
            
        });

        btnOriginalOcupacion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnOriginalOcupacionActionPerformed(e);
            }
            
        });

        btnOriginalvaciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnOriginalvaciarActionPerformed(e);
            }
            
        });

        btnOriginalIngresos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnOriginalIngresosActionPerformed(e);
            }
        }); 

        btnIngresosTotales.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnIngresosTotalesActionPerformed(e);
            }
            
        });


        
    }


    // Metodos Eventos Action Performed de Sala central
    public void btnCentralCambiarActionPerformed(java.awt.event.ActionEvent e){
        String titulo;

        titulo = JOptionPane.showInputDialog(null,"Introduce el titulo de la pelicula");
        central.setPelicula(titulo);
        etiCentralPelicula.setText(titulo);
    }

    public void btnCentralNuevaActionPerformed(java.awt.event.ActionEvent e){
        central.entraUno();
    }

    public void btnCentralOcupacionActionPerformed(java.awt.event.ActionEvent e){
        String info;

        info = "Sala Central\n";
        info = info + "Pelicula: "+ central.getPelicula()+ "\n";
        info = info + "Aforo: "+ central.getAforo() + "\n";
        info = info + "Butacas Ocupadas: "+central.getOcupadas()+"\n";
        info = info + "Butacas Libres: "+ central.getLibres()+ "\n";
        info = info + "Porcentaje: "+ central.getPorcentaje() + "% \n";


        JOptionPane.showMessageDialog(null, info);
    }

    public void btnCentralvaciarActionPerformed(java.awt.event.ActionEvent e){
        central.vaciar();
        etiCentralPelicula.setText("");
    }

    public void btnCentralIngresosActionPerformed(ActionEvent e){
        String info;

        info = "Ingresos: "+ central.getIngreso()+ " Euros";
        JOptionPane.showMessageDialog(null, info);
    }



    // Metodos Action Performed sala Version Original
    public void btnOriginalCambiarActionPerformed(java.awt.event.ActionEvent e){
        String titulo;

        titulo = JOptionPane.showInputDialog(null,"Introduce el titulo de la pelicula");
        vo.setPelicula(titulo);
        etiOriginalPelicula.setText(titulo);
    }

    public void btnOriginalNuevaActionPerformed(java.awt.event.ActionEvent e){
        vo.entraUno();
    }

    public void btnOriginalOcupacionActionPerformed(java.awt.event.ActionEvent e){
        String info;

        info = "Sala Central\n";
        info = info + "Pelicula: "+ vo.getPelicula()+ "\n";
        info = info + "Aforo: "+ vo.getAforo() + "\n";
        info = info + "Butacas Ocupadas: "+vo.getOcupadas()+"\n";
        info = info + "Butacas Libres: "+ vo.getLibres()+ "\n";
        info = info + "Porcentaje: "+ vo.getPorcentaje() + "% \n";


        JOptionPane.showMessageDialog(null, info);
    }

    public void btnOriginalvaciarActionPerformed(java.awt.event.ActionEvent e){
        vo.vaciar();
        etiOriginalPelicula.setText("");
    }

    public void btnOriginalIngresosActionPerformed(ActionEvent e){
        String info;

        info = "Ingresos: "+ vo.getIngreso()+ " Euros";
        JOptionPane.showMessageDialog(null, info);
    }

    // Metodo de Ingresos totales
    public void btnIngresosTotalesActionPerformed(ActionEvent e){
        double ingresosTotal;

        ingresosTotal = central.getIngreso() + vo.getIngreso();

        JOptionPane.showMessageDialog(null,  "Los Ingresos en total del cine: "+ingresosTotal+" Euros");
    }



}
