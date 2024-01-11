package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseExampleController;
import model.MouserExampleModel;

public class MouseExampleView extends JFrame{
	private	MouserExampleModel mouseExampleModel = new MouserExampleModel();
	private JPanel jpanel_MouseClick;
	private JPanel jpanel_Info;
	private JLabel jpanel_position;
	private JLabel jlabel_x;
	private JLabel jlabel_y;
	private JLabel jlabel_count;
	private JLabel jlabel_empty1;
	private JLabel jlabel_count_value;
	private JLabel jlabel_check_in;
	private JLabel jlabel_check_in_value;
	private Container jlabel_empty2;

	public MouseExampleView( ) throws HeadlessException {
		this.mouseExampleModel = new MouserExampleModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Mouse Event");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial",Font.BOLD,16);

		MouseExampleController mouseController = new MouseExampleController(this);
		
		jpanel_MouseClick = new JPanel();
		jpanel_MouseClick.setBackground(Color.blue);
		jpanel_MouseClick.addMouseListener(mouseController);
		jpanel_MouseClick.addMouseMotionListener(mouseController);
		
		jpanel_Info = new JPanel();
		jpanel_Info.setLayout(new GridLayout(3,3));
		jpanel_Info.setBackground(Color.cyan);
		
		jpanel_position = new JLabel("Position: ");
		jpanel_position.setFont(font);
		
		jlabel_x = new JLabel("x=");
		jlabel_x.setFont(font);
		
		jlabel_y = new JLabel("y=");
		jlabel_y.setFont(font);
		
		jlabel_count = new JLabel("Numbers of clicks: ");
		jlabel_count.setFont(font);
		
		jlabel_empty1 = new JLabel();
		jlabel_empty1.setFont(font);
		
		jlabel_count_value = new JLabel("n");
		jlabel_count_value.setFont(font);
		
		jlabel_check_in = new JLabel("Mouse is in conponent: ");
		jlabel_check_in.setFont(font);
		
		jlabel_check_in_value = new JLabel("NO");
		jlabel_check_in_value.setFont(font);
		
		jlabel_empty2 = new JLabel();
		jlabel_empty2.setFont(font);
		
		jpanel_Info.add(jpanel_position);
		jpanel_Info.add(jlabel_x);
		jpanel_Info.add(jlabel_y);
		jpanel_Info.add(jlabel_count);
		jpanel_Info.add(jlabel_count_value);
		jpanel_Info.add(jlabel_empty1);
		jpanel_Info.add(jlabel_check_in);
		jpanel_Info.add(jlabel_check_in_value);
		jpanel_Info.add(jlabel_empty2);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_MouseClick,BorderLayout.CENTER);
		this.add(jpanel_Info,BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addClick() {
		this.mouseExampleModel.addClick();
		this.jlabel_count_value.setText(this.mouseExampleModel.getCount()+"");
		
	}

	public void enter() {
		this.mouseExampleModel.enter();
		this.jlabel_check_in_value.setText(this.mouseExampleModel.getCheckIn());
	}
	public void exit() {
		this.mouseExampleModel.exit();
		this.jlabel_check_in_value.setText(this.mouseExampleModel.getCheckIn());
	}
	
	public void update(int x, int y) {
		this.mouseExampleModel.setX(x);
		this.mouseExampleModel.setY(y);
		this.jlabel_x.setText(this.mouseExampleModel.getX()+"");
		this.jlabel_y.setText(this.mouseExampleModel.getY()+"");
	}
	
}
