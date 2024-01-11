package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JFileChooser;

import view.NotePadView;
public class NotePadController implements ActionListener{
	private NotePadView view;
	
	public NotePadController(NotePadView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		JFileChooser fc = new JFileChooser();
		
		if(button.equals("Open")) {
			int returnval = fc.showOpenDialog(this.view);
			if(returnval == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String tenFile = file.getName();
				this.view.model.setFileName(file.getAbsolutePath());
				this.view.lblNewLabel.setText(this.view.model.getFileName());
				if(tenFile.endsWith(".txt")) {
					String result =""; 
				try {
					List<String> allText = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
					for (String line : allText) {
						result += line+"\n";
					}
					if(result.length() > 0) {
						result = result.substring(0,result.length()-1);
					}
					this.view.model.setConTent(result);
					this.view.textArea.setText(this.view.model.getConTent());
				
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				}
			}
		}else if(button.equals("Save")) {
			if(this.view.model.getFileName().length()>0) {
				try {
					save(this.view.model.getFileName());
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();
				}
			}else {
				int returnVal = fc.showSaveDialog(this.view);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					try {
						save(file.getAbsolutePath());
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (UnsupportedEncodingException e1) {
						e1.printStackTrace();
					}
				}
				
			}
			
		}
		
		
	
		
	}
	
	public void save(String tenfile) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter pw = new PrintWriter(tenfile,"UTF-8");
		String data = this.view.textArea.getText();
		pw.print(data);
		pw.flush();
		pw.close();
	}
	
	

}
