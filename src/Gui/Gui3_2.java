package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import DAT.FileDsQuestionBank;
import Entity.JtextpanePro;
import Entity.Question;
import Entity.QuestionBank;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Gui3_2 extends JFrame {
	int trangthai=0;
	private JPanel panel_3_5;
	private JPanel panel_3_4;
	private JPanel panel_3_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textChoice_1;
	private JComboBox comboBox_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panel_2;
	private JScrollPane scrollPane_1;
	private JButton btnNewButton_2_1;
	private JButton btnNewButton_2_2;
	private JButton btnNewButton_2_3;
	private JTextField textChoice_2;
	private JtextpanePro textPane;
	private JTextField textField_2;
	private JTextField textChoice_3;
	private JTextField textChoice_4;
	private JTextField textChoice_5;
	private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui3_2 frame = new Gui3_2();
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
	public Gui3_2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 3, 803, 865);
		JPanel jPanel= new JPanel();
		JPanel contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(703,1100));
		contentPane.setAutoscrolls(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(jPanel);
		contentPane.setLayout(null);
//		contentPane.setBounds(0,0,660,802);
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(0, 0, 771, 39);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 128, 255));
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 45, 761, 86);
		panel.setLayout(null);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("IT\r\n");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(21, 10, 45, 21);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(21, 55, 57, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("/ My courses /");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(62, 57, 85, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("/");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(228, 59, 45, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("THI CUỐI KỲ     Questions bank      Questions");
		lblNewLabel_3.setBounds(146, 56, 275, 18);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_4_1 = new JLabel("/");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(331, 51, 45, 29);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("/ Editing a Multiple choice question");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setBounds(412, 56, 197, 18);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 141, 761, 949);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Adding a Multiple choice question");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(20, 10, 341, 30);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("General");
		lblNewLabel_7.setIcon(new ImageIcon(Gui3_2.class.getResource("/Resources/211614_down_b_arrow_icon.png")));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setBounds(20, 69, 80, 29);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Category");
		lblNewLabel_8.setFont(lblNewLabel_8.getFont().deriveFont(12f));
		lblNewLabel_8.setBounds(20, 108, 80, 22);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Question name");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(20, 145, 96, 15);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Question text");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(20, 176, 96, 24);
		panel_1.add(lblNewLabel_10);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setBounds(317, 102, 246, 30);
		try {
			DefaultComboBoxModel<String> dcb= new FileDsQuestionBank().listCategory();
			comboBox.setModel(dcb);
		} catch (Exception e) {
			// TODO: handle exception
		}
		panel_1.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(317, 144, 291, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(317, 184, 425, 173);
		panel_1.add(scrollPane);
		
		textPane = new JtextpanePro();
		scrollPane.setViewportView(textPane);
		
		JLabel lblNewLabel_11 = new JLabel("Default Mark");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(20, 365, 80, 22);
		panel_1.add(lblNewLabel_11);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setText("1");
		textField_1.setBounds(164, 366, 70, 22);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setAutoscrolls(true);
		scrollPane_1.setBounds(1, 413, 741, 532);
		panel_1.add(scrollPane_1);
		
		
		panel_2 = new JPanel();
		
		scrollPane_1.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(239, 239, 239)));
		panel_3.setAutoscrolls(true);
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(356, 21, 299, 156);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("Choice 1");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(10, 59, 56, 22);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_12_1 = new JLabel("Grade");
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_1.setBounds(10, 91, 45, 22);
		panel_3.add(lblNewLabel_12_1);
		
		textChoice_1 = new JTextField();
		textChoice_1.setBounds(66, 59, 201, 22);
		panel_3.add(textChoice_1);
		textChoice_1.setColumns(10);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_1_actionPerformed(e);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Gui3_2.class.getResource("/Resources/3209322_download_import_in_keep_save_icon.png")));
		btnNewButton_1.setBounds(261, 59, 28, 22);
		panel_3.add(btnNewButton_1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setMaximumRowCount(19);
		comboBox_1.setAutoscrolls(true);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"None", "100%", "90%", "83.33333%", "80%", "75%", "70%", "66.66667%", "60%", "50%", "40%", "33.3333%", "25%", "20%", "16.66667%", "14.28571%", "12.5%", "11.11111%", "10%", "5%", "-5%", "-10%", "-11.11111%", "-12.5%", "-14.28571%", "-16.66667%", "-20%", "-25%", "-30%", "-33.33333%", "-40%", "-50%", "-60%", "-66.66667%", "-70%", "-75%", "-80%", "-83.33333%"}));
		comboBox_1.setBounds(66, 92, 95, 22);
		panel_3.add(comboBox_1);
		
		JTextPane textPane_1 = new JTextPane();
