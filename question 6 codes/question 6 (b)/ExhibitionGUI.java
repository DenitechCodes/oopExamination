// File: ExhibitionGUI.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExhibitionGUI extends JFrame {
    private JTextField txtName, txtFaculty, txtProject, txtContact, txtEmail;
    private JButton btnRegister, btnClear, btnExit;

    public ExhibitionGUI() {
        setTitle("Victoria University Exhibition Registration");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));
        
        // Initialize components
        add(new JLabel("Student Name*:"));
        txtName = new JTextField();
        add(txtName);
        
        add(new JLabel("Faculty*:"));
        txtFaculty = new JTextField();
        add(txtFaculty);
        
        add(new JLabel("Project Title*:"));
        txtProject = new JTextField();
        add(txtProject);
        
        add(new JLabel("Contact Number*:"));
        txtContact = new JTextField();
        add(txtContact);
        
        add(new JLabel("Email Address*:"));
        txtEmail = new JTextField();
        add(txtEmail);
        
        // Buttons
        btnRegister = new JButton("Register");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        
        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(btnRegister);
        buttonPanel.add(btnClear);
        buttonPanel.add(btnExit);
        
        add(new JLabel()); // Empty cell for layout
        add(buttonPanel);
        
        // Event handlers
        btnRegister.addActionListener(new RegisterHandler());
        btnClear.addActionListener(e -> clearForm());
        btnExit.addActionListener(e -> System.exit(0));
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void clearForm() {
        txtName.setText("");
        txtFaculty.setText("");
        txtProject.setText("");
        txtContact.setText("");
        txtEmail.setText("");
    }

    private class RegisterHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String name = txtName.getText().trim();
                String faculty = txtFaculty.getText().trim();
                String project = txtProject.getText().trim();
                String contact = txtContact.getText().trim();
                String email = txtEmail.getText().trim();

                // Validate inputs
                if (name.isEmpty() || faculty.isEmpty() || project.isEmpty() || contact.isEmpty() || email.isEmpty()) {
                    throw new IllegalArgumentException("All fields are required!");
                }
                if (!contact.matches("\\d{10,15}")) {
                    throw new IllegalArgumentException("Contact must be 10-15 digits!");
                }
                if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                    throw new IllegalArgumentException("Invalid email format!");
                }

                // Create participant and save to DB
                Participant participant = new Participant(name, faculty, project, contact, email);
                ParticipantDAO.saveParticipant(participant);
                JOptionPane.showMessageDialog(null, "Registration Successful!");
                clearForm();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new ExhibitionGUI();
    }
}