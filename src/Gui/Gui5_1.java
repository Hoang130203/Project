package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entity.JtextpanePro;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;

public class Gui5_1 extends JFrame {
	LocalDateTime currentTime = LocalDateTime.now();
	private javax.swing.Timer timer;
	
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnCancel;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_1_1;
	private JComboBox comboBox_1_2;
	private JComboBox comboBox_1_2_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1_3;
	private JComboBox comboBox_1_1_1;
	private JComboBox comboBox_1_2_2;
	private JComboBox comboBox_1_2_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui5_1 frame = new Gui5_1();
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
	public Gui5_1() {
		setResizable(false);
		setBounds(350, 80, 874, 691);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adding a new Quiz");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(170, 0, 0));
		lblNewLabel.setIcon(new ImageIcon(Gui5_1.class.getResource("/Resources/1622833_checkmark_done_exam_list_pencil_icon.png")));
		lblNewLabel.setBounds(10, 0, 182, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Gui5_1.class.getResource("/Resources/3671842_question_icon.png")));
		lblNewLabel_1.setBounds(189, 10, 38, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("General");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setIcon(new ImageIcon(Gui5_1.class.getResource("/Resources/211614_down_b_arrow_icon.png")));
		lblNewLabel_2.setBounds(20, 73, 82, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setForeground(new Color(72, 72, 72));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(30, 110, 72, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Description");
		lblNewLabel_3_1.setForeground(new Color(72, 72, 72));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(30, 147, 72, 27);
		contentPane.add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setBounds(312, 110, 298, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(312, 158, 454, 156);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 352, 809, 2);
		contentPane.add(separator);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Display descripton on course page");
		chckbxNewCheckBox.setForeground(new Color(72, 72, 72));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(312, 325, 228, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Gui5_1.class.getResource("/Resources/3669348_error_ic_icon.png")));
		lblNewLabel_4.setBounds(282, 110, 30, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Timing");
		lblNewLabel_2_1.setIcon(new ImageIcon(Gui5_1.class.getResource("/Resources/211614_down_b_arrow_icon.png")));
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(20, 352, 82, 27);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Open the quiz");
		lblNewLabel_3_1_1.setForeground(new Color(72, 72, 72));
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_1_1.setBounds(20, 389, 142, 27);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Close the quiz");
		lblNewLabel_3_1_2.setForeground(new Color(72, 72, 72));
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_1_2.setBounds(20, 426, 92, 27);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Time limit");
		lblNewLabel_3_1_3.setForeground(new Color(72, 72, 72));
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_1_3.setBounds(20, 463, 72, 27);
		contentPane.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("When time expires");
		lblNewLabel_3_1_4.setForeground(new Color(72, 72, 72));
		lblNewLabel_3_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_1_4.setBounds(20, 511, 126, 27);
		contentPane.add(lblNewLabel_3_1_4);
		
		btnNewButton = new JButton("CREATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(47, 151, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(251, 591, 100, 27);
		contentPane.add(btnNewButton);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCancel_actionPerformed(e);
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(198, 0, 0));
		btnCancel.setBounds(398, 591, 100, 27);
		contentPane.add(btnCancel);
		
		comboBox = new JComboBox();
		comboBox.setBounds(312, 393, 39, 21);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(361, 393, 82, 21);
		contentPane.add(comboBox_1);
		
		comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(453, 393, 56, 21);
		contentPane.add(comboBox_1_1);
		
		comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(519, 393, 48, 21);
		contentPane.add(comboBox_1_2);
		
		comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setBounds(577, 393, 48, 21);
		contentPane.add(comboBox_1_2_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(312, 430, 39, 21);
		contentPane.add(comboBox_2);
		
		comboBox_1_3 = new JComboBox();
		comboBox_1_3.setBounds(361, 430, 82, 21);
		contentPane.add(comboBox_1_3);
		
		comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(453, 430, 56, 21);
		contentPane.add(comboBox_1_1_1);
		
		comboBox_1_2_2 = new JComboBox();
		comboBox_1_2_2.setBounds(519, 430, 48, 21);
		contentPane.add(comboBox_1_2_2);
		
		comboBox_1_2_1_1 = new JComboBox();
		comboBox_1_2_1_1.setBounds(577, 430, 48, 21);
		contentPane.add(comboBox_1_2_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBounds(312, 468, 48, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1_3_1 = new JComboBox();
		comboBox_1_3_1.setModel(new DefaultComboBoxModel(new String[] {"minutes"}));
		comboBox_1_3_1.setBounds(371, 467, 72, 21);
		contentPane.add(comboBox_1_3_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Open attempts are submitted automatically "}));
		comboBox_3.setToolTipText("");
		comboBox_3.setBounds(312, 515, 239, 21);
		contentPane.add(comboBox_3);
		int day = currentTime.getDayOfMonth();
        int month = currentTime.getMonthValue();
        int year = currentTime.getYear();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        
        
        DefaultComboBoxModel<String> model1=new DefaultComboBoxModel<>();
        model1.addElement(String.valueOf(day));
        comboBox.setModel(model1);
        comboBox_2.setModel(model1);
        DefaultComboBoxModel<String> model2= new DefaultComboBoxModel<>();
        model2.addElement(String.valueOf(month));
        comboBox_1.setModel(model2);
        comboBox_1_3.setModel(model2);
        
        DefaultComboBoxModel<String> model3= new DefaultComboBoxModel<>();
		
        model3.addElement(String.valueOf(year));
        comboBox_1_1.setModel(model3);
        comboBox_1_1_1.setModel(model3);
        
        DefaultComboBoxModel<String> model4= new DefaultComboBoxModel<>();
        for (int i = 0; i < 24; i++) {
            model4.addElement(String.valueOf(i));
        }
        model4.setSelectedItem(String.valueOf(hour));
        comboBox_1_2.setModel(model4);
        comboBox_1_2_2.setModel(model4);
        
        DefaultComboBoxModel<String> model5= new DefaultComboBoxModel<>();
        for (int i = 0; i < 60; i++) {
            model5.addElement(String.valueOf(i));
        }
        model5.setSelectedItem(String.valueOf(minute));
        comboBox_1_2_1.setModel(model5);
        comboBox_1_2_1_1.setModel(model5);
        
        
        timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy thời gian hiện tại
                LocalTime currentTime = LocalTime.now();

                // Cập nhật giá trị trong combobox theo thời gian hiện tại
                comboBox_1_2.setSelectedItem(String.valueOf(currentTime.getHour()));
                comboBox_1_2_1.setSelectedItem(String.valueOf(currentTime.getMinute()));
            }
        });
        timer.start();
	}
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		this.setVisible(false);
		JFrameMain jFrameMain=new JFrameMain();
		jFrameMain.setVisible(true);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		String s= textField.getText();
		JFrameMain jFrameMain= new JFrameMain();
		jFrameMain.loadDatapro(s);
		
		this.setVisible(false);
		jFrameMain.setVisible(true);
	}
}