//		textPane_1.setBorder(new LineBorder(1, 0, 0, 0));
		textPane_1.setBackground(new Color(239, 239, 239));
		textPane_1.setBounds(66, 2, 223, 58);
		panel_3.add(textPane_1);
		
		btnNewButton_2 = new JButton("BLANK FOR MORE 3 CHOICES");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_2_actionPerformed(e);
			}
		});
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(0, 118, 236));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(366, 368, 235, 31);
		panel_2.add(btnNewButton_2);
		
		btnNewButton_2_1 = new JButton("SAVE CHANGES AND CONTINUE EDITING");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_2_1_actionPerformed(e);
			}
		});
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(new Color(0, 118, 236));
		btnNewButton_2_1.setBounds(385, 421, 284, 31);
		panel_2.add(btnNewButton_2_1);
		
		btnNewButton_2_2 = new JButton("CANCEL");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_2_2_actionPerformed(e);
			}
		});
		btnNewButton_2_2.setForeground(Color.WHITE);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_2.setBorder(null);
		btnNewButton_2_2.setBackground(new Color(0, 118, 236));
		btnNewButton_2_2.setBounds(488, 462, 121, 31);
		panel_2.add(btnNewButton_2_2);
		
		btnNewButton_2_3 = new JButton("SAVE CHANGES");
		btnNewButton_2_3.setForeground(Color.WHITE);
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_3.setBorder(null);
		btnNewButton_2_3.setBackground(new Color(172, 0, 0));
		btnNewButton_2_3.setBounds(366, 462, 117, 31);
		panel_2.add(btnNewButton_2_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(239, 239, 239)));
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setAutoscrolls(true);
		panel_3_1.setBounds(356, 197, 299, 156);
		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_12_2 = new JLabel("Choice 2");
		lblNewLabel_12_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_2.setBounds(10, 59, 56, 22);
		panel_3_1.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("Grade");
		lblNewLabel_12_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_1_1.setBounds(10, 91, 45, 22);
		panel_3_1.add(lblNewLabel_12_1_1);
		
		textChoice_2 = new JTextField();
		textChoice_2.setColumns(10);
		textChoice_2.setBounds(66, 59, 201, 22);
		panel_3_1.add(textChoice_2);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(Gui3_2.class.getResource("/Resources/3209322_download_import_in_keep_save_icon.png")));
		btnNewButton_1_1.setBounds(261, 59, 28, 22);
		panel_3_1.add(btnNewButton_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setMaximumRowCount(19);
		comboBox_1_1.setAutoscrolls(true);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"None", "100%", "90%", "83.33333%", "80%", "75%", "70%", "66.66667%", "60%", "50%", "40%", "33.3333%", "25%", "20%", "16.66667%", "14.28571%", "12.5%", "11.11111%", "10%", "5%", "-5%", "-10%", "-11.11111%", "-12.5%", "-14.28571%", "-16.66667%", "-20%", "-25%", "-30%", "-33.33333%", "-40%", "-50%", "-60%", "-66.66667%", "-70%", "-75%", "-80%", "-83.33333%"}));
		comboBox_1_1.setBounds(66, 92, 95, 22);
		panel_3_1.add(comboBox_1_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setBackground(new Color(239, 239, 239));
		textPane_1_1.setBounds(66, 2, 223, 58);
		panel_3_1.add(textPane_1_1);
		JScrollPane jScrollPane = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPane.setAutoscrolls(true);
		jScrollPane.setPreferredSize(new Dimension(790,830));
		scrollPane_1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		JLabel lblNewLabel_11_1 = new JLabel("ANSWER :");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11_1.setBounds(317, 373, 80, 22);
		panel_1.add(lblNewLabel_11_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(393, 368, 70, 35);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		jPanel.add(jScrollPane);
		
		panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBorder(new LineBorder(new Color(239, 239, 239)));
		panel_3_3.setBackground(Color.WHITE);
		panel_3_3.setAutoscrolls(true);
		panel_3_3.setBounds(356, 197+176, 299, 156);
//		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_12_3 = new JLabel("Choice 3");
		lblNewLabel_12_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_3.setBounds(10, 59, 56, 22);
		panel_3_3.add(lblNewLabel_12_3);
		
		JLabel lblNewLabel_12_1_3 = new JLabel("Grade");
		lblNewLabel_12_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_1_3.setBounds(10, 91, 45, 22);
		panel_3_3.add(lblNewLabel_12_1_3);
		
		textChoice_3 = new JTextField();
		textChoice_3.setColumns(10);
		textChoice_3.setBounds(66, 59, 201, 22);
		panel_3_3.add(textChoice_3);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setIcon(new ImageIcon(Gui3_2.class.getResource("/Resources/3209322_download_import_in_keep_save_icon.png")));
		btnNewButton_1_3.setBounds(261, 59, 28, 22);
		panel_3_3.add(btnNewButton_1_3);
		
		JComboBox comboBox_1_3 = new JComboBox();
		comboBox_1_3.setMaximumRowCount(19);
		comboBox_1_3.setAutoscrolls(true);
		comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] {"None", "100%", "90%", "83.33333%", "80%", "75%", "70%", "66.66667%", "60%", "50%", "40%", "33.3333%", "25%", "20%", "16.66667%", "14.28571%", "12.5%", "11.11111%", "10%", "5%", "-5%", "-10%", "-11.11111%", "-12.5%", "-14.28571%", "-16.66667%", "-20%", "-25%", "-30%", "-33.33333%", "-40%", "-50%", "-60%", "-66.66667%", "-70%", "-75%", "-80%", "-83.33333%"}));
		comboBox_1_3.setBounds(66, 92, 95, 22);
		panel_3_3.add(comboBox_1_3);
		
		JTextPane textPane_1_3 = new JTextPane();
		textPane_1_3.setBackground(new Color(239, 239, 239));
		textPane_1_3.setBounds(66, 2, 223, 58);
		panel_3_3.add(textPane_1_3);
		
		
		
		panel_3_4 = new JPanel();
		panel_3_4.setLayout(null);
		panel_3_4.setBorder(new LineBorder(new Color(239, 239, 239)));
		panel_3_4.setBackground(Color.WHITE);
		panel_3_4.setAutoscrolls(true);
		panel_3_4.setBounds(356, 197+176*2, 299, 156);
