package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

import DAT.FileDsQuiz;
import Entity.Quiz;
import Entity.QuizRendered;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameMain extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton_4;
	private JButton btnNewButton;
	private JList list;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JPanel panel_2;
	ArrayList<Quiz> listQuiz =new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
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
	public JFrameMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setDefaultCloseOperation(JFrame.);
		setResizable(false);
		setBounds(350, 100, 988, 659);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("");
		menu.setIcon(new ImageIcon(JFrameMain.class.getResource("/Resources/5402398_list_menu_options_settings_checklist_icon.png")));
		menuBar.add(menu);
		
		JSeparator separator = new JSeparator();
		menuBar.add(separator);
		
		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon(JFrameMain.class.getResource("/Resources/3643745_human_man_people_person_profile_icon.png")));
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 954, 117);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("IT\r\n");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(22, 10, 45, 21);
		panel.add(lblNewLabel);
		
		btnNewButton = new JButton("Home");
		btnNewButton.setBounds(10, 78, 70, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("My course");
		btnNewButton_1.setBounds(79, 78, 103, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Thi cuoi ky");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				gui6_1();
			}
		});
		btnNewButton_2.setBounds(179, 78, 103, 21);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("TURN EDITING ON");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_3_actionPerformed(e);
			}
		});
		btnNewButton_3.setForeground(new Color(240, 240, 240));
		btnNewButton_3.setBackground(new Color(0, 128, 255));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(745, 65, 162, 42);
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_4_actionPerformed(e);
			}
		});
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(240, 240, 240));
		btnNewButton_4.setIcon(new ImageIcon(JFrameMain.class.getResource("/Resources/gear.png")));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_4.setBounds(874, 10, 35, 31);
		panel.add(btnNewButton_4);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 127, 431, 452);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(121, 121, 62), new Color(121, 121, 62)));
		panel_2.setVisible(false);
		panel_2.setBackground(new Color(211, 211, 169));
		panel_2.setBounds(460, 193, 471, 196);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Question Bank");
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBounds(45, 73, 173, 42);
		lblNewLabel_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(lblNewLabel_1);
		
		JButton btnQuestions = new JButton("Questions");
		btnQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuestions_actionPerformed(e);
			}
		});
		btnQuestions.setBounds(292, 10, 88, 37);
		btnQuestions.setForeground(new Color(0, 128, 255));
		btnQuestions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnQuestions.setBorder(new LineBorder(new Color(121, 121, 62)));
		btnQuestions.setBackground(new Color(255, 255, 196));
		panel_2.add(btnQuestions);
		
		JButton btnCategory = new JButton("Category");
		btnCategory.setBounds(292, 57, 88, 36);
		btnCategory.setForeground(new Color(0, 128, 255));
		btnCategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCategory.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCategory.setBackground(new Color(255, 255, 196));
		panel_2.add(btnCategory);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBounds(304, 103, 67, 35);
		btnImport.setForeground(new Color(0, 128, 255));
		btnImport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnImport.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnImport.setBackground(new Color(255, 255, 196));
		panel_2.add(btnImport);
		
		JButton btnExport = new JButton("Export");
		btnExport.setBounds(304, 148, 67, 38);
		btnExport.setForeground(new Color(0, 128, 255));
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExport.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnExport.setBackground(new Color(255, 255, 196));
		panel_2.add(btnExport);
		
		scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setBounds(new Rectangle(40, 40, 40, 40));
		scrollPane.setBorder(null);
		scrollPane.setBounds(44, 68, 348, 320);
		panel_1.add(scrollPane);
		
		list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				do_list_mouseClicked(e);
			}
		});
		list.setBorder(new LineBorder(new Color(128, 128, 128)));
		list.setBounds(new Rectangle(4, 4, 4, 4));
		scrollPane.setViewportView(list);
		list.setBackground(new Color(240, 240, 240));
		list.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2 = new JLabel("Danh sách bài kiểm tra");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2.setBounds(92, 19, 239, 39);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(JFrameMain.class.getResource("/Resources/Logo_Đại_học_Bách_Khoa_Hà_Nội.svg (1).png")));
		lblNewLabel_3.setBounds(844, 444, 120, 146);
		contentPane.add(lblNewLabel_3);
		try {
			listQuiz= new FileDsQuiz().docQuiz();
		} catch (Exception e) {
			// TODO: handle exception
		}
//		listMon.add("Kiểm tra cuối kỳ môn IT4895Q\n");
//		listMon.add("Thi thử KTLT");
//		listMon.add("Thi GK2 Tin học 7");
//		listMon.add("Thi GK2 Sử Địa 7");
//		listMon.add("Thi giữa kỳ 2 môn Công nghệ");
//		DefaultListModel<String> defaultListModel =new DefaultListModel<String>();
//		for(String i:listMon) {
//			
//			defaultListModel.addElement(i);
//			
//		}
//        
//        list.setModel(defaultListModel);
//		loadData();
//		loadDatapro("abc");
		taoList();
	}
	 void taoList() {
		 DefaultListModel<Quiz> d=new DefaultListModel<>();
		 for(Quiz i:listQuiz) {
			 d.addElement(i);
		 }
		 list.setModel(d);
		 list.setCellRenderer(new QuizRendered());
	 }
	 public void loadDatapro(String s) {
//	   FileDsQuiz fileDsQuiz= new FileDsQuiz();
	   if(s.equals("")) {
		   
	   }else {
       try {
//    	    List<Quiz> listQuiz=new ArrayList<Quiz>();
	   		DefaultListModel<Quiz> defaultListModel= new DefaultListModel<>();
	   		int j=0;
	   		Quiz quiz=new Quiz(s);
	   		ArrayList<Quiz> listt= new FileDsQuiz().docQuiz();
	   		for(Quiz i:listt) {
	   			if(i.getTenQuiz().equalsIgnoreCase(s)) {
	   				j++;
	   			}
	   		}
	   		if(j!=0) {
	   			JOptionPane.showMessageDialog(null, "tên đã tồn tại");
	   		}else {
//	   		quiz.setTenQuiz(s);
	   		listQuiz.add(quiz);
	   		new FileDsQuiz().ghiQuiz(listQuiz);
	   		
	   		for(Quiz i:listQuiz) {
	   			defaultListModel.addElement(i);
//	   			defaultListModel.addElement(s);
	   			}
	   		list.setModel(defaultListModel);
	   		list.setCellRenderer(new QuizRendered());
	   		} 
       		}
	   		catch (Exception e) {
			// TODO: handle exception
		}
	   }
	   
    }
	

	private void loadData() {
		
    }
	protected void do_btnNewButton_4_actionPerformed(ActionEvent e) {
		if(!panel_2.isVisible()) {
	       panel_2.setVisible(true);
//	       scrollPane.setVisible(false);
	    }else {
	    	panel_2.setVisible(false);
//		    scrollPane.setVisible(true);
	    }
	}
	protected void do_btnQuestions_actionPerformed(ActionEvent e) {
		Gui2_1 gui2_1= new Gui2_1();
		this.setVisible(false);
		gui2_1.setVisible(true);
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		Gui5_1 gui5_1=new Gui5_1();
		this.setVisible(false);
		gui5_1.setVisible(true);
	}
	protected void gui6_1(String str) {
		Gui6_1 gui6_1= new Gui6_1(str);
		gui6_1.setStr(str);
		gui6_1.setVisible(true);
		this.setVisible(false);
	}
	protected void do_list_mouseClicked(MouseEvent e) {
		String str= list.getSelectedValue().toString();
		gui6_1(str);
		
	}
}
