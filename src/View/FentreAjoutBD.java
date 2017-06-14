package View;

import MC.GetTextFenetre;

import javax.swing.*;
import java.awt.*;

/**
 * Created by steph on 14/06/2017.
 */
public class FentreAjoutBD extends JFrame {
    private int height;
    private int width;
    private String title;
    private JTextField textField;
    private JLabel label;

    public FentreAjoutBD(int H, int W,String T){
        super();

        build(H,W,T);//On initialise notre fenêtre
    }

    private void build(int H,int W,String T){
        height=H;
        width=W;
        title=T;
        this.setTitle(this.title);
        this.setSize(this.width, this.height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setColumns(10);

        panel.add(textField);

        label = new JLabel();

        panel.add(label);

        JButton bouton = new JButton(new GetTextFenetre(this, "Ajouter joueur"));

        panel.add(bouton);

        return panel;
    }

    public JTextField getTextField(){
        return textField;
    }

    public JLabel getLabel(){
        return label;
    }

}