//		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_12_4 = new JLabel("Choice 4");
		lblNewLabel_12_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_4.setBounds(10, 59, 56, 22);
		panel_3_4.add(lblNewLabel_12_4);
		
		JLabel lblNewLabel_12_1_4 = new JLabel("Grade");
		lblNewLabel_12_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_1_4.setBounds(10, 91, 45, 22);
		panel_3_4.add(lblNewLabel_12_1_4);
		
		textChoice_4 = new JTextField();
		textChoice_4.setColumns(10);
		textChoice_4.setBounds(66, 59, 201, 22);
		panel_3_4.add(textChoice_4);
		
		JButton btnNewButton_1_4 = new JButton("");
		btnNewButton_1_4.setIcon(new ImageIcon(Gui3_2.class.getResource("/Resources/3209322_download_import_in_keep_save_icon.png")));
		btnNewButton_1_4.setBounds(261, 59, 28, 22);
		panel_3_4.add(btnNewButton_1_4);
		
		JComboBox comboBox_1_4 = new JComboBox();
		comboBox_1_4.setMaximumRowCount(19);
		comboBox_1_4.setAutoscrolls(true);
		comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] {"None", "100%", "90%", "83.33333%", "80%", "75%", "70%", "66.66667%", "60%", "50%", "40%", "33.3333%", "25%", "20%", "16.66667%", "14.28571%", "12.5%", "11.11111%", "10%", "5%", "-5%", "-10%", "-11.11111%", "-12.5%", "-14.28571%", "-16.66667%", "-20%", "-25%", "-30%", "-33.33333%", "-40%", "-50%", "-60%", "-66.66667%", "-70%", "-75%", "-80%", "-83.33333%"}));
		comboBox_1_4.setBounds(66, 92, 95, 22);
		panel_3_4.add(comboBox_1_4);
		
		JTextPane textPane_1_4 = new JTextPane();
		textPane_1_4.setBackground(new Color(239, 239, 239));
		textPane_1_4.setBounds(66, 2, 223, 58);
		panel_3_4.add(textPane_1_4);
		
		
		
		panel_3_5 = new JPanel();
		panel_3_5.setLayout(null);
		panel_3_5.setBorder(new LineBorder(new Color(239, 239, 239)));
		panel_3_5.setBackground(Color.WHITE);
		panel_3_5.setAutoscrolls(true);
		panel_3_5.setBounds(356, 197+176*3, 299, 156);
