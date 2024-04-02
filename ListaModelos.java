import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListaModelos implements ActionListener {

    private static DefaultListModel<String> modelo;
    private static JList<String> listEstu;
    private static JScrollPane barEstudiantes;
    private static JButton btnCurso1;
    private static JLabel etiResultado;
    private static JButton btnCurso2;
    
    public static void main(String []args){
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(450, 330);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        JPanel panel1=new JPanel();
        panel1.setSize(ventana.getSize());
        panel1.setBackground(new Color(145,245,200));
        panel1.setLayout(null);
        ventana.getContentPane().add(panel1);

        listEstu = new JList<>();
        barEstudiantes = new JScrollPane(listEstu);
        barEstudiantes.setBounds(10, 20, 130, 130);
        modelo = new DefaultListModel<>();
        listEstu.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        listEstu.setModel(modelo);

        btnCurso1 = new JButton("Curso 1");
        btnCurso1.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        btnCurso2 = new JButton("Curso 2");
        btnCurso2.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        etiResultado = new JLabel("Estudiante Selecionado: ");
        etiResultado.setFont(new Font("Comic Sans MS",Font.BOLD,12));

        btnCurso1.setBounds(10, 170, 80, 25);
        btnCurso2.setBounds(10, 210, 80, 25);
        etiResultado.setBounds(160, 20,300,60);
        
        panel1.add(etiResultado);
        panel1.add(barEstudiantes);
        panel1.add(btnCurso1);
        panel1.add(btnCurso2);
        
        btnCurso1.addActionListener(new ListaModelos());
        btnCurso2.addActionListener(new ListaModelos());
        listEstu.addMouseListener(new EventoRaton());
        
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnCurso1) {
            DefaultListModel<String> modelo = new DefaultListModel<>();
            modelo.addElement("Juan Andres");
            modelo.addElement("María Carolina");
            modelo.addElement("Luis Alberto");
            modelo.addElement("Felipe Rodriguez");
            listEstu.setModel(modelo);
             
        } else if (e.getSource()== btnCurso2) {
            DefaultListModel<String> modelo = new DefaultListModel<>();
            modelo.addElement("Ana Frigol");
            modelo.addElement("Marta torrejona");
            modelo.addElement("Jose Aldaño");
            modelo.addElement("David Fernandez");
            listEstu.setModel(modelo);  

        }
    }

    private static class EventoRaton extends MouseAdapter {
        public void mouseClicked(MouseEvent e){
            String mensaje="Estudiante Selecionado: ";
            etiResultado.setText(mensaje+listEstu.getSelectedValue().toString());
        }
    }    
}
