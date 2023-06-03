package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class JInternalFrameSetting extends JInternalFrame {
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameSetting frame = new JInternalFrameSetting();
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
	public JInternalFrameSetting() {
		setClosable(true);
		setFrameIcon(null);
		setBounds(100, 100, 526, 228);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Question Bank");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 60, 170, 52);
		desktopPane.add(lblNewLabel);
		
		JButton btnQuestions = new JButton("Questions");
		btnQuestions.setBackground(new Color(255, 255, 255));
		btnQuestions.setBorder(null);
		btnQuestions.setForeground(new Color(0, 128, 255));
		btnQuestions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnQuestions.setBounds(313, 26, 114, 21);
		desktopPane.add(btnQuestions);
		
		JButton btnCategory = new JButton("Category");
		btnCategory.setForeground(new Color(0, 128, 255));
		btnCategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCategory.setBorder(null);
		btnCategory.setBackground(Color.WHITE);
		btnCategory.setBounds(313, 60, 114, 21);
		desktopPane.add(btnCategory);
		
		JButton btnImport = new JButton("Import");
		btnImport.setForeground(new Color(0, 128, 255));
		btnImport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnImport.setBorder(null);
		btnImport.setBackground(Color.WHITE);
		btnImport.setBounds(313, 91, 114, 27);
		desktopPane.add(btnImport);
		
		JButton btnExport = new JButton("Export");
		btnExport.setForeground(new Color(0, 128, 255));
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExport.setBorder(null);
		btnExport.setBackground(Color.WHITE);
		btnExport.setBounds(313, 128, 114, 21);
		desktopPane.add(btnExport);

	}
}
