package View;

import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(600,400);
		jf.setTitle("VIDU JFRAME");
		
//		while (true) {
//			System.out.println("Chuong trinh dang chay");
//		}
		
		
		jf.setLocation(400,400);
		
		
		//Thoát khỏi chuog trình khi đóng cửa xổ jFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		jf.setVisible(true);
	}
}
