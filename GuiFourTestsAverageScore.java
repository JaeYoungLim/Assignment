/**
 * Author: Jae Young Lim
 * Date: 26 Apr 2015
 * This program is for user, using GUI, to input four test scores and weights each of them and calculate the average score of all four tests.
 *  
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GuiFourTestsAverageScore implements ActionListener{
	//JFrame: windows frame
	private JFrame frame;
	//JPanel: separate section in a frame
	private JPanel panel;
	//JLabel: user can click
	private JLabel [] label = new JLabel [8];
	private JLabel output;
	//JTextField: for user input
	private JTextField [] testScore = new JTextField [4];
	private JTextField [] weight = new JTextField [4];
	//JButton
	private JButton button;
	//constructor: to initialize the instance variables
	
	public GuiFourTestsAverageScore() {
		frame = new JFrame("Weighted Average of Four Scores");
		frame.setVisible(true);
		frame.setSize(250, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		panel = new JPanel();
		panel.setBackground(Color.PINK);
  
		label[0] = new JLabel();
		label[0].setText("testscore1");
		label[0].setForeground(Color.white);	
		testScore[0] = new JTextField(5);
		
		label[1] = new JLabel();
		label[1].setText("weight1");
		label[1].setForeground(Color.white);		
		weight[0] = new JTextField(5);
		
		label[2] = new JLabel();
		label[2].setText("testscore2");
		label[2].setForeground(Color.white);		
		testScore[1] = new JTextField(5);
		
		label[3] = new JLabel();
		label[3].setText("weight2");
		label[3].setForeground(Color.white);	
		weight[1] = new JTextField(5);		
		
		label[4] = new JLabel();
		label[4].setText("testscore3");
		label[4].setForeground(Color.white);	
		testScore[2] = new JTextField(5);
		
		label[5] = new JLabel();
		label[5].setText("weight3");
		label[5].setForeground(Color.white);	
		weight[2] = new JTextField(5);
		
		label[6] = new JLabel();
		label[6].setText("testscore4");
		label[6].setForeground(Color.white);
		testScore[3] = new JTextField(5);
		
		label[7] = new JLabel();
		label[7].setText("weight4");
		label[7].setForeground(Color.white);		
		weight[3] = new JTextField(5);
		output = new JLabel();

		button = new JButton("[Calculate] Find Average Test Score");
		button.addActionListener(this);

		panel.add(label[0]);
		panel.add(testScore[0]);
		panel.add(label[1]);
		panel.add(weight[0]);
		panel.add(label[2]);
		panel.add(testScore[1]);
		panel.add(label[3]);
		panel.add(weight[1]);
		panel.add(label[4]);
		panel.add(testScore[2]);
		panel.add(label[5]);
		panel.add(weight[2]);
		panel.add(label[6]);
		panel.add(testScore[3]);
		panel.add(label[7]);
		panel.add(weight[3]);
		panel.add(button);
		panel.add(output);

		frame.add(panel);
 
	}
	
	public void actionPerformed(ActionEvent e) {
		//System.out.println(textField1.getText() + textField2.getText());
		int num1 = (int) Double.parseDouble(testScore[0].getText());
		int num2 = (int) Double.parseDouble(testScore[1].getText());
		int num3 = (int) Double.parseDouble(testScore[2].getText());
		int num4 = (int) Double.parseDouble(testScore[3].getText());
		double num5 = Double.parseDouble(weight[0].getText());
		double num6 = Double.parseDouble(weight[1].getText());
		double num7 = Double.parseDouble(weight[2].getText());
		double num8 = Double.parseDouble(weight[3].getText());

		double result1 = num1*num5;
		double result2 = num2*num6;
		double result3 = num3*num7;
		double result4 = num4*num8;
		
		double average = (result1+result2+result3+result4)*(num5+num6+num7+num8);
		output.setText(String.valueOf(average));

	}
}
