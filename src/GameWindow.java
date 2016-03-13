import javax.swing.JFrame;

public class GameWindow {
	JFrame frame;
	GamePanel panel;

	public static void main(String[] args) {
		new GameWindow();
	}

	GameWindow() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		panel = new GamePanel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
