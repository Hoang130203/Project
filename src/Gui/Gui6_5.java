package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAT.FileDsQuestionBank;
import DAT.FileDsQuiz;
import Entity.Question;
import Entity.QuestionBank;
import Entity.Quiz;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui6_5 extends JFrame {
	ArrayList<String> listL = new ArrayList<>(); 
	ArrayList<Question> listL2 = new ArrayList<>(); 
	private JPanel contentPane;
	DefaultListModel<Question> dlm= new DefaultListModel<>();
	JList jList = new JList();
	private String tenQuiz;
	int itemsPerPage = 10;
	int currentPage = 1;
	int totalItems=0 ;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui6_5 frame = new Gui6_5(tenQuiz);
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
	public Gui6_5(String tenQuiz) {
		this.tenQuiz= tenQuiz;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 50, 739, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add a random question to page 1");
		lblNewLabel.setForeground(new Color(191, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, -2, 480, 49);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 705, 2);
		contentPane.add(separator);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 70, 705, 550);
		contentPane.add(tabbedPane);
		updateJList();
		DefaultComboBoxModel<String> dcb=new DefaultComboBoxModel<>();
		try {
			dcb=new FileDsQuestionBank().listCategory();
		    for (int i = 0; i < dcb.getSize(); i++) {
	            String element = dcb.getElementAt(i);
	            int k=0;
	            try {
					ArrayList<QuestionBank> listQB= new FileDsQuestionBank().docQuiz();

					for(QuestionBank q:listQB) {
						if(q.getNameQB().equalsIgnoreCase(element.trim())) {
							k=q.getListQuestion().size();

						}
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
	            listL.add(element+" ("+k+")");
	        }}catch (Exception e) {
				// TODO: handle exception
			}
		    DefaultComboBoxModel<String> dcb1= new DefaultComboBoxModel<>();
	    for(String s:listL) {
	    	dcb1.addElement(s);
	    }
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 255, 255));
		tabbedPane.addTab("Existing category", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Category");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 10, 65, 31);
		panel_1.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_comboBox_actionPerformed(e);
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setBounds(143, 10, 253, 31);
		jList.setModel(dlm);
		comboBox.setModel(dcb1);
		panel_1.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Include questions from subcategories too");
		chckbxNewCheckBox.setBounds(143, 55, 304, 21);
		panel_1.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number of random");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 161, 123, 31);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("questions");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 188, 65, 31);
		panel_1.add(lblNewLabel_1_2);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_1.setBounds(143, 162, 85, 31);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Questions matching this filter");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 215, 166, 31);
		panel_1.add(lblNewLabel_1_3);
		
		JButton previousPageButton = new JButton("Trang trước");
		previousPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_previousPageButton_actionPerformed(e);
			}
		});
		previousPageButton.setBounds(31, 243, 108, 21);
		panel_1.add(previousPageButton);
		
		JButton nextPageButton = new JButton("Trang sau");
		nextPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_nextPageButton_actionPerformed(e);
			}
		});
		nextPageButton.setBounds(157, 243, 97, 21);
		panel_1.add(nextPageButton);
		jList.setBounds(10, 308, 680, 189);
		panel_1.add(jList);
		JPanel panel = new JPanel();
		tabbedPane.addTab("New category", null, panel, null);
		
		JButton btnNewButton = new JButton("Add to Quiz");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setForeground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setBounds(10, 641, 193, 36);
		contentPane.add(btnNewButton);
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
							jList.setModel(dlm);
//							scrollPane_1.setViewportView(list);
							break;
						}else {
							listqs = q.getListQuestion();
							listL2.clear();
							totalItems=0;
							for(Question qs:listqs) {
								listL2.add(qs);
								totalItems++;
								updateJList();
								jList.setModel(dlm);
							}
//							list.setModel(dlm);
//							scrollPane_1.setViewportView(list);
						}

					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}else {
			dlm=new DefaultListModel<>();
			jList.setModel(dlm);
//			scrollPane_1.setViewportView(list);
		}
		DefaultComboBoxModel<String> dcb= new DefaultComboBoxModel<>();
		for(int i=1;i<=totalItems;i++) {
			dcb.addElement(i+"");
			comboBox_1.setModel(dcb);
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
	private void updateJList() {
	    dlm.clear();

	    int startIndex = (currentPage - 1) * itemsPerPage;
	    int endIndex = Math.min(startIndex + itemsPerPage, totalItems);

	    for (int i = startIndex; i < endIndex; i++) {
	        dlm.addElement(listL2.get(i)); // Thay "data" bằng danh sách dữ liệu thực tế của bạn
	    }
	}

	protected void do_previousPageButton_actionPerformed(ActionEvent e) {
		if (currentPage > 1) {
            currentPage--;
            updateJList();
        }
	}
	protected void do_nextPageButton_actionPerformed(ActionEvent e) {
		int maxPage = (int) Math.ceil((double) totalItems / itemsPerPage);
        if (currentPage < maxPage) {
            currentPage++;
            updateJList();
        }
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		int number= Integer.parseInt(comboBox_1.getSelectedItem().toString());
		ArrayList<Question> qsli= new ArrayList<>();
		for(int i=0;i<number;i++) {
			 int b=1;
			 while(b==1) {
				 Random random = new Random();
			     int randomIndex = random.nextInt(listL2.size());
			     Question q= listL2.get(randomIndex);
			     if(qsli.isEmpty()) {
			    	 qsli.add(q);
			    	 break;
			     }else {
			    	 int dem=0;
			    	 for(Question q1:qsli) {
							if(q1.getName().equals(q.getName())&& q1.getCauHoi().equals(q.getCauHoi()) && q1.getListChoice().equals(q.getListChoice())) {
								
							}else {
							    dem++;
							}
						}
			    	 if(dem==qsli.size()) {
			    		 b=0;
			    		 qsli.add(q);
			    	 }
			    	 
			     }
			 }
			 
		}
		try {
			ArrayList<Quiz> lq= new FileDsQuiz().docQuiz();
			for(Quiz qu:lq) {
				if(qu.getTenQuiz().trim().equals(this.tenQuiz)) {
					if(qu.getListQuestions()==null) {
						qu.setListQuestions(qsli);
					}else {
						ArrayList<Question> liq1= qu.getListQuestions();
						for(Question qq:qsli) {
							liq1.add(qq);
						}
						qu.setListQuestions(liq1);
					}
				}
			}
			new FileDsQuiz().ghiQuiz(lq);
		} catch (Exception e2) {
			// TODO: handle exception
		}
		JOptionPane.showMessageDialog(null, "Đã thêm "+number+" câu hỏi vào "+this.tenQuiz);
		Gui6_2a gui6_2a= new Gui6_2a(tenQuiz);
		gui6_2a.setVisible(true);
		this.setVisible(false);
	}
}
