//Importing all the package required
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main implements ActionListener{

	JFrame Frame;
	JLabel Label;
	JTextField textField; 
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton;
	JPanel Panel;
	
	Font myFONT = new Font("Ink Free", Font.BOLD, 17);
	
	double num1 = 0;
	double num2 = 0;
	double result = 0;
	double temp = 0;
	
	char Operator;
	
	Main() {
		
		Frame = new JFrame("Calculator");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(400, 580);
		Frame.setResizable(false);
		Frame.setLayout(null);
		
		Label = new JLabel();
		Label.setBounds(50,0,300,50);
		Label.setFont(myFONT);
		Label.setText("Calculator by Jeevan Adhikari!");
		
		textField = new JTextField();
		textField.setBounds(50, 70, 300, 50);
		textField.setFont(myFONT);
		textField.setEditable(false);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("DEL");
		clrButton = new JButton("C");
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		
		for(int i = 0; i < 8; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFONT);
			functionButtons[i].setFocusable(false);
		}
		
		for(int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFONT);
			numberButtons[i].setFocusable(false);
		}
		
		delButton.setBounds(50,480,150,50);
		clrButton.setBounds(205,480,150,50);
		
		Panel = new JPanel();
		Panel.setBounds(50,150,300,300);
		Panel.setLayout(new GridLayout(4,4,10,10));
		
		Panel.add(numberButtons[1]);
		Panel.add(numberButtons[2]);
		Panel.add(numberButtons[3]);
		Panel.add(addButton);
		
		Panel.add(numberButtons[4]);
		Panel.add(numberButtons[5]);
		Panel.add(numberButtons[6]);
		Panel.add(subButton);
		
		Panel.add(numberButtons[7]);
		Panel.add(numberButtons[8]);
		Panel.add(numberButtons[9]);
		Panel.add(mulButton);
		
		Panel.add(decButton);
		Panel.add(numberButtons[0]);
		Panel.add(equButton);
		Panel.add(divButton);
		
		
		Frame.add(Panel);
		Frame.add(delButton);
		Frame.add(clrButton);
		Frame.add(textField);
		Frame.add(Label);
		Frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		Main calc = new Main();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == numberButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		
		if(e.getSource() == decButton) {
			textField.setText(textField.getText().concat("."));
		}
		
		if(e.getSource() == addButton) {
			num1 = Double.parseDouble(textField.getText());
			Operator = '+';
			textField.setText("");
		}
		
		if(e.getSource() == subButton) {
			num1 = Double.parseDouble(textField.getText());
			Operator = '-';
			textField.setText("");
		}

		if(e.getSource() == mulButton) {
			num1 = Double.parseDouble(textField.getText());
			Operator = '*';
			textField.setText("");
		}
		
		if(e.getSource() == divButton) {
			num1 = Double.parseDouble(textField.getText());
			Operator = '/';
			textField.setText("");
		}
		
		if(e.getSource() == clrButton) {
			textField.setText("");
		}
		
		if(e.getSource() == delButton) {
			String string = textField.getText();
			textField.setText("");
			for(int i = 0; i < string.length() - 1; i++) {
				textField.setText(textField.getText()+string.charAt(i));
			}
			
			}
		
		if(e.getSource() == equButton) {
			num2 = Double.parseDouble(textField.getText());
			
			switch(Operator) {
			
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			}
			textField.setText(String.valueOf(result));
			num1 = result;
			
		}
	}

}
