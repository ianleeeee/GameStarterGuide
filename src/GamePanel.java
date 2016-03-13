import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer time;
	int x = 250;
	int y = 250;
	boolean moveRight = true;
	boolean moveLeft = false;
	boolean moveUp = false;
	boolean moveDown = false;
	GameObject object;

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 50, 25);
		object.draw(g);
	}

	GamePanel() {
		time = new Timer(5, this);
		time.start();
		object = new GameObject(200, 200, 50, 50);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (moveRight) {
			x++;
		}
		if (x >= 400) {
			moveRight = false;
			moveUp = true;
		}
		if (moveUp) {
			y--;
		}
		if (y <= 100) {
			moveUp = false;
			moveLeft = true;
		}
		if (moveLeft) {
			x--;
		}
		if (x <= 250) {
			moveLeft = false;
			moveDown = true;
		}
		if (moveDown) {
			y++;
		}
		if (y >= 250) {
			moveDown = false;
			moveRight = true;
		}
		repaint();

	}
}
