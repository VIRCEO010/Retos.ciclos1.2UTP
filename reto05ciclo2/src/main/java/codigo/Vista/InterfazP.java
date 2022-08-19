package codigo.Vista;

import java.awt.event.*;
import javax.swing.*;

public class InterfazP extends JFrame implements ActionListener {
    JButton btn01;
    JButton btn02;
    JButton btn03;
    JPanel panel01;

    public InterfazP() {
        setTitle("Principal");
        setSize(500, 120);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn01 = new JButton("Consulta 1");
        btn01.setBounds(40, 20, 100, 40);
        btn01.addActionListener(this);
        add(btn01);

        btn02 = new JButton("Consulta 2");
        btn02.setBounds(180, 20, 100, 40);
        btn02.addActionListener(this);
        add(btn02);

        btn03 = new JButton("Consulta 3");
        btn03.setBounds(320, 20, 100, 40);
        btn03.addActionListener(this);
        add(btn03);

        panel01 = new JPanel();
        add(panel01);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /* TODO Auto-generated method stub */
        if (e.getSource() == btn01) {
            new Interfaz1();

        } else if (e.getSource() == btn02) {
            new Interfaz2();
        } else if (e.getSource() == btn03) {
            new Interfaz3();

        }

    }
}
