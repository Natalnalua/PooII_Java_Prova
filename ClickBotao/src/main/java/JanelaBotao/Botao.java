package JanelaBotao;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Willian Moreira
 */
public class Botao extends JFrame {
    
    private final JLabel labelFilme;
    private final JTextField textFilme;
    private final JButton botaoSalvarFilme;
    
    public Botao(){
        super();
        
        this.setTitle("Filmes");
        this.setSize(400, 200);
        
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        labelFilme = new JLabel("Nome do Filme");
        textFilme= new JTextField();
        textFilme.setPreferredSize(new Dimension(250,20));
        botaoSalvarFilme = new JButton("Salvar");
        
        botaoSalvarFilme.addActionListener((ActionEvent e) -> {
            
            JOptionPane.showMessageDialog(null, "Filme Salvo com sucesso!");
        });
        
        this.add(labelFilme);
        this.add(textFilme);
        this.add(botaoSalvarFilme);
        
        this.setVisible(true);
        
    }
}
