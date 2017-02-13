package suanfa001;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Suanfa001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame1 = new JFrame();
		JPanel kou1 = new JPanel();
		JButton an1 = new JButton();
		kou1.add(an1);
		frame1.add(kou1);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setBounds(200, 200, 400, 500);
		frame1.setVisible(true);
		System.out.println("ÄãºÃ°¡");
	}

}