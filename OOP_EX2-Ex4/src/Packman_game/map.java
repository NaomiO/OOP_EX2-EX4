package Packman_game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class map extends JFrame {

	    public static void main(String... args) throws IOException {

	        new map();

	    }
	    public map() throws IOException {
	        setSize(new Dimension(614, 1141));
	        add(new TestPane());
	        setVisible(true);
	    }

	}

	class TestPane extends JPanel {

	    private BufferedImage image;

	    public TestPane() throws IOException {
	        File file = new File("israel_map.jpg");
	        BufferedImage image = ImageIO.read(file);
	        this.image = image;
	    }

	    @Override
	    public void paintComponent(Graphics g) {
	        double lon = 34;
	        double lat = 33;

	        int mapW = 614;
	        int mapH = 1141;

	        double x = (lon + 180) * (mapW / 360);
}
	}
