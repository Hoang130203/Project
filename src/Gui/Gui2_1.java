package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;

import DAT.FileDsQuestionBank;
import DAT.FileDsQuiz;
import Entity.FileFormat;
import Entity.Question;
import Entity.QuestionBank;
//import demo.FileDropExample.DropListener;
import Entity.Quiz;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.swing.JList;

public class Gui2_1 extends JFrame {
	private int j;
	private JList list = new JList();
	private DefaultListModel<String> dlm= new DefaultListModel<>();
	private JPanel contentPane;
	private JButton btnNewButton_3;
	private JComboBox comboBox;
	private JButton btnNewButton_4;
	private JPanel panel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JComboBox comboBox_1;
	private JScrollPane scrollPane_1;
	private JLabel lbtenfile;
	private JPanel panel_6;
	private File f;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui2_1 frame = new Gui2_1();
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
	public Gui2_1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 988, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(0, 0, 974, 39);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 44, 954, 116);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("IT\r\n");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(22, 10, 45, 21);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_1_actionPerformed(e);
			}
		});
		btnNewButton_1.setBounds(10, 78, 70, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("My course");
		btnNewButton_1_1.setBounds(79, 78, 103, 21);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Thi cuoi ky");
		btnNewButton_2.setBounds(179, 78, 103, 21);
		panel.add(btnNewButton_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 171, 954, 443);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Questions", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Question Bank");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 10, 188, 38);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Select a category");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 47, 112, 30);
		panel_1.add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_comboBox_actionPerformed(e);
			}
		});
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setBounds(132, 47, 241, 30);
//        comboBox.addItem("Default");
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("The default category for question shared in context");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 87, 298, 30);
		panel_1.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Also show questions from subcategories");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(6, 123, 302, 30);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Also show old questions");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_1.setBounds(6, 155, 274, 30);
		panel_1.add(chckbxNewCheckBox_1);
		
		btnNewButton_3 = new JButton("CREATE A NEW QUESTION...");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_3_actionPerformed(e);
			}
		});
		btnNewButton_3.setBackground(new Color(0, 128, 255));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3.setBounds(10, 191, 251, 38);
		panel_1.add(btnNewButton_3);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Categories", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Add category");
		lblNewLabel_4.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/211614_down_b_arrow_icon.png")));
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(36, 10, 130, 21);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Parent category");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(36, 52, 104, 15);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Name");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(36, 89, 104, 15);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Category info");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(36, 132, 104, 15);
		panel_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Id number");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_3.setBounds(36, 279, 104, 15);
		panel_2.add(lblNewLabel_5_3);
		
		btnNewButton_4 = new JButton("ADD CATEGORY");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_4_actionPerformed(e);
			}
		});
		btnNewButton_4.setBackground(new Color(130, 0, 0));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4.setBounds(413, 331, 157, 35);
		panel_2.add(btnNewButton_4);
		
		List<QuestionBank> listt= new ArrayList<>();
		
		
//		listt.add(new QuestionBank("Default", "default"));
		
		comboBox_1 = new JComboBox();
		comboBox_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				do_comboBox_1_mouseClicked(e);
