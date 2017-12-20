package chapter22.one;

import javax.swing.JFrame;

public class HelloSwing {

	public static void main(String[] args) {
		JFrame jFrame=new JFrame("Hello Swing");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(300, 200);
		jFrame.setVisible(true);
	}
}
