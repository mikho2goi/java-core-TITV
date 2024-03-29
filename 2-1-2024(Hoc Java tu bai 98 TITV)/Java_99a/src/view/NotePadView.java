package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.NotePadController;
import model.NotePadModel;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;

public class NotePadView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public NotePadModel model = new NotePadModel();
	public JTextArea textArea;
	public JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					NotePadView frame = new NotePadView();
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
	public NotePadView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		NotePadController ac = new NotePadController(this);
		
		this.setVisible(true);
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 50));
		panel.setSize(50, 50);
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(ac);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSave.setBounds(495, 11, 119, 28);
		panel.add(btnSave);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(ac);
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOpen.setBounds(340, 11, 127, 28);
		panel.add(btnOpen);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 16, 320, 18);
		panel.add(lblNewLabel);
		
		this.setLocationRelativeTo(null);
		
	}
}