//		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_12_5 = new JLabel("Choice 5");
		lblNewLabel_12_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_5.setBounds(10, 59, 56, 22);
		panel_3_5.add(lblNewLabel_12_5);
		
		JLabel lblNewLabel_12_1_5 = new JLabel("Grade");
		lblNewLabel_12_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_1_5.setBounds(10, 91, 45, 22);
		panel_3_5.add(lblNewLabel_12_1_5);
		
		textChoice_5 = new JTextField();
		textChoice_5.setColumns(10);
		textChoice_5.setBounds(66, 59, 201, 22);
		panel_3_5.add(textChoice_5);
		
		JButton btnNewButton_1_5 = new JButton("");
		btnNewButton_1_5.setIcon(new ImageIcon(Gui3_2.class.getResource("/Resources/3209322_download_import_in_keep_save_icon.png")));
		btnNewButton_1_5.setBounds(261, 59, 28, 22);
		panel_3_5.add(btnNewButton_1_5);
		
		JComboBox comboBox_1_5 = new JComboBox();
		comboBox_1_5.setMaximumRowCount(19);
		comboBox_1_5.setAutoscrolls(true);
		comboBox_1_5.setModel(new DefaultComboBoxModel(new String[] {"None", "100%", "90%", "83.33333%", "80%", "75%", "70%", "66.66667%", "60%", "50%", "40%", "33.3333%", "25%", "20%", "16.66667%", "14.28571%", "12.5%", "11.11111%", "10%", "5%", "-5%", "-10%", "-11.11111%", "-12.5%", "-14.28571%", "-16.66667%", "-20%", "-25%", "-30%", "-33.33333%", "-40%", "-50%", "-60%", "-66.66667%", "-70%", "-75%", "-80%", "-83.33333%"}));
		comboBox_1_5.setBounds(66, 92, 95, 22);
		panel_3_5.add(comboBox_1_5);
		
		JTextPane textPane_1_5 = new JTextPane();
		textPane_1_5.setBackground(new Color(239, 239, 239));
		textPane_1_5.setBounds(66, 2, 223, 58);
		panel_3_5.add(textPane_1_5);
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		
	}

	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		if(trangthai==0) {
			// Lấy kích thước hiện tại của panel
		    Dimension currentSize = panel_2.getSize();
		    
		    // Tạo một kích thước mới gấp đôi chiều dài hiện tại
		    Dimension newSize = new Dimension(currentSize.width, currentSize.height * 2);
		    
		    // Đặt kích thước mới cho panel
		    panel_2.setSize(newSize);
		    
		    // Cập nhật lại kích thước của scrollPane
		    panel_2.setPreferredSize(newSize);
		    btnNewButton_2.setBounds(366, 918, 235, 31);
		    btnNewButton_2_1.setBounds(385, 971, 284, 31);
		    btnNewButton_2_2.setBounds(488, 1012, 121, 31);
		    btnNewButton_2_3.setBounds(366, 1012, 117, 31);
		    btnNewButton_2.setText("DELETE 3 CHOICES");
		    // Yêu cầu scrollPane cập nhật hiển thị
//		    JInternalFrameChoice j1= new JInternalFrameChoice();
		    panel_2.add(panel_3_3);
		    panel_2.add(panel_3_4);
		    panel_2.add(panel_3_5);
		    scrollPane_1.revalidate();
		    scrollPane_1.repaint();
		    trangthai=1;
		}else {
			// Lấy kích thước hiện tại của panel
		    Dimension currentSize = panel_2.getSize();
		    
		    // Tạo một kích thước mới gấp đôi chiều dài hiện tại
		    Dimension newSize = new Dimension(currentSize.width, currentSize.height /2);
		    
		    // Đặt kích thước mới cho panel
		    panel_2.setSize(newSize);
		    
		    // Cập nhật lại kích thước của scrollPane
		    panel_2.setPreferredSize(newSize);
		    btnNewButton_2.setBounds(366, 368, 235, 31);
		    btnNewButton_2_1.setBounds(385, 421, 284, 31);
		    btnNewButton_2_2.setBounds(488, 462, 121, 31);
		    btnNewButton_2_3.setBounds(366, 462, 117, 31);
		    btnNewButton_2.setText("BLANK FOR MORE 3 CHOICES");
		    panel_2.remove(panel_3_3);
		    panel_2.remove(panel_3_4);
		    panel_2.remove(panel_3_5);
		    // Yêu cầu scrollPane cập nhật hiển thị
		    scrollPane_1.revalidate();
		    scrollPane_1.repaint();
		    trangthai=0;
		}
	}
	protected void do_btnNewButton_2_2_actionPerformed(ActionEvent e) {
		Gui2_1 gui2_1= new Gui2_1();
		gui2_1.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnNewButton_2_1_actionPerformed(ActionEvent e) {
		if(comboBox.getSelectedItem().toString().trim().equalsIgnoreCase("Default")){
			JOptionPane.showMessageDialog(null, "hãy chọn ngân hàng đề");
		}else if(textField.getText().isBlank() || textPane.getText().isBlank() ) {
			JOptionPane.showMessageDialog(null, "vui lòng nhập đủ thông tin");
		}else {
			ArrayList<String> listChoice= new ArrayList<>();
//			String[] ch= {ch1,ch2,ch3,ch4,ch5};
			if(textChoice_1.getText().equalsIgnoreCase("")==false) {
				listChoice.add(textChoice_1.getText());
			}
			if(textChoice_2.getText().equalsIgnoreCase("")==false) {
				listChoice.add(textChoice_2.getText());
			}
			if(textChoice_3.getText().equalsIgnoreCase("")==false) {
				listChoice.add(textChoice_3.getText());
			}
			if(textChoice_4.getText().equalsIgnoreCase("")==false) {
				listChoice.add(textChoice_4.getText());
			}
			if(textChoice_5.getText().equalsIgnoreCase("")==false) {
				listChoice.add(textChoice_5.getText());
			}
			if(listChoice.size()>=2) {
				Question question= new Question(textField.getText(), textPane.getText(), listChoice, textField_2.getText().toUpperCase());
				ArrayList<QuestionBank> listQB= new ArrayList<>();
				
				try {
					listQB= new FileDsQuestionBank().docQuiz();
					
					for(QuestionBank q:listQB) {
						if(q.getNameQB().equalsIgnoreCase(comboBox.getSelectedItem().toString().trim())) {
							ArrayList<Question> listqs=new ArrayList<>();
							
							
							if(q.getListQuestion()==null || q.getListQuestion().isEmpty() ) {
//								for(QuestionBank qb:listQB) {
//									System.out.println(qb.getNameQB()+"\n");
//								}
								listqs.add(question);
								q.setListQuestion(listqs);
								new FileDsQuestionBank().ghiBank(listQB);
								themVaoCha(q.getParentOfQB(), question);
								JOptionPane.showMessageDialog(null, "successfull!");
								break;
							}else {
								listqs = q.getListQuestion();
								int j=0;
								for(Question qs:listqs) {
									if(qs.getName().equals(textField.getText())){
										j++;
									}
								}
								if(j==0) {
									listqs.add(question);
									q.setListQuestion(listqs);
									new FileDsQuestionBank().ghiBank(listQB);
									JOptionPane.showMessageDialog(null, "successfull!");
									break;
								}else {
									JOptionPane.showMessageDialog(null, "Question name đã tồn tại!");
								}
							}
//							listqs.add(question);
//							q.setListQuestion(listqs);
//							new FileDsQuestionBank().ghiBank(listQB);
//							JOptionPane.showMessageDialog(null, "successfull!");
						}
					}
					
				} catch (Exception ex) {
					// TODO: handle exception
					ex.printStackTrace();
				}
			}else {
				JOptionPane.showMessageDialog(null, "hãy nhập thêm lựa chọn đáp án");
			}
			
		}
	}
	public void themVaoCha(String name,Question list) {
		try {
			ArrayList<QuestionBank> listQb=new FileDsQuestionBank().docQuiz();
			for(QuestionBank qb:listQb) {
				if(qb.getNameQB().equalsIgnoreCase(name)) {
					ArrayList<Question> aq= qb.getListQuestion();
					aq.add(list);
					qb.setListQuestion(aq);
					new FileDsQuestionBank().ghiBank(listQb);
					if(qb.getParentOfQB().equalsIgnoreCase("default")) {
						
					}else {
						themVaoCha(qb.getParentOfQB(), list);
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
