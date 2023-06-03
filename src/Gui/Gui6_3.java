package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAT.FileDsQuestionBank;
import DAT.FileDsQuiz;
import Entity.Question;
import Entity.QuestionBank;
import Entity.QuestionList;
//import Entity.QuestionRen;
import Entity.Quiz;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui6_3 extends JFrame {
	QuestionList ql;
	List<Quiz> list;
	private JPanel contentPane;
	private String name;
	DefaultListModel<Question> dlm;
	private JComboBox comboBox;
	private JList list_1;
	private JScrollPane scrollPane;
//
//	public Gui6_3(String name) {
//		super();
//		this.name = name;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui6_3 frame = new Gui6_3(name);
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
	public Gui6_3(String name) throws HeadlessException {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 746, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add from the question bank at the end");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(153, 0, 0));
		lblNewLabel.setBounds(34, 10, 363, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select a category :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(34, 66, 126, 26);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_comboBox_actionPerformed(e);
			}
		});
		comboBox.setBounds(156, 62, 216, 36);
		contentPane.add(comboBox);
		DefaultComboBoxModel<String> dcb= new DefaultComboBoxModel<>();
		try {
//			list= new ArrayList<>();
//			list= new FileDsQuiz().docQuiz();
//			for(Quiz i:list) {
//				dcb.addElement(i.getTenQuiz());
//			}
			dcb= new FileDsQuestionBank().listCategory();
			comboBox.setModel(dcb);
			
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
			
			JButton btnNewButton = new JButton("ADD SELECTED QUESTIONS TO THE QUIZ");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_btnNewButton_actionPerformed(e);
				}
			});
			btnNewButton.setBackground(new Color(7, 101, 114));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnNewButton.setBounds(34, 612, 315, 28);
			contentPane.add(btnNewButton);
			
			JButton btnExit = new JButton("EXIT");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_btnExit_actionPerformed(e);
				}
			});
			btnExit.setForeground(Color.WHITE);
			btnExit.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnExit.setBackground(new Color(166, 0, 0));
			btnExit.setBounds(364, 612, 102, 28);
			contentPane.add(btnExit);
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(34, 205, 688, 397);
			contentPane.add(scrollPane);
			
			list_1 = new JList();
//			list_1.addMouseListener(new MouseAdapter() {
//				@Override
//				public void mouseClicked(MouseEvent e) {
//					do_list_1_mouseClicked(e);
//				}
//			});
			list_1.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent event) {
	                JList list = (JList) event.getSource();
	                int index = list.locationToIndex(event.getPoint());// Get index of item
	                // clicked
	                
	                Question item = (Question) list.getModel().getElementAt(index);
	                item.setIsSelected(!item.isSelected()); // Toggle selected state
	                list.repaint(list.getCellBounds(index, index));// Repaint cell
	            }
	        });
			scrollPane.setViewportView(list_1);
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	protected void do_btnExit_actionPerformed(ActionEvent e) {
		Gui6_2a gui6_2a= new Gui6_2a(this.getName());
		this.setVisible(false);
		gui6_2a.setVisible(true);
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
							list_1.setModel(dlm);
						    
							list_1.setCellRenderer(new QuestionList());
							scrollPane.setViewportView(list_1);
							break;
						}else {
							listqs = q.getListQuestion();
							for(Question qs:listqs) {
								dlm.addElement(qs);
								
							}
							list_1.setModel(dlm);
						
							list_1.setCellRenderer(new QuestionList());
							scrollPane.setViewportView(list_1);
						}

					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}else {
			dlm=new DefaultListModel<>();
			list_1.setModel(dlm);
			list_1.setCellRenderer(new QuestionList());
			
			
			scrollPane.setViewportView(list_1);
		}
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
	protected void do_list_1_mouseClicked(MouseEvent e) {
		Question q= (Question)list_1.getSelectedValue();
//		q.setIsSelected(list_1.getSelectedValue().is);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			ArrayList<Quiz> listquiz= new FileDsQuiz().docQuiz();
			ArrayList<Question> listt= new ArrayList<>();
			DefaultListModel<Question> listModel = (DefaultListModel<Question>) list_1.getModel();
			int size = listModel.size();
			for (int i = 0; i < size; i++) {
			    Question question = listModel.getElementAt(i);
			    listt.add(question);
			}
			
			for(Quiz q:listquiz) {
				if(q.getTenQuiz().trim().equals(this.name.trim())) {
					if(q.getListQuestions()==null) {
						ArrayList<Question> quizzlistques=new ArrayList<>();
						for(Question i:listt) {
							if(i.isSelected()) {
								quizzlistques.add(i);
							}
						}
						q.setListQuestions(quizzlistques);
						new FileDsQuiz().ghiQuiz(listquiz);
						JOptionPane.showMessageDialog(null, "đã thêm câu hỏi vào quiz");
					}else {
						ArrayList<Question> quizzlistques= q.getListQuestions();
						for(Question i:listt) {
							if(i.isSelected()) {
								quizzlistques.add(i);
							}
						}
						q.setListQuestions(quizzlistques);
						new FileDsQuiz().ghiQuiz(listquiz);
						JOptionPane.showMessageDialog(null, "đã bổ sung");
					}
					break;
				}
			}
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
	}
}
