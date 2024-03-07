package HelloWolrdGUI;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class HelloWolrdGUI {

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				JFrame frame = new JFrame("◆ HelloWorld GUI 테스트 ◆");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setPreferredSize(new Dimension(400, 200));
				JLabel label = new JLabel("헬로 월드 윈도우 Test", SwingConstants.CENTER);
				frame.getContentPane().add(label);
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation(dim.width/2-400/2, dim.height/2-200/2);
				frame.pack();
				frame.setVisible(true);
			}
			
		});
		
	}

}
