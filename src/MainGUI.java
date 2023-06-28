import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame{
    private JButton adicionarProfessorButton;
    private JLabel relaçãoDosProfessoresLabel;
    private JButton adicionarDisciplinaButton;
    private JButton relaçãoButton;

    public MainGUI() {
        setTitle("Relação de professores");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        adicionarProfessorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
