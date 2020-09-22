import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MessageListener implements ActionListener {

	private JTextArea origin;
	private JTextArea destination;
	private JLabel labelWithImg;

	public MessageListener(JLabel labelWithImg) {
		this.labelWithImg = labelWithImg;

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		changeImage();
	}

	public void changeImage() {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("blueberry.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		labelWithImg.setIcon(new ImageIcon(image));

	}

}