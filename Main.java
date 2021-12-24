import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Main implements ActionListener{

	// Input section
	
	JFrame frame;
	JPanel Header, Loginp1, buttons, Loginp2, Footer;
	JLabel Label,Introduction, test, Username, Password;
	JTextField nameField;
	JPasswordField passField;
	JButton[] functionButtons = new JButton[3];
	JButton logButton, signButton, forButton;
	ImageIcon Login = new ImageIcon("Signup.png");
	ImageIcon User = new ImageIcon("User.png");
	ImageIcon Lock = new ImageIcon("Lock.png");
	
	Font myFONT = new Font("Ink Free", Font.BOLD, 15);
	Border border = BorderFactory.createRaisedBevelBorder();
	Border border1 = BorderFactory.createLoweredBevelBorder();
	
	Main() {
		
		frame = new JFrame("Online Library Management System"); //initiates a frame with title "Online Library Management System".
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the close button to close the program instead of hiding it.
		frame.setSize(440,580); //setting up the size of frame with 440 pixel by 580 pixel.
		frame.setResizable(false); //disable the ability to change the size of the frame.
		frame.setLocation(500, 80); //creates the frame on x = 500px and y = 80px.
		frame.getContentPane().setBackground(Color.white); //changes the color of the frame.
		frame.setAlwaysOnTop(true); //makes the frame to stay focused all time.
		frame.setLayout(null); //makes everything else inside the frame customizable.
		
		Username = new JLabel();
		Username.setFont(myFONT);
		Username.setText("	 Username:");
		Username.setIcon(User);
		
		Password = new JLabel();
		Password.setFont(myFONT);
		Password.setText("	 Password:");
		Password.setIcon(Lock);
		
		test = new JLabel("");
		test.setBounds(5,55,420,130);
		test.setHorizontalAlignment(JLabel.CENTER);
		test.setHorizontalTextPosition(JLabel.LEFT);
		test.setIcon(Login);
		
		Introduction = new JLabel("Login/Signup Form");
		Introduction.setBounds(10,200,420,40);
		Introduction.setBorder(border1);
		Introduction.setFont(myFONT);
		Introduction.setOpaque(true);
		Introduction.setHorizontalAlignment(JLabel.CENTER);
		
		Label = new JLabel();
		Label.setFont(myFONT);
		Label.setText("Welcome to Online Library Management System");
		Label.setVerticalAlignment(JLabel.TOP);
		Label.setHorizontalAlignment(JLabel.CENTER);
		
		logButton = new JButton("Log-In");
		signButton = new JButton("Sign-In");
		
		forButton = new JButton("Forgot Password");
		forButton.setBounds(32,470,380,50);
		
		nameField = new JTextField();
		nameField.setFont(myFONT);
		
		passField = new JPasswordField();
		passField.setFont(myFONT);

		Header = new JPanel();
		Header.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		Header.setBounds(10,10,420,40);
		Header.setLayout(new GridLayout(1,1,10,10));
		Header.setBackground(new Color(213,215,202));
		
		Header.add(Label);
		
		buttons = new JPanel();
		buttons.setBounds(10,410,420,50);
		buttons.setLayout(new GridLayout(1,1,10,10));
		
		buttons.add(logButton);
		buttons.add(signButton);
		
		Loginp1 = new JPanel();
		Loginp1.setBounds(10,270,420,50);
		Loginp1.setBorder(new EmptyBorder(10,10,10,10));
		Loginp1.setBackground(new Color(220,228,210));
		Loginp1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Loginp1.setLayout(new GridLayout(1,1,10,10));
		
		Loginp1.add(Username);
		Loginp1.add(nameField);

		Loginp2 = new JPanel();
		Loginp2.setBounds(10,330,420,50);
		Loginp2.setBackground(new Color(220,228,210));
		Loginp2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Loginp2.setLayout(new GridLayout(1,1,10,10));
		
		Loginp2.add(Password);
		Loginp2.add(passField);
		
		frame.add(Header);
		frame.add(Loginp1);
		frame.add(Loginp2);
		frame.add(Introduction);
		frame.add(test);
		frame.add(buttons);
		frame.add(forButton);
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		
		Main obj = new Main();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
