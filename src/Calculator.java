

import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calculator{
	private JFrame frame;

	
	private JTextArea input;

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton plus;
	private JButton equals;
	
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	private String text="";
	private int sum;
		
	Calculator(JFrame f) {
		frame = new JFrame();
		
		input = new JTextArea();
		input.setBounds(10, 10, 290, 40); //50
		
	
		
		btn1 = new JButton("1");
		btn1.setBounds(10, 60, 50, 50);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				text += "1";
				input.setText(text);
				
			}
			
		});
		
	
			
		btn2 = new JButton("2");
		btn2.setBounds(70, 60, 50, 50);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "2";
				input.setText(text);
			}
			
		});
		
		btn3 = new JButton("3");
		btn3.setBounds(130, 60, 50, 50);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "3";
				input.setText(text);

			}
			
		});
		
		btn4 = new JButton("4");
		btn4.setBounds(10, 120, 50, 50);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "4";
				input.setText(text);
			}
			
		});
		
		btn5 = new JButton("5");
		btn5.setBounds(70, 120, 50, 50);
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "5";
				input.setText(text);
			}
			
		});
		
		btn6 = new JButton("6");
		btn6.setBounds(130, 120, 50, 50);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "6";
				input.setText(text);
			}
			
		});
		
		btn7 = new JButton("7");
		btn7.setBounds(10, 180, 50, 50);
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "7";
				input.setText(text);
			}
			
		});
		
		btn8 = new JButton("8");
		btn8.setBounds(70, 180, 50, 50);
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "8";
				input.setText(text);
			}
			
		});
		
		btn9 = new JButton("9");
		btn9.setBounds(130, 180, 50, 50);
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text += "9";
				input.setText(text);
			}
			
		});
		
		
		plus = new JButton("+");
		plus.setBounds(190, 60, 50, 50);
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!text.equals("")) {
					numbers.add(Integer.parseInt(text));
					text="";
					input.setText("");
					for (int x : numbers) {
						input.append(x + "\n");
					}
				}
				
			}
			
		});
		
		equals = new JButton("=");
		equals.setBounds(250, 60, 50, 50);
		equals.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int number : numbers) {
					sum += number;
				}
				input.append("= " + sum);
				text="";
				numbers.clear();

			}
			
		});
	
		
		
		frame.add(plus);
		frame.add(input);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(equals);
		frame.setLayout(null);
		frame.setSize(325, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setTitle("Calculator");
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.setVisible(true);
				frame.dispose();
			}
		});
	}

}