package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Label;
import java.awt.TextField;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public QLSVModel model;
	public JTextField textField_mssv;
	public JTable table;
	public TextField textFieldMaThiSinh;
	public TextField textFieldHoTen;
	public TextField textFieldNgaySinh;
	public TextField textFieldMon1;
	public TextField textFieldMon2;
	public TextField textFieldMon3;
	public ButtonGroup btnGroup;
	public JComboBox comboBox_queQuan_thongTin;
	public JComboBox comboBox_QueQuanTimKiem;
	public JRadioButton rdbtnNam;
	public JRadioButton radioBtnNu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public QLSVView() {
		QLSVController ac = new QLSVController(this);
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 739);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.addActionListener(ac);
		menuFile.add(menuOpen);
		
		JMenuItem menuSave = new JMenuItem("Save");
		menuSave.addActionListener(ac);
		menuFile.add(menuSave);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(ac);
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(menuAbout);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("About Me");
		mntmNewMenuItem_3.addActionListener(ac);
		menuAbout.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_QueQuan = new JLabel("Quê Quán");
		label_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_QueQuan.setBounds(10, 4, 81, 51);
		contentPane.add(label_QueQuan);
		
		JLabel label_mssv = new JLabel("Mã Sinh Viên");
		label_mssv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_mssv.setBounds(249, 4, 109, 51);
		contentPane.add(label_mssv);
		
		textField_mssv = new JTextField();
		textField_mssv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_mssv.setColumns(10);
		textField_mssv.setBounds(349, 11, 136, 37);
		contentPane.add(textField_mssv);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.addActionListener(ac);
		btnTim.addActionListener(ac);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTim.setBounds(505, 11, 122, 37);
		contentPane.add(btnTim);
		
		JButton btnHuyTim = new JButton("Hủy Tìm");
		btnHuyTim.addActionListener(ac);
		btnHuyTim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHuyTim.setBounds(634, 11, 122, 37);
		contentPane.add(btnHuyTim);
		
		comboBox_QueQuanTimKiem = new JComboBox<>();
		comboBox_QueQuanTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		
		for (Tinh tinh : listTinh) {
			comboBox_QueQuanTimKiem.addItem(tinh.getTenTinh());
		}
		comboBox_QueQuanTimKiem.setBounds(89, 11, 150, 38);
		contentPane.add(comboBox_QueQuanTimKiem);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 59, 714, 2);
		contentPane.add(separator_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Th\u00ED Sinh", "H\u1ECD T\u00EAn", "Qu\u00EA Qu\u00E1n", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		table.setRowHeight(27);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 99, 746, 221);
		contentPane.add(scrollPane);
		
		Label label = new Label("Danh Sách Thí Sinh");
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		label.setBounds(10, 68, 136, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Mã Thí Sinh *");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1.setBounds(24, 397, 81, 22);
		contentPane.add(label_1);
		
		Label label_1_1 = new Label("Họ và Tên *");
		label_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1.setBounds(24, 438, 81, 22);
		contentPane.add(label_1_1);
		
		Label label_1_2 = new Label("Ngày Sinh *");
		label_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_2.setBounds(24, 478, 81, 22);
		contentPane.add(label_1_2);
		
		Label label_1_3 = new Label("Quê Quán *");
		label_1_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_3.setBounds(24, 520, 81, 30);
		contentPane.add(label_1_3);
		
		Label label_1_4 = new Label("Thông Tin Thí Sinh");
		label_1_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_1_4.setBounds(10, 339, 144, 22);
		contentPane.add(label_1_4);
		
		textFieldMaThiSinh = new TextField();
		textFieldMaThiSinh.setBounds(111, 397, 171, 22);
		contentPane.add(textFieldMaThiSinh);
		
		textFieldHoTen = new TextField();
		textFieldHoTen.setBounds(111, 438, 171, 22);
		contentPane.add(textFieldHoTen);
		
		textFieldNgaySinh = new TextField();
		textFieldNgaySinh.setBounds(111, 478, 171, 22);
		contentPane.add(textFieldNgaySinh);
		
		comboBox_queQuan_thongTin = new JComboBox();
		for (Tinh tinh : listTinh) {
			comboBox_queQuan_thongTin.addItem(tinh.getTenTinh());
		}
		
		comboBox_queQuan_thongTin.setBounds(111, 520, 171, 30);
		contentPane.add(comboBox_queQuan_thongTin);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 588, 746, 2);
		contentPane.add(separator_2);
		
		JButton btnThem = new JButton("Thêm Mới");
		btnThem.addActionListener(ac);
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnThem.setBounds(10, 616, 95, 45);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(ac);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXoa.setBounds(160, 616, 100, 45);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("Cập Nhật");
		btnCapNhat.addActionListener(ac);
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCapNhat.setBounds(316, 616, 95, 45);
		contentPane.add(btnCapNhat);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(ac);
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLuu.setBounds(479, 616, 95, 45);
		contentPane.add(btnLuu);
		
		JButton btnHuy = new JButton("Hủy Bỏ");
		btnHuy.addActionListener(ac);
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHuy.setBounds(649, 616, 89, 45);
		contentPane.add(btnHuy);
		
		textFieldMon1 = new TextField();
		textFieldMon1.setBounds(479, 418, 171, 22);
		contentPane.add(textFieldMon1);
		
		Label label_1_5 = new Label("Môn 1");
		label_1_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_5.setBounds(387, 418, 81, 22);
		contentPane.add(label_1_5);
		
		Label label_1_1_1 = new Label("Môn 2");
		label_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_1_1.setBounds(387, 459, 62, 22);
		contentPane.add(label_1_1_1);
		
		textFieldMon2 = new TextField();
		textFieldMon2.setBounds(479, 459, 171, 22);
		contentPane.add(textFieldMon2);
		
		textFieldMon3 = new TextField();
		textFieldMon3.setBounds(479, 499, 171, 22);
		contentPane.add(textFieldMon3);
		
		Label label_1_2_1 = new Label("Môn 3");
		label_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1_2_1.setBounds(387, 499, 62, 22);
		contentPane.add(label_1_2_1);
		
		rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setBounds(479, 376, 81, 23);
		contentPane.add(rdbtnNam);
		
		radioBtnNu = new JRadioButton("Nữ");
		radioBtnNu.setBounds(562, 376, 109, 23);
		contentPane.add(radioBtnNu);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnNam);
		btnGroup.add(radioBtnNu);
		
		JLabel lblNewLabel = new JLabel("Giới Tính *");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(387, 379, 81, 14);
		contentPane.add(lblNewLabel);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 331, 746, 2);
		contentPane.add(separator_2_1);

		
		
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	public void xoaForm() {
		textFieldHoTen.setText("");
		textFieldMaThiSinh.setText("");
		textFieldNgaySinh.setText("");
		textFieldMon1.setText("");
		textFieldMon2.setText("");
		textFieldMon3.setText("");
		btnGroup.clearSelection();
		comboBox_queQuan_thongTin.setSelectedIndex(-1);;
	}

	public void themHoacCapNhatThiSinh(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String maThiSinh = ts.getMaThiSinh()+"";
		if(!this.model.kiemTraTonTai(ts)) {
			this.model.insert(ts);
			this.themThiSinhVaoTable(ts);
		}	
		else {
			this.model.update(ts);
			int soLuongDong = model_table.getRowCount(); 
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0)+"";
				if(id.equals(ts.getMaThiSinh()+"")) {
					model_table.setValueAt(ts.getMaThiSinh(), i, 0);
					model_table.setValueAt(ts.getTenThiSinh(), i, 1);
					model_table.setValueAt(ts.getQueQuan().getTenTinh(), i, 2);
					model_table.setValueAt(df.format(ts.getNgaySinh()), i, 3);
					model_table.setValueAt((ts.isGioiTinh())?"Nam":"Nữ", i, 4);
					model_table.setValueAt(ts.getDiemMon1()+"", i, 5);
					model_table.setValueAt(ts.getDiemMon2()+"", i, 6);
					model_table.setValueAt(ts.getDiemMon3()+"", i, 7);
				}
			}
		}
	}
	public ThiSinh getThiSinhDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		
		String maThiSinh = model_table.getValueAt(i_row, 0)+"";
		String tenThiSinh = model_table.getValueAt(i_row, 1)+"";
		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2)+"");
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date ngaySinh = null;
		try {
			 ngaySinh = df.parse(model_table.getValueAt(i_row, 3)+"");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String TextGioiTinh = model_table.getValueAt(i_row, 4)+"";
		boolean GioiTinh;
		if(TextGioiTinh.equals("Nam")) {
			GioiTinh = true;
		}else {
			GioiTinh = false;
		}
		
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, GioiTinh, diemMon1, diemMon2, diemMon3);
		return ts;
	}

	public void hienThiThongTinThiSinhDaChon() {
		
		ThiSinh ts = getThiSinhDangChon();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		this.textFieldMaThiSinh.setText(ts.getMaThiSinh()+"");
		this.textFieldHoTen.setText(ts.getTenThiSinh()+"");
		this.comboBox_queQuan_thongTin.setSelectedItem(ts.getQueQuan().getTenTinh());
		this.textFieldNgaySinh.setText(df.format(ts.getNgaySinh()));
		if(ts.isGioiTinh()) {
			this.rdbtnNam.setSelected(true);
		}else {
			this.radioBtnNu.setSelected(true);
			
		}
		this.textFieldMon1.setText(ts.getDiemMon1()+"");
		this.textFieldMon2.setText(ts.getDiemMon2()+"");
		this.textFieldMon3.setText(ts.getDiemMon3()+"");

	}
	
	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc xóa thí sinh này ?");
		if (luaChon == JOptionPane.YES_OPTION) {
			ThiSinh ts = getThiSinhDangChon();
			this.model.remove(ts);
			model_table.removeRow(i_row);
		}
	}

	public void thucHienThemThiSinh() {
	
		try {
			// lấy dữ liệu
			String maThiSinh = this.textFieldMaThiSinh.getText();
			String tenThiSinh = this.textFieldHoTen.getText();
			
			int queQuan = this.comboBox_queQuan_thongTin.getSelectedIndex();
			if(queQuan == 0 ||maThiSinh.length() == 0 || tenThiSinh.length()==0 || this.btnGroup.getSelection()== null) {
				JOptionPane.showMessageDialog(this, "Hãy Điền Đủ Thông Tin Có Đánh Dấu (*)");
				
			}else {
			Tinh tinh = Tinh.getTinhById(queQuan);
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date ngaySinh = null;
			try {
				ngaySinh = df.parse(this.textFieldNgaySinh.getText());
			} catch (ParseException e1) {
				e1.printStackTrace();
			}

			boolean gioiTinh = true;
			ButtonModel chonGioiTinh = this.btnGroup.getSelection();
			if (chonGioiTinh.equals(this.rdbtnNam.getModel())) {
				gioiTinh = true;
			} else {
				gioiTinh = false;
			}
			float diemMon1 = Float.valueOf(this.textFieldMon1.getText());
			float diemMon2 = Float.valueOf(this.textFieldMon2.getText());
			float diemMon3 = Float.valueOf(this.textFieldMon3.getText());

			ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
			this.themHoacCapNhatThiSinh(ts);
			}
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		}
	}

	public void thucHienTim() {
		taiLaiDuLieu();
		int queQuan = this.comboBox_QueQuanTimKiem.getSelectedIndex();
		String maThiSinhCanTim = this.textField_mssv.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDong = model_table.getRowCount();
// tạo chổ lưu thí sinh cần xóa
		Set<String> danhSachMaThiSinhCanXoa = new HashSet<String>();
// thêm mã số thằng cần xóa vào danh sách cần xóa nếu quê quán trong table ko giống như quê quán muốn tìm
		if(queQuan > 0) {
			Tinh tinhDaChon = Tinh.getTinhById(queQuan);
			for (int i = 0; i < soLuongDong; i++) {
				String tenTinhTrongTable = model_table.getValueAt(i, 2) + "";
				String id = (String) model_table.getValueAt(i, 0);
				if(!tenTinhTrongTable.equals(tinhDaChon.getTenTinh())) {
					danhSachMaThiSinhCanXoa.add(id);
				}
			}
		}
//thêm mã số thằng cần xóa vào danh sách cần xóa nếu mã số thí sinh trong table ko giống như mã số muốn tìm
		if(maThiSinhCanTim.length() > 0) {
			for (int i = 0; i < soLuongDong; i++) {
				String maThiSinhTrongTable = model_table.getValueAt(i, 0)+"";
				if(!(maThiSinhTrongTable.equals(maThiSinhCanTim))) {
					danhSachMaThiSinhCanXoa.add(maThiSinhTrongTable);
				}
			}
		}
		
// với mỗi mã số cần xóa trong danh sách so với từng dòng  dòng nào có mã số giống mã số trong danh sách thì remove
		
		for (String maCanXoa : danhSachMaThiSinhCanXoa) {
			for (int i = 0; i < soLuongDong; i++) {
				String maThiSinhTrongTable = model_table.getValueAt(i, 0)+"";
					if(maThiSinhTrongTable.equals(maCanXoa)) {
						try {
							model_table.removeRow(i);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					}
				}
			}
	}
// hàm thêm thí sinh vào lại table
	public void themThiSinhVaoTable(ThiSinh ts){
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				model_table.addRow(new Object[]
						   {ts.getMaThiSinh(),
						    ts.getTenThiSinh(),
						    ts.getQueQuan().getTenTinh(),
						    df.format(ts.getNgaySinh()),
						   (ts.isGioiTinh())?"Nam":"Nữ",
						    ts.getDiemMon1()+"",
						    ts.getDiemMon2()+"",
						    ts.getDiemMon3()+"",
							});
	}
	
	
	
// Hàm tải lại dữ liệu để hiển thị lại danh sách đầu lúc chưa tìm
	public void taiLaiDuLieu() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDong = model_table.getRowCount();
		while (soLuongDong > 0) {
			model_table.removeRow(0);
			soLuongDong--;
		}
		for (ThiSinh ts : this.model.getDsThiSinh()) {
			this.themThiSinhVaoTable(ts);
		}
	}

	public void aboutMe() {
		 JOptionPane.showMessageDialog(this, "Phần Mềm Quản Lý Sinh Viên\nVersion 1.0\n8-1-2024");
		
	}
	
	
	public void exit() {
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn Có Chắc Muốn Thoát Khỏi Chương Trình","Xác Nhận Thoát", JOptionPane.YES_NO_OPTION);
		if(luaChon == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	public void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (ThiSinh ts : this.model.getDsThiSinh()) {
				oos.writeObject(ts);
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void thucHienSaveFile() {
		if(this.model.getTenFile().length()>0) {
			saveFile(this.model.getTenFile());
		}else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
			}
		}
	}

	public void openFile(File file) {
		ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
		try {
			this.model.setTenFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ThiSinh ts = null;

			while ((ts = (ThiSinh) ois.readObject()) != null) {
				ds.add(ts);
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.model.setDsThiSinh(ds);
	}
	
	public void thucHienOpenFile() {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				openFile(file);
				taiLaiDuLieu();
			}
		}
}
	
	
	
	
