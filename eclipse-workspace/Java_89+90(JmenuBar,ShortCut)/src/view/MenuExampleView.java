package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.MenuExampleListener;


public class MenuExampleView extends JFrame {
	
	private JLabel jlabel_value;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// thanh menu
		JMenuBar jmenubar = new JMenuBar();
		//tao 1 menu
		JMenu jmenu_file = new JMenu("File");
		//menu con
		MenuExampleListener menuExampleListener = new MenuExampleListener(this);
		
		JMenuItem jmenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		jmenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		jmenuItem_new.addActionListener(menuExampleListener);
		
		JMenuItem jmenuItem_save = new JMenuItem("Save", KeyEvent.VK_S);
		jmenuItem_save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
		jmenuItem_save.addActionListener(menuExampleListener);
		
		JMenuItem jmenuItem_save_as = new JMenuItem("Save as", KeyEvent.VK_S);
		jmenuItem_save_as.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.ALT_DOWN_MASK));

		jmenuItem_save_as.addActionListener(menuExampleListener);
		
		JMenuItem jmenuItem_exit = new JMenuItem("EXIT", KeyEvent.VK_X);
		jmenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
		jmenuItem_exit.addActionListener(menuExampleListener);
		
		jmenu_file.add(jmenuItem_new);
		jmenu_file.add(jmenuItem_save);
		jmenu_file.addSeparator();
		jmenu_file.add(jmenuItem_save_as);
		jmenu_file.add(jmenuItem_exit);
		
		JMenu jmenu_help = new JMenu("Help");
		jmenu_help.setMnemonic(KeyEvent.VK_1);
		
		JMenuItem jmenu_contact = new JMenuItem("Contact now");
		jmenu_contact.addActionListener(menuExampleListener);
		jmenu_contact.setMnemonic(KeyEvent.VK_0);
		jmenu_help.add(jmenu_contact);
		
	
		
		jmenubar.add(jmenu_file);
		jmenubar.add(jmenu_help);
		
		
		//label su kien
		Font font = new Font("Arial", Font.BOLD, 25);
		JLabel jlabel = new JLabel("Bạn Đã Chọn: ");
		jlabel.setFont(font);
		jlabel_value = new JLabel();
		jlabel_value.setFont(font);
		
		this.setJMenuBar(jmenubar);
		this.setLayout(new FlowLayout());
		this.add(jlabel);
		this.add(jlabel_value);
		this.setVisible(true);
	}
	public void setText(String luachon) {
		this.jlabel_value.setText(luachon);
	}
}
