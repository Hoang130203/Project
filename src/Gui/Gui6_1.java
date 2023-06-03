package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui6_1 extends JFrame {
	private String str;
	private JPanel contentPane;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui6_1 frame = new Gui6_1(str);
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
	public Gui6_1(String str) {
		this.setStr(str);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 803, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 49, 761, 86);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("IT\r\n");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(21, 10, 45, 21);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setForeground(Color.RED);
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
		
		JLabel lblNewLabel_3 = new JLabel("THI CUỐI KỲ     General");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(146, 56, 173, 18);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("/");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(283, 51, 45, 29);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel(str);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(300, 56, 197, 18);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(0, 0, 789, 39);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 145, 761, 383);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel(str);
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(10, 22, 426, 40);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_1_actionPerformed(e);
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setIcon(new ImageIcon(Gui6_1.class.getResource("/Resources/1564529_mechanism_options_settings_configuration_setting_icon.png")));
		btnNewButton_1.setBounds(724, 3, 35, 35);
		panel_1.add(btnNewButton_1);

		JLabel lblNewLabel_7 = new JLabel("Summary of your previous attempts");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(10, 87, 379, 35);
		panel_1.add(lblNewLabel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(255, 255, 255));
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(10, 162, 720, 92);
		panel_1.add(scrollPane);
		
		JLabel lblNewLabel_8 = new JLabel("Attempt");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(157, 132, 84, 29);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("State");
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8_1.setBounds(316, 132, 84, 29);
		panel_1.add(lblNewLabel_8_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setVerifyInputWhenFocusTarget(false);
		btnNewButton_2.setRolloverEnabled(false);
		btnNewButton_2.setRequestFocusEnabled(false);
		btnNewButton_2.setSelected(true);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setFocusTraversalKeysEnabled(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(0, 128, 255));
		btnNewButton_2.setBounds(10, 125, 720, 39);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PREVIEW QUIZ NOW");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_3_actionPerformed(e);
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 0, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_3.setBounds(544, 281, 173, 35);
		panel_1.add(btnNewButton_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jump to..."}));
		comboBox.setBounds(447, 338, 118, 35);
		panel_1.add(comboBox);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_4_actionPerformed(e);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(Gui6_1.class.getResource("/Resources/9035984_return_down_back_sharp_icon.png")));
		btnNewButton_4.setBounds(0, 0, 40, 17);
		panel_1.add(btnNewButton_4);
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		Gui6_2a gui6_2a= new Gui6_2a(str);
		gui6_2a.setTenQuiz(str);
		gui6_2a.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnNewButton_4_actionPerformed(ActionEvent e) {
		JFrameMain frameMain= new JFrameMain();
		frameMain.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		Gui7_2 gui7_2= new Gui7_2(str);
		gui7_2.setVisible(true);
//		this.setVisible(false);
	}
}
