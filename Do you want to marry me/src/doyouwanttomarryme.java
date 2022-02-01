import java.awt.event.*;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
 

import java.util.Random;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.*;
public class doyouwanttomarryme  extends JFrame implements MouseListener{
	JFrame frame = new JFrame();
	JLabel textOne = new JLabel();
	JLabel textTwo = new JLabel();
	JLabel textThree = new JLabel();
	JLabel textarea = new JLabel();
	JLabel bg = new JLabel();
	JLabel heart = new JLabel();
	JLabel gif = new JLabel();
	JLabel image1 = new JLabel();
	JLabel image2 = new JLabel();
	JLabel image3 = new JLabel();
	JLabel image4 = new JLabel();
	JLabel phaohoa = new JLabel();
	JLabel phaohoa2 = new JLabel();
	JLabel phaohoa3 = new JLabel();
	JLabel phaohoa4 = new JLabel();

	int distantY[]= {200,600,800};
	int distantX[]= {0,200,800};
	ImageIcon img1= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Do you want to marry me\\src\\images\\heart_1.jpg.png");
	ImageIcon img2= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Do you want to marry me\\src\\images\\1.gif");
	ImageIcon img7= new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Do you want to marry me\\src\\images\\cute.gif");
	
	public doyouwanttomarryme() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1600,1200);
		this.getContentPane().setBackground(Color.black);
		this.setLayout(null);
		this.setResizable(false);
		
		textOne.setBounds(200,100,1000,100);
		textOne.setBackground(Color.black);
		textOne.setForeground(Color.pink);
		textOne.setHorizontalAlignment(JLabel.CENTER);
		textOne.setFont(new Font("NewellsHand",Font.PLAIN,50));
		textOne.setText("ANH ĐỒNG Ý LẤY EM LÀM VỢ NHÉ?");
		
		textTwo.setBounds(400,400,150,100);
		textTwo.setBackground(Color.black);
		textTwo.setForeground(Color.pink);
		textTwo.setHorizontalAlignment(JLabel.CENTER);
		textTwo.setFont(new Font("NewellsHand",Font.PLAIN,40));
		textTwo.setText("Đồng Ý");
		
		gif.setBounds(0,450,300,300);
		gif.setIcon(img7);

		textThree.setBounds(500,600,500,100);
		textThree.setBackground(Color.black);
		textThree.setForeground(Color.pink);
		textThree.setHorizontalAlignment(JLabel.CENTER);
		textThree.setFont(new Font("NewellsHand",Font.PLAIN,30));
		textThree.setText("KO.Còn lâu");
		PointerInfo inf = MouseInfo.getPointerInfo();
		Point p = inf.getLocation();
		

		bg.setBounds(0,-100,1500,1300);
		bg.setIcon(img2);
		heart.setBounds(p.x,p.y,100,100);
		heart.setIcon(img1);
		this.add(bg);
		this.add(textOne);
		this.add(textTwo);
		this.add(textThree);
		this.add(heart);
		this.add(gif);
		textTwo.addMouseListener(this);
		textThree.addMouseListener(this);
		this.setVisible(true);
	}
	public static int getRandom(int[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	public void  After(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1600,1200);
		this.getContentPane().setBackground(Color.black);
		this.setLayout(null);
		this.setResizable(false);
			
		textOne.setBounds(200,0,1000,100);
		textOne.setBackground(Color.black);
		textOne.setForeground(Color.pink);
		textOne.setHorizontalAlignment(JLabel.CENTER);
		textOne.setFont(new Font("NewellsHand",Font.PLAIN,50));
		textOne.setText("Em biết ngay mà. Em yêu anh lắm!");
	
		this.remove(textTwo);
		this.remove(gif);
		this.remove(textThree);
		this.add(textOne);
		this.add(textarea);
		//textOne.addMouseListener(this);
		this.setVisible(true);
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.remove(bg);
		this.remove(textOne);
		After();
		}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		this.remove(bg);
		this.remove(textOne);
		After();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("You released the mouse");
		textTwo.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		PointerInfo inf = MouseInfo.getPointerInfo();
		Point p = inf.getLocation();
		while(true) {
		    int plusX=getRandom(distantX);
			int plusY=getRandom(distantY);
			if (textThree.getX()!=plusX &&textThree.getY()!=plusY ) {
		    textThree.setBounds(plusX,plusY,700,100);
		    this.add(heart);
		    heart.setBounds(p.x,p.y,100,100);
		    break;
			}}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		System.out.println("You exited the component");
		textTwo.setBackground(Color.red);
		this.remove(heart);
	}
}