//			}
		});
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setBounds(425, 38, 264, 35);
		DefaultComboBoxModel<String> dcb=new DefaultComboBoxModel<>();
		try {
			dcb=new FileDsQuestionBank().listCategory();
//		    JTree tree = new FileDsQuestionBank().listCategory();
//		    dcb.addElement(tree.toString());
//		    populateComboBoxModel(dcb, tree);
//		    List<QuestionBank> listQB = new ArrayList<>();
//		    listQB = new FileDsQuestionBank().docQuiz();
//		    for (QuestionBank i : listQB) {
//		        dcb.addElement(i.getNameQB());
//		    }
//		    
		    comboBox_1.setModel(dcb);
//		    DefaultComboBoxModel<String> dcb1= (DefaultComboBoxModel<String>)comboBox_1.getModel();
		    ArrayList<String> listL= new ArrayList<>();
		    for (int i = 0; i < dcb.getSize(); i++) {
	            String element = dcb.getElementAt(i);
	            int k=0;
	            try {
					ArrayList<QuestionBank> listQB= new FileDsQuestionBank().docQuiz();
//					listQB= new FileDsQuestionBank().docQuiz();
					
					for(QuestionBank q:listQB) {
						if(q.getNameQB().equalsIgnoreCase(element.trim())) {
							k=q.getListQuestion().size();

						}
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
	            listL.add(element+" ("+k+")");
	        }
		    DefaultComboBoxModel<String> dcb1= new DefaultComboBoxModel<>();
		    for(String s:listL) {
		    	dcb1.addElement(s);
		    }
		    comboBox.setModel(dcb1);
		    
		    scrollPane_1 = new JScrollPane();
		    scrollPane_1.setBounds(10, 239, 929, 177);
		    panel_1.add(scrollPane_1);
		   
		    
		    
		    
		} catch (Exception e) {
		    // Xử lý ngoại lệ
		}
		panel_2.add(comboBox_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(425, 83, 334, 35);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(426, 132, 456, 140);
		panel_2.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 13));
		scrollPane.setViewportView(textPane);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setBounds(425, 279, 96, 32);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/3671842_question_icon.png")));
		lblNewLabel_6.setBounds(391, 44, 24, 29);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/3671842_question_icon.png")));
		lblNewLabel_7.setBounds(391, 287, 24, 24);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/3669348_error_ic_icon.png")));
		lblNewLabel_8.setBounds(391, 89, 31, 29);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("There are required fields in this form marked");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(348, 376, 280, 30);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(".");
		lblNewLabel_10.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/3669348_error_ic_icon.png")));
		lblNewLabel_10.setBounds(611, 382, 45, 21);
		panel_2.add(lblNewLabel_10);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Import", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Import questions from file");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_11.setBounds(21, 5, 247, 33);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("File format");
		lblNewLabel_12.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/211614_down_b_arrow_icon.png")));
		lblNewLabel_12.setForeground(new Color(255, 0, 0));
		lblNewLabel_12.setBorder(null);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(21, 48, 429, 27);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_12_1 = new JLabel("General");
		lblNewLabel_12_1.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/211620_b_right_arrow_icon.png")));
		lblNewLabel_12_1.setForeground(Color.RED);
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_12_1.setBorder(null);
		lblNewLabel_12_1.setBounds(21, 85, 572, 27);
		panel_3.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_12_2 = new JLabel("Import question from file");
		lblNewLabel_12_2.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/211614_down_b_arrow_icon.png")));
		lblNewLabel_12_2.setForeground(Color.RED);
		lblNewLabel_12_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_12_2.setBorder(null);
		lblNewLabel_12_2.setBounds(21, 134, 572, 27);
		panel_3.add(lblNewLabel_12_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 122, 891, 2);
		panel_3.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 73, 891, 2);
		panel_3.add(separator_1);
		
		JLabel lblNewLabel_13 = new JLabel("Aiken format");
		lblNewLabel_13.setForeground(new Color(80, 80, 80));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13.setBounds(415, 51, 79, 21);
		panel_3.add(lblNewLabel_13);
		
		JLabel lblNewLabel_13_1 = new JLabel("Import");
		lblNewLabel_13_1.setForeground(new Color(80, 80, 80));
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13_1.setBounds(21, 171, 79, 21);
		panel_3.add(lblNewLabel_13_1);
		
		btnNewButton_5 = new JButton("CHOOSE A FILE");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_5_actionPerformed(e);
			}
		});
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(new Color(32, 157, 210));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(390, 166, 134, 33);
		panel_3.add(btnNewButton_5);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/3669348_error_ic_icon.png")));
		lblNewLabel_14.setBounds(360, 166, 30, 26);
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_13_2 = new JLabel("Maximum size for new files: 100MB");
		lblNewLabel_13_2.setForeground(new Color(80, 80, 80));
		lblNewLabel_13_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13_2.setBounds(534, 166, 270, 21);
		panel_3.add(lblNewLabel_13_2);
		
		btnNewButton_6 = new JButton("IMPORT\r\n");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_6_actionPerformed(e);
			}
		});
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(new Color(206, 0, 0));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_6.setBounds(390, 344, 97, 33);
		panel_3.add(btnNewButton_6);
		
		JLabel lblNewLabel_15 = new JLabel("There are required fields in this form marked    .");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_15.setBounds(304, 380, 289, 26);
		panel_3.add(lblNewLabel_15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_5.setBounds(390, 209, 363, 122);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		panel_6 = new JPanel();
		Border dash = BorderFactory.createDashedBorder(Color.BLACK, 1, 5, 2, false);
		panel_6.setBorder( dash);
		panel_6.setBounds(10, 20, 343, 102);
		panel_6.setDropTarget(new DropTarget(panel_6, new DropListener()));
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("You can drag and drop files here to add them");
		lblNewLabel_17.setForeground(new Color(128, 128, 128));
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_17.setBounds(38, 79, 264, 23);
		panel_6.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/111066_down_icon.png")));
		lblNewLabel_18.setBounds(142, 10, 67, 59);
		panel_6.add(lblNewLabel_18);
		
		lbtenfile = new JLabel("file");
		lbtenfile.setBounds(10, 0, 316, 22);
		panel_5.add(lbtenfile);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(Gui2_1.class.getResource("/Resources/3669348_error_ic_icon.png")));
		lblNewLabel_16.setBounds(564, 380, 51, 27);
		panel_3.add(lblNewLabel_16);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Export", null, panel_4, null);
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		JFrameMain jFrameMain=new JFrameMain();
		this.setVisible(false);
		jFrameMain.setVisible(true);
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		Gui3_2 gui3_2 = new Gui3_2();
		this.setVisible(false);
		gui3_2.setVisible(true);
	}
	protected void do_btnNewButton_4_actionPerformed(ActionEvent e) {
		ArrayList<QuestionBank> qbList= new ArrayList<>();
		try {
			qbList= new FileDsQuestionBank().docQuiz();
		} catch (Exception e2) {
			// TODO: handle exception
		}
		j=0;
		for(QuestionBank i:qbList) {
			if(textField.getText().equalsIgnoreCase(i.getNameQB())) {
				
//				j++;
				j=j+1;
				
			}
		}
		if(j!=0) {
			JOptionPane.showMessageDialog(null, "tên Question Bank đã tồn tại");
			
		}else if(textField.getText().isBlank() ) {
			JOptionPane.showMessageDialog(null, "vui lòng điền đầy đủ"); 
		}else 
		{
			
			QuestionBank qb= new QuestionBank(textField.getText(), comboBox_1.getSelectedItem().toString().trim());

			try {
				ArrayList<QuestionBank> list= new FileDsQuestionBank().docQuiz();
				list.add(qb);
				new FileDsQuestionBank().ghiBank(list);
				Gui2_1 newGui= new Gui2_1();
				newGui.setVisible(true);
				this.setVisible(false);
			} catch (Exception e2) {
				// TODO: handle exception
		}}
	}
	protected void do_comboBox_actionPerformed(ActionEvent e) {
		dlm=new DefaultListModel<>();
		if(comboBox.getSelectedItem().toString().trim().equalsIgnoreCase("Default")==false) {
			try {
				ArrayList<QuestionBank> listQB= new FileDsQuestionBank().docQuiz();
//				listQB= new FileDsQuestionBank().docQuiz();
				
				for(QuestionBank q:listQB) {
					if(q.getNameQB().equalsIgnoreCase(extractCharacters(comboBox.getSelectedItem().toString(), '(', ')').trim())) {
						
						ArrayList<Question> listqs=new ArrayList<>();
						
						
						if(q.getListQuestion()==null || q.getListQuestion().isEmpty() ) {
							dlm=new DefaultListModel<>();
							list.setModel(dlm);
							scrollPane_1.setViewportView(list);
							break;
						}else {
							listqs = q.getListQuestion();
							for(Question qs:listqs) {
								dlm.addElement(qs.toString());
							}
							list.setModel(dlm);
							scrollPane_1.setViewportView(list);
						}

					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}else {
			dlm=new DefaultListModel<>();
			list.setModel(dlm);
			scrollPane_1.setViewportView(list);
		}
	}
	 public String extractCharacters(String input, char startChar, char endChar) {
	        StringBuilder result = new StringBuilder();

	        boolean insideRange = false;
	        for (char c : input.toCharArray()) {
	            if (c == startChar) {
	                insideRange = true;
	                continue;
	            }
	            if (c == endChar) {
	                insideRange = false;
	                continue;
	            }

	            if (insideRange==false) {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }
	 private class DropListener implements DropTargetListener {
		  @Override
	        public void dragEnter(DropTargetDragEvent dtde) {
	            // Xử lý sự kiện khi kéo vào vùng
	        	

	        }

	        @Override
	        public void dragOver(DropTargetDragEvent dtde) {
	            // Xử lý sự kiện khi kéo qua vùng
	        }

	        @Override
	        public void dropActionChanged(DropTargetDragEvent dtde) {
	            // Xử lý sự kiện khi hành động kéo thả thay đổi
	        	
	        }

	        @Override
	        public void dragExit(DropTargetEvent dte) {
	            // Xử lý sự kiện khi ra khỏi vùng
	        	
	        }

	        @Override
	        public void drop(DropTargetDropEvent dtde) {
	            // Xử lý sự kiện khi thả file vào vùng
	            dtde.acceptDrop(DnDConstants.ACTION_COPY);

	            Transferable transferable = dtde.getTransferable();
	            DataFlavor[] flavors = transferable.getTransferDataFlavors();

	            for (DataFlavor flavor : flavors) {
	                try {
	                    if (flavor.isFlavorJavaFileListType()) {
	                        List<File> files = (List<File>) transferable.getTransferData(flavor);

	                        // Xử lý file được thả vào đây
	                        for (File file : files) {
	                        	f=file;
//	                            System.out.println("Dropped file: " + file.getAbsolutePath());
	                            lbtenfile.setText( file.getName());
	                        }
	                    }
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
		 
	 }
}
	protected void do_btnNewButton_5_actionPerformed(ActionEvent e) {
		try {
			JFileChooser jFileChooser=new JFileChooser("D:");
			jFileChooser.setDialogTitle("chon file");
			int result = jFileChooser.showOpenDialog(null);//tra ve 1 so nguyen
			if(result==jFileChooser.APPROVE_OPTION) {
			    jFileChooser.setMultiSelectionEnabled(false);//chi doc 1 file
			    f=jFileChooser.getSelectedFile();
			    lbtenfile.setText( f.getName());
				
			    
			   
			}else {
				System.out.println("cancel");
			}			
		} catch (Exception e2) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e2.getMessage());
			//neu co loi thi show loi bang dialog
		}
	}
	protected void do_btnNewButton_6_actionPerformed(ActionEvent e) {
		//doc  file
	   try {
		   FileInputStream fileInputStream=new FileInputStream(f);
		   InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);

		    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		    String line=bufferedReader.readLine();
		    String sd="";
		    
		    while(line!=null) {
//		    for(int i=1;i<30;i++) {
//		    	System.out.println(line);    
		    	sd=sd+line+"\n";
//		    	System.out.println(line);
		    	line=bufferedReader.readLine();
		    }
		    ArrayList<QuestionBank> listBank= new FileDsQuestionBank().docQuiz();
		    for(QuestionBank qbi: listBank) {
		    	if(qbi.getNameQB().trim().equalsIgnoreCase(f.getName().substring(0,f.getName().length()-4))) {
		    		JOptionPane.showMessageDialog(null, "Tên ngân hàng đề đã tồn tại");
		    		return;
		    	}
		    }
			QuestionBank qb= new QuestionBank(f.getName().substring(0,f.getName().length()-4), "Default");
	    	ArrayList<Question> questions= new FileFormat().format(sd);   
	    	qb.setListQuestion(questions);
	    	ArrayList<QuestionBank> qblist= new FileDsQuestionBank().docQuiz();
	    	qblist.add(qb);
	    	new FileDsQuestionBank().ghiBank(qblist);
	    	 fileInputStream.close();
	    	 Gui2_1 g= new Gui2_1();
	    	 g.setVisible(true);
	    	 this.setVisible(false);
	} catch (Exception e2) {
		// TODO: handle exception
	}
	}
}
