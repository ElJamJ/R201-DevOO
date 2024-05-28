import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerimetreMain extends JFrame {
    private JTextField longueurField;
    private JTextField largeurField;
    private JLabel resultatLabel;

    public PerimetreMain() {
        // Set up the frame
        setTitle("Calcul Perimetre");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the panel and layout manager
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        // Add components to the panel
        panel.add(new JLabel("Longueur :"));
        longueurField = new JTextField();
        panel.add(longueurField);

        panel.add(new JLabel("Largeur :"));
        largeurField = new JTextField();
        panel.add(largeurField);

        panel.add(new JLabel("Resultat :"));
        resultatLabel = new JLabel("0");
        panel.add(resultatLabel);

        JButton calculerButton = new JButton("Calculer");
        JButton nettoyerButton = new JButton("Nettoyer");

        // Associer raccourci clavier pour cliquer sur bouton : Alt + n
        calculerButton.setMnemonic('c');
        nettoyerButton.setMnemonic('n');

        // Add action listeners for the buttons
        calculerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double longueur = Double.parseDouble(longueurField.getText());
                    double largeur = Double.parseDouble(largeurField.getText());
                    double perimetre = 2 * (longueur + largeur);
                    resultatLabel.setText(String.valueOf(perimetre));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Veuillez entrer des valeurs valides", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        nettoyerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                longueurField.setText("");
                largeurField.setText("");
                resultatLabel.setText("0");
            }
        });

        // Add buttons to the panel
        panel.add(calculerButton);
        panel.add(nettoyerButton);

        // Add the panel to the frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PerimetreMain();
            }
        });
    }
}
