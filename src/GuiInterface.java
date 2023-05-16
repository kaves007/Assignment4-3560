import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiInterface {
    private JFrame frame;
    private JTextField textFieldName;
    private JTextField textFieldPhone;
    private JTextField textFieldEmail;
    private JTextField textFieldStreet;
    private JTextField textFieldCity;
    private JTextField textFieldState;
    private JTextField textFieldZipCode;

    public GuiInterface() {
        frame = new JFrame("Customer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new GridLayout(10, 2));

        JLabel labelName = new JLabel("Name:");
        textFieldName = new JTextField();
        
        JLabel labelPhone = new JLabel("Phone:");
        textFieldPhone = new JTextField();
        
        JLabel labelEmail = new JLabel("Email:");
        textFieldEmail = new JTextField();
       
        JLabel labelStreet = new JLabel("Street:");
        textFieldStreet = new JTextField();
        
        JLabel labelCity = new JLabel("City:");
        textFieldCity = new JTextField();
        
        JLabel labelState = new JLabel("State:");
        textFieldState = new JTextField();
        
        JLabel labelZipCode = new JLabel("Zip Code:");
        textFieldZipCode = new JTextField();

        JButton buttonSearch = new JButton("Search");
        JButton buttonAdd = new JButton("Add");
        JButton buttonUpdate = new JButton("Update");
        JButton buttonDelete = new JButton("Delete");
        
        
        //Search Button Action
        buttonSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	
            	Customer customer = new Customer();
            	Address address = new Address();
    	        
            	if (customer != null) {
            	textFieldName.setText(customer.getName());
            	textFieldPhone.setText(customer.getPhone());
    	        textFieldEmail.setText(customer.getEmail());
    	        textFieldStreet.setText( address.getStreet());
    	        textFieldCity.setText(address.getCity());
    	        textFieldState.setText(address.getState());
    	        textFieldZipCode.setText(address.getZipCode());
    	        }
            	else {
            		JOptionPane.showMessageDialog(frame, "No Records found.");
            	
            	}
            }
        });

        
                //Add Button Action
            	buttonAdd.addActionListener(new ActionListener() {
            	    public void actionPerformed(ActionEvent e) {
            	        
            	        String name = textFieldName.getText();
            	        String phone = textFieldPhone.getText();
            	        String email = textFieldEmail.getText();
            	        String street = textFieldStreet.getText();
            	        String city = textFieldCity.getText();
            	        String state = textFieldState.getText();
            	        String zipCode = textFieldZipCode.getText();

            	        
            	        Customer customer = new Customer();
            	        customer.setName(name);
            	        customer.setPhone(phone);
            	        customer.setEmail(email);

            	        Address address = new Address();
            	        address.setStreet(street);
            	        address.setCity(city);
            	        address.setState(state);
            	        address.setZipCode(zipCode);
            	        
            	        
            	        JOptionPane.showMessageDialog(frame, "Customer successfully included!");
            	        
            	        textFieldName.setText("");
            	        textFieldPhone.setText("");
            	        textFieldEmail.setText("");
            	        textFieldStreet.setText("");
            	        textFieldCity.setText("");
            	        textFieldState.setText("");
            	        textFieldZipCode.setText("");
            	    }
            	});
           
            	//Update Button Action
        buttonUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            	String name = textFieldName.getText();
                String phone = textFieldPhone.getText();
                String email = textFieldEmail.getText();
                String street = textFieldStreet.getText();
                String city = textFieldCity.getText();
                String state = textFieldState.getText();
                String zipCode = textFieldZipCode.getText();

                Customer customer = new Customer();
            	Address address = new Address();
                
                
                customer.setName(name);
                customer.setPhone(phone);
                customer.setEmail(email);
                address.setStreet(street);
                address.setCity(city);
                address.setState(state);
                address.setZipCode(zipCode);

                
                JOptionPane.showMessageDialog(frame, "Customer data successfully updated.");

                
                textFieldName.setText("");
                textFieldPhone.setText("");
                textFieldEmail.setText("");
                textFieldStreet.setText("");
                textFieldCity.setText("");
                textFieldState.setText("");
                textFieldZipCode.setText("");
            }
        });
        //Delete Button Action
        buttonDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	JOptionPane.showMessageDialog(frame, "Customer successfully deleted.");

                
                textFieldName.setText("");
                textFieldPhone.setText("");
                textFieldEmail.setText("");
                textFieldStreet.setText("");
                textFieldCity.setText("");
                textFieldState.setText("");
                textFieldZipCode.setText("");
            }
        });

        frame.add(labelName);
        frame.add(textFieldName);
        
        frame.add(labelPhone);
        frame.add(textFieldPhone);
        
        frame.add(labelEmail);
        frame.add(textFieldEmail);
        
        frame.add(labelStreet);
        frame.add(textFieldStreet);
        
        frame.add(labelCity);
        frame.add(textFieldCity);
       
        frame.add(labelState);
        frame.add(textFieldState);
       
        frame.add(labelZipCode);
        frame.add(textFieldZipCode);
        
        frame.add(buttonSearch);
        
        frame.add(buttonAdd);
        
        frame.add(buttonUpdate);
        
        frame.add(buttonDelete);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GuiInterface();
            }
        });
    }
}
