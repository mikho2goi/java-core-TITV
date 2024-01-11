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

import javax.swing.JFileChooser;

import view.NotePadView;

public class MyNotePadController implements ActionListener {
	private NotePadView View;

	public MyNotePadController(NotePadView view) {
		View = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		JFileChooser fc = new JFileChooser();

		if (button.equals("Open")) {
			int returnVal = fc.showOpenDialog(this.View);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String fileName = file.getName();
				this.View.model.setFileName(file.getAbsolutePath());
				this.View.lblNewLabel.setText(this.View.model.getFileName());
				if (fileName.endsWith(".txt")) {
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String result = "";
						for (String line : allText) {
							result += line + "\n";
						}

						this.View.model.setContent(result);
						this.View.textArea.setText(this.View.model.getContent());

					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		} else if (button.equals("Save")) {
			if (this.View.model.getFileName().length() > 0) {
				save(this.View.model.getFileName());
			} else {
				int returnVal = fc.showSaveDialog(this.View);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					save(file.getAbsolutePath());
				}

			}
		}
	}
	public void save(String fileName) {
		try {
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = this.View.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}

}
