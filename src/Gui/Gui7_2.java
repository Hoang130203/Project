package Gui;
import Entity.Question;
import Entity.Quiz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Gui7_2 extends JFrame {
	private String name;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui7_2 frame = new Gui7_2(name);
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
	public Gui7_2(String name) {
		this.name= name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 536, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time limit");
		lblNewLabel.setForeground(new Color(196, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(46, 38, 109, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your attempt will have a time limit of 1 hour. When you start, the timer will begin");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(46, 73, 466, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("to count down and cannot ve paused. You must finish your attempt before it");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(46, 98, 466, 36);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("expires. Are you wish to start now?");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(46, 124, 466, 36);
		contentPane.add(lblNewLabel_1_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(44, 178, 452, 2);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("START ATTEMPT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setBackground(new Color(185, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(46, 191, 161, 41);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCancel_actionPerformed(e);
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.setBackground(new Color(0, 128, 255));
		btnCancel.setBounds(230, 190, 109, 41);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("Start attempt");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(21, 0, 134, 36);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 38, 466, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton_1 = new JButton("EXPORT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnExport_actionPerformed(e);
				}
			});
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(365, 190, 103, 39);
		contentPane.add(btnNewButton_1);
	}
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Gui7_3 gui7_3=new Gui7_3(name);
		Window[] windows = Window.getWindows();
		for (Window window : windows) {
		    window.dispose();
		}
		gui7_3.setVisible(true);
		this.setVisible(false);
//		gui7_2.setVisible(false);
	}
	protected void do_btnExport_actionPerformed(ActionEvent e)
	{
		Export export = new Export(name);
		export.expordPdf();
		this.setVisible(false);
	}
}
