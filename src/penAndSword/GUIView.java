package penAndSword;
import javax.swing.*;
import java.awt.*;
public class GUIView {

	public static void main(String[] args) {
		
		final int WINDOW_WIDTH = 350; // Window width in pixels
		final int WINDOW_HEIGHT = 250; // Window height in pixels
		
		 // Create a window.
		 JFrame window = new JFrame();
		
		 // Set the title.
		 window.setTitle("Pen & Sword");
		 
		 ImageIcon titleImage = new ImageIcon("c:pen and sword.PNG");
		
		 // Set the size of the window.
		 window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		 // Specify what happens when the close button is clicked.
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
		 
	     // Display the window.
		 window.setVisible(true);
		 
		

	}

}
