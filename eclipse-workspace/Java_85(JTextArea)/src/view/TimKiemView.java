package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimKiemListener;
import model.TimKiemModel;

public class TimKiemView extends JFrame{
	private TimKiemModel timKiemModel;
	private JLabel tuKhoa;
	private JTextField jtextfield_Tukhoa;
	private JLabel vanBan;
	private JLabel jlabel_KetQua;
	private JTextArea jtextArea;

	public TimKiemView() throws HeadlessException {
		this.timKiemModel = new TimKiemModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Cửa sổ tìm kiếm");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial", Font.BOLD, 40);
		//center
		vanBan = new JLabel("Văn Bản",JLabel.CENTER);
		vanBan.setFont(font);
		
		jtextArea = new JTextArea(100,100);
		jtextArea.setFont(font);
		
		JScrollPane jscrollpane = new JScrollPane(jtextArea);


		// listener
		TimKiemListener TL = new TimKiemListener(this);
		// footer
		tuKhoa = new JLabel("Từ Khóa",JLabel.CENTER);
		tuKhoa.setFont(font);
		jtextfield_Tukhoa = new JTextField();
		jtextfield_Tukhoa.setFont(font);
		
		
		
		JButton jButton_ThongKe = new JButton("THONG KE");
		jButton_ThongKe.setFont(font);
		jButton_ThongKe.addActionListener(TL);
		jButton_ThongKe.setBackground(Color.GREEN);
		jButton_ThongKe.setBorderPainted(false);
		jlabel_KetQua = new JLabel("asdasd");
		jlabel_KetQua.setFont(font);
		
		JPanel jpanel_Footer = new JPanel();
		jpanel_Footer.setLayout(new GridLayout(2,2));
		jpanel_Footer.add(tuKhoa);
		jpanel_Footer.add(jtextfield_Tukhoa);
		jpanel_Footer.add(jButton_ThongKe);
		jpanel_Footer.add(jlabel_KetQua);
		
		this.setLayout(new BorderLayout());
		this.add(vanBan,BorderLayout.NORTH);
		this.add(jscrollpane,BorderLayout.CENTER);
		this.add(jpanel_Footer,BorderLayout.SOUTH);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void timKiemView() {
		this.timKiemModel.setTuKhoa(this.jtextfield_Tukhoa.getText());
		this.timKiemModel.setVanBan(this.jtextArea.getText());
		this.timKiemModel.timKiem();
		this.jlabel_KetQua.setText(this.timKiemModel.getKetQua());
	}
	
	
}
