import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField tfPrimeiroNome;
    private JTextField tfSobrenome;
    private JButton btnOK;
    private JButton btnLimpar;
    private JPanel mainPanel;
    private JLabel lbBemVindo;

    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("Bem-vindo");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String primeiroNome = tfPrimeiroNome.getText();
                String sobreNome = tfSobrenome.getText();
                lbBemVindo.setText("Bem-Vindo: "+primeiroNome+" "+sobreNome);
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPrimeiroNome.setText("");
                tfSobrenome.setText("");
                lbBemVindo.setText("");
            }
        });
    }
    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();

    }

}
