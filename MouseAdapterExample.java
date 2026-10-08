import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
 
public class MouseAdapterExample { 
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Mouse Adapter Demo"); 
        JLabel label = new JLabel("Click anywhere inside the window"); 
 
        frame.setSize(400, 200); 
        frame.setLayout(new FlowLayout()); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.add(label); 
 
        // Using anonymous inner class with MouseAdapter 
        frame.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) { 
                int x = e.getX(); 
                int y = e.getY(); 
                label.setText("Mouse clicked at: (" + x + ", " + y + ")"); 
            } 
        }); 

        frame.setVisible(true); 
    } 
}