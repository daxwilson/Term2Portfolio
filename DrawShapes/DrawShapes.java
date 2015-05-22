
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawShapes extends JFrame {
  private JLabel label1;
  private JButton button1;
  private ImageIcon image1;
  
  public DrawShapes(){
    setLayout(new FlowLayout());
    
    button1 = new JButton("Click for Cage");
    add(button1);
    
    label1 = new JLabel(image1);
    add(label1);
    
    image1 = new ImageIcon(getClass().getResource("nic.jpeg"));
    
    event e = new event();
    button1.addActionListener(e);
  }
  
  public class event implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      
    }
  }
  
  
  public static void main(String args[]) {
    DrawShapes gui = new DrawShapes();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setVisible(true);
    gui.setSize(300,100);
    gui.setTitle("Title");
  }
}