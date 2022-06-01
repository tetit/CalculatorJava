package calculator;

import javax.swing.JFrame;

public class Calculator {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Simple Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 640, 480);
		CalcPanel panel = new CalcPanel();
		frame.add(panel);
		frame.setVisible(true);
		

	}

}
