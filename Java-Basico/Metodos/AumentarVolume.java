import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceComBotoes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface com Botões");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); 
        
        JButton button1 = new JButton("Diminuir");
        JButton button2 = new JButton("Aumentar");
        
        panel.add(button1);
        panel.add(button2);
        
        frame.getContentPane().add(panel);
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Volume diminuído");
            }
        });
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Volume aumentado");
            }
        });
        
        frame.pack();
        frame.setVisible(true);
    }
}
