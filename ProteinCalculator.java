import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class ProteinCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Protein Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2);

        Locale locale = Locale.getDefault();
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);

        JLabel weightLabel = new JLabel(messages.getString("weightLabel"));
        JTextField weightField = new JTextField();
        JLabel heightLabel = new JLabel(messages.getString("heightLabel"));
        JTextField heightField = new JTextField();
        JLabel genderLabel = new JLabel(messages.getString("genderLabel"));
        JTextField genderField = new JTextField();

        JButton calculateButton = new JButton(messages.getString("calculateButton"));
        JButton clearButton = new JButton(messages.getString("clearButton"));
        JLabel resultLabel = new JLabel("");

        JLabel validationLabel = new JLabel("");
        validationLabel.setForeground(Color.RED);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(weightField.getText());
                    double height = Double.parseDouble(heightField.getText());

                    if (weight <= 0 || height <= 0) {
                        validationLabel.setText(messages.getString("validationMessagePositive"));
                        resultLabel.setText("");
                        return;
                    }

                    String gender = genderField.getText();

                    double protein = calculateProtein(weight, height, gender);
                    resultLabel.setText("Die benötigte Eiweißmenge pro Tag beträgt: " + protein + " g");
                    validationLabel.setText("");
                } catch (NumberFormatException ex) {
                    validationLabel.setText(messages.getString("validationMessageInvalid"));
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weightField.setText("");
                heightField.setText("");
                genderField.setText("");
                resultLabel.setText("");
                validationLabel.setText("");
            }
        });

        panel.add(weightLabel);
        panel.add(weightField);
        panel.add(heightLabel);
        panel.add(heightField);
        panel.add(genderLabel);
        panel.add(genderField);
        panel.add(calculateButton);
        panel.add(clearButton);
        panel.add(validationLabel);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static double calculateProtein(double weight, double height, String gender) {
        // Hier können Sie Ihre Proteinberechnungslogik implementieren
        // Dies ist ein Platzhalter für die eigentliche Berechnung
        return weight * 0.8; // Beispielberechnung
    }
}
