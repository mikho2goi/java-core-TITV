package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleListener;
import controller.MouseMenuListener;


public class MenuExampleView extends JFrame {
	
	private JLabel jlabel_value;
	public JPopupMenu jPoupMenu;
	private JToolBar jtoolBar;
	
	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		// thanh menu
		JMenuBar jmenubar = new JMenuBar();
		//tao 1 menu
		JMenu jmenu_file = new JMenu("File");
		//menu con
		MenuExampleListener menuExampleListener = new MenuExampleListener(this);
		MouseMenuListener mml = new MouseMenuListener(this);
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
		
		//Menu view
		JMenu jmenuView = new JMenu("View");
		JCheckBoxMenuItem jCheckBoxMenu_Item_Toolbar = new JCheckBoxMenuItem("Toolbar");
		jmenuView.add(jCheckBoxMenu_Item_Toolbar);
		jCheckBoxMenu_Item_Toolbar.addActionListener(menuExampleListener);;
		
		// Menu Help
		JMenu jmenu_help = new JMenu("Help");
		jmenu_help.setMnemonic(KeyEvent.VK_1);
		
		JMenuItem jmenu_contact = new JMenuItem("Contact now");
		jmenu_contact.addActionListener(menuExampleListener);
		jmenu_contact.setMnemonic(KeyEvent.VK_0);
		jmenu_help.add(jmenu_contact);
		
	
		//add jmenu
		jmenubar.add(jmenu_file);
		jmenubar.add(jmenuView);
		jmenubar.add(jmenu_help);
		
		//Tạo thanh công cụ(Tool Bar)
		
		jtoolBar = new JToolBar();
		JButton jButton_Undo = new JButton("Undo");
		jButton_Undo.setToolTipText("Nhấn vào đây để quay lại thao tác vừa rồi!");
		jButton_Undo.addActionListener(menuExampleListener);
		
		JButton jButton_Redo = new JButton("Redo");
		jButton_Redo.addActionListener(menuExampleListener);
		jButton_Redo.setToolTipText("Nhấn vào đây để quay lại cửa sổ vừa rồi");
		
		JButton jButton_Copy = new JButton("Copy");
		jButton_Copy.addActionListener(menuExampleListener);
		jButton_Copy.setToolTipText("Nhấn vào đây để sao chép");

		JButton jButton_Cut = new JButton("Cut");
		jButton_Cut.addActionListener(menuExampleListener);
		jButton_Cut.setToolTipText("Nhấn vào đây để cắt");

		
		JButton jButton_Paste = new JButton("Paste");
		jButton_Paste.addActionListener(menuExampleListener);
		jButton_Paste.setToolTipText("Nhấn vào đây để dán");

		
		jtoolBar.add(jButton_Undo);
		jtoolBar.add(jButton_Redo);
		jtoolBar.add(jButton_Copy);
		jtoolBar.add(jButton_Cut);
		jtoolBar.add(jButton_Paste);
		jtoolBar.add(jButton_Undo);
		
		
		// tạo menu khi click chuột phải
	
		jPoupMenu = new JPopupMenu();
		
		JMenu jMenuPoupFont = new JMenu("Font");
		JMenuItem jMenuItemType = new JMenuItem("Type");
		JMenuItem jMenuItemSize = new JMenuItem("Size");
		jMenuPoupFont.add(jMenuItemSize);
		jMenuPoupFont.add(jMenuItemType);
		
		JMenuItem jmenuItemCut = new JMenuItem("Cut");
		JMenuItem jmenuItemCopy = new JMenuItem("Copy");
		JMenuItem jmenuItemPaste = new JMenuItem("Paste");
		
		jPoupMenu.add(jMenuPoupFont);
		jPoupMenu.addSeparator();
		jPoupMenu.add(jmenuItemCut);
		jPoupMenu.add(jmenuItemCopy);
		jPoupMenu.add(jmenuItemPaste);
		this.add(jPoupMenu);
		
		//Thêm sự kiện cho poupmenu
	
		this.addMouseListener(mml);
		//label su kien
		Font font = new Font("Arial", Font.BOLD, 25);
		jlabel_value = new JLabel();
		jlabel_value.setFont(font);
		
		this.setJMenuBar(jmenubar);
		
		this.add(jlabel_value,BorderLayout.CENTER);
		this.setVisible(true);
	}
	public void setText(String luachon) {
		this.jlabel_value.setText(luachon);
	}
	public void enableToolBar() {
		this.add(jtoolBar,BorderLayout.NORTH);
		this.refresh();
	}
	public void disableToolBar() {
		this.remove(jtoolBar);
		this.refresh();
	}
	public void refresh() {
		this.pack();
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
	}
}
