package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import DAT.FileDsQuiz;
import Entity.Question;
import Entity.Quiz;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JMenuBar;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;

public class Gui6_2a extends JFrame {
	String tenQuiz;
	private JPanel contentPane;
	private JTextField textField;
	int count=0;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_7_1_1;
	public String getTenQuiz() {
		return tenQuiz;
	}

	public void setTenQuiz(String tenQuiz) {
		this.tenQuiz = tenQuiz;
	}

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Gui6_2a frame = new Gui6_2a(tenQuiz);
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
	public Gui6_2a(String tenQuiz) {
		this.tenQuiz= tenQuiz;
		this.tenQuiz=tenQuiz;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 803, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(0, 0, 789, 39);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 44, 761, 86);
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
		
		JLabel lblNewLabel_5 = new JLabel(tenQuiz+" / Edit quiz");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(300, 56, 197, 18);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 140, 761, 378);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(null);
		lblNewLabel_6.setRequestFocusEnabled(false);
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(26, 10, 426, 40);
		panel_1.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Question: 0| This quiz is open");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(26, 60, 181, 28);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Maximum grade");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7_1.setBounds(480, 60, 112, 28);
		panel_1.add(lblNewLabel_7_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setText("10.00");
		textField.setBounds(592, 58, 60, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("SAVE");
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(662, 58, 74, 33);
		panel_1.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jump to..."}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(279, 333, 173, 35);
		panel_1.add(comboBox);
		
		JButton btnNewButton_1_1 = new JButton("REPAGINATE");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1.setBackground(Color.BLUE);
		btnNewButton_1_1.setBounds(26, 109, 112, 33);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("SELECT MULTIPLE ITEMS");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2.setBackground(Color.BLUE);
		btnNewButton_1_2.setBounds(148, 109, 191, 33);
		panel_1.add(btnNewButton_1_2);
		
		lblNewLabel_7_1_1 = new JLabel("Total of Mark: 0.00");
		lblNewLabel_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7_1_1.setBounds(602, 101, 126, 28);
		panel_1.add(lblNewLabel_7_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(223, 223, 223));
		panel_2.setBounds(26, 152, 710, 56);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Gui6_2a.class.getResource("/Resources/326602_create_edit_pencil_write_icon.png")));
		lblNewLabel_8.setBounds(25, 10, 37, 30);
		panel_2.add(lblNewLabel_8);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Shuffer ?");
		chckbxNewCheckBox.setBackground(new Color(223, 223, 223));
		chckbxNewCheckBox.setBounds(556, 10, 93, 21);
		panel_2.add(chckbxNewCheckBox);
		
		JInternalFrame internalFrame = new JInternalFrame("");
		internalFrame.setBounds(543, 32, 37, 72);
		panel_2.add(internalFrame);
		internalFrame.setBorder(new LineBorder(new Color(0, 101, 202)));
		internalFrame.setOpaque(true);
		internalFrame.setRequestFocusEnabled(false);
		BasicInternalFrameUI ui = (BasicInternalFrameUI) internalFrame.getUI();
		
		JMenuBar menuBar = new JMenuBar();
		internalFrame.setJMenuBar(menuBar);
		
		JButton btnNewButton_2 = new JButton("Trở về");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_2_actionPerformed(e);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setIcon(new ImageIcon(Gui6_2a.class.getResource("/Resources/9035984_return_down_back_sharp_icon.png")));
		btnNewButton_2.setBounds(10, 10, 95, 28);
		panel_1.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 228, 710, 92);
		panel_1.add(scrollPane);
		
		JList list = new JList();
		DefaultListModel<Question> dlm= new DefaultListModel<>();
		try {
			ArrayList<Quiz> listquiz= new FileDsQuiz().docQuiz();
			for(Quiz q: listquiz) {
				if(q.getTenQuiz().trim().equals(tenQuiz.trim())) {
					ArrayList<Question> ques= q.getListQuestions();
					for(Question qs:ques) {
						dlm.addElement(qs);
						count++;
					}
					list.setModel(dlm);
					break;
				}
			}
			lblNewLabel_7.setText("Question: "+count+"| This quiz is open");
			lblNewLabel_7_1_1.setText("Total of Mark: "+count+".00");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		scrollPane.setViewportView(list);
		
		JMenu mnNewMenu = new JMenu("Add");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("a new question");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				sdo_mntmNewMenuItem_actionPerformed(e);
			}
		});
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				do_mntmNewMenuItem_mouseClicked(e);
			}
		});
		mntmNewMenuItem.setForeground(new Color(0, 101, 202));
		mntmNewMenuItem.setIcon(new ImageIcon(Gui6_2a.class.getResource("/Resources/3669479_add_ic_icon.png")));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("from question bank");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmNewMenuItem_1_actionPerformed(e);
			}
		});
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				do_mntmNewMenuItem_1_mouseClicked(e);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(Gui6_2a.class.getResource("/Resources/3669479_add_ic_icon.png")));
		mntmNewMenuItem_1.setForeground(new Color(0, 101, 202));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("a random question");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmNewMenuItem_2_actionPerformed(e);
			}
		});
		mntmNewMenuItem_2.setForeground(new Color(0, 101, 202));
		mntmNewMenuItem_2.setIcon(new ImageIcon(Gui6_2a.class.getResource("/Resources/3669479_add_ic_icon.png")));
		mnNewMenu.add(mntmNewMenuItem_2);
		internalFrame.setVisible(true);
        ui.setNorthPane(null);
//		Add add= new Add();
//		add.setVisible(true);
//		panel_2.add(add);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	protected void do_mntmNewMenuItem_mouseClicked(MouseEvent e) {	
	}
	protected void do_mntmNewMenuItem_1_mouseClicked(MouseEvent e) {
		Gui6_3 gui6_3 = new Gui6_3(tenQuiz);
		gui6_3.setName(tenQuiz);
		gui6_3.setVisible(true);
		this.setVisible(false);
	}
	
	protected void do_mntmNewMenuItem_1_actionPerformed(ActionEvent e) {
		Gui6_3 gui6_3 = new Gui6_3(tenQuiz);
//		gui6_3.setName(tenQuiz);
		gui6_3.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		Gui6_1 gui6_1= new Gui6_1(this.getTenQuiz());
		this.setVisible(false);
		gui6_1.setVisible(true);
	}
	protected void do_mntmNewMenuItem_2_actionPerformed(ActionEvent e) {
		Gui6_5 gui6_5= new Gui6_5(tenQuiz);
		gui6_5.setVisible(true);
		this.setVisible(false);
	}
}
