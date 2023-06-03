package Gui;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import DAT.FileDsQuiz;
import Entity.CountdownTimerFrame;
import Entity.LamBai;
import Entity.Question;
import Entity.Quiz;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.awt.event.WindowAdapter;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.DefaultButtonModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Gui7_3 extends JFrame {
	private int trangThaiNop=0;
	private JPanel contentPane;
	private JLabel lblNewLabel_6;
	private String name;
	private JPanel panel_3;
	private int socauhoi=0;
	Timer timer;
	public JButton[] getButtons() {
		return buttons;
	}

	public void setButtons(JButton[] buttons) {
		this.buttons = buttons;
	}
	JButton[] buttons=new JButton[67];
	LamBai[] lambais= new LamBai[67];

	int[] correct= new int[67];
	int[] wrong = new int[67];
	private int countCorrect=0;
	private int countWrong=0;
	
	private Quiz quiz;
	private CountdownTimerFrame countdown;
	private JButton btnNewButton_1;
	private JLabel lbKetQua;
	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui7_3 frame = new Gui7_3(name);
					frame.setVisible(true);
					frame.addWindowListener(new WindowAdapter() {
		                @Override
		                public void windowClosing(WindowEvent e) {
		                    System.exit(0);
		                }
		            });
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui7_3(String name) {
		this.name=name;
		try {
			ArrayList<Quiz> listquiz= new FileDsQuiz().docQuiz();
			for(Quiz q:listquiz) {
				if(q.getTenQuiz().trim().equals(name.trim())) {
					this.quiz= q;
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, 0, 1548, 870);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel.setBounds(10, 10, 1514, 139);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("IT\r\n");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(21, 10, 57, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(21, 88, 57, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("/ My courses /");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(65, 90, 112, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("/");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(344, 92, 45, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("THI CUỐI KỲ       General");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(161, 89, 173, 18);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("/");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(247, 85, 45, 29);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel(name+" / Preview");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(381, 89, 197, 18);
		panel.add(lblNewLabel_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(130, 135, 144)));
		scrollPane.setBounds(10, 159, 1034, 664);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(10, 40, 1012, 612);
		panel_1.add(scrollPane_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setSize(1000,4000);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		
//			ArrayList<String> choices=new ArrayList<>();
//			choices.add("A.là câu a");
//			choices.add("B.là câu b");
//			choices.add("C.là câu c");
		int i=1;
		int j=0;
		panel_3 = new JPanel();
		for(Question question:quiz.getListQuestions()) {
			final float finalJ = j;
			final float finalI = i;
			lambais[i]= new LamBai(i,question);
			
			panel_4.add(lambais[i]);
//			int hei= panel_4.getHeight()+400;
			panel_4.setPreferredSize(new Dimension(panel_4.getWidth(), panel_4.getPreferredSize().height + 300));
			    
			panel_4.revalidate();
			panel_4.repaint();
			
			buttons[j]=new JButton(j+1+"");
			buttons[j].setPreferredSize(new Dimension(50,45));
			buttons[j].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	
                    JScrollBar verticalScrollBar = scrollPane_1.getVerticalScrollBar();
                    int scrollAmount= (int) (verticalScrollBar.getMaximum() * (finalJ*0.997/socauhoi));
                    verticalScrollBar.setValue(scrollAmount);
                }
            });
			panel_3.add(buttons[j]);
			j++;
			i++;
			socauhoi++;
			if(socauhoi==67) {
				break;
			}
		}
		timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	for(int m=0;m<socauhoi;m++) {
            		if(lambais[m+1].getDaChon()!='\0') {
            			buttons[m].setBackground(Color.cyan);
            		}
            	}
            
            }
        });
		timer.start();
		scrollPane_1.setViewportView(panel_4);
		
		countdown = new CountdownTimerFrame();
		countdown.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_countdown_propertyChange(evt);
			}
		});
		countdown.setBorder(new LineBorder(new Color(255, 128, 128)));
		countdown.setBounds(889, 5, 60, 30);
		panel_1.add(countdown);
		
		JLabel lblNewLabel_8 = new JLabel("Time left");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(823, 6, 56, 30);
		panel_1.add(lblNewLabel_8);
		
		btnNewButton_1 = new JButton("Trở về");
		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_1_actionPerformed(e);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Gui7_3.class.getResource("/Resources/9035984_return_down_back_sharp_icon.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(26, 5, 117, 25);
		panel_1.add(btnNewButton_1);
		
		lbKetQua = new JLabel("");
		lbKetQua.setBorder(new LineBorder(new Color(172, 0, 0)));
		lbKetQua.setForeground(new Color(128, 0, 0));
		lbKetQua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbKetQua.setBounds(258, 5, 232, 30);
		panel_1.add(lbKetQua);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_2.setBounds(1054, 159, 470, 664);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("QUIZ NAVIGATION");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setForeground(new Color(196, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(0, 0, 470, 53);
		panel_2.add(btnNewButton);
		
		lblNewLabel_6 = new JLabel("Finish attempt...");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				do_lblNewLabel_6_mouseClicked(e);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				do_lblNewLabel_6_mouseEntered(e);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				do_lblNewLabel_6_mouseExited(e);
			}
		});
		lblNewLabel_6.setForeground(new Color(32, 32, 32));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 578, 163, 26);
		panel_2.add(lblNewLabel_6);
		
		
		panel_3.setBounds(10, 103, 450, 465);
		panel_3.setLayout(new FlowLayout(FlowLayout.LEFT));
//		for(int j=0;j<67;j++) {
//			
//		}
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Gui7_3.class.getResource("/Resources/1564535_customer_user_userphoto_account_person_icon.png")));
		lblNewLabel_7.setBounds(10, 63, 53, 44);
		panel_2.add(lblNewLabel_7);
	}
	protected void do_lblNewLabel_6_mouseClicked(MouseEvent e) {
		if(trangThaiNop==0) {
			int x= JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn nộp bài?");
			if(x==JOptionPane.YES_OPTION) {
				trangThaiNop=1;
				timer.stop();
				for(int k=1;k<=socauhoi;k++) {
					Enumeration<AbstractButton> buttons = lambais[k].getGroup().getElements();
					while (buttons.hasMoreElements()) {
					    AbstractButton button = buttons.nextElement();
					    button.setEnabled(false);
					}
					lambais[k].getLbanswer().setText("Answer: "+lambais[k].getAnswer());
					
					if(Character.toUpperCase(lambais[k].getAnswer())==Character.toUpperCase(lambais[k].getDaChon())) {
						correct[countCorrect]=k;
						countCorrect++;
						lambais[k].getPanel().setBorder(new LineBorder(Color.GREEN));
						lambais[k].getPanel_1().setBorder(new LineBorder(Color.GREEN));
					}else {
						wrong[countWrong]=k;
						countWrong++;
						lambais[k].getPanel().setBorder(new LineBorder(Color.RED));
						lambais[k].getPanel_1().setBorder(new LineBorder(Color.RED));
					}
				}
				for(int k=0;k<countWrong;k++) {
					buttons[wrong[k]-1].setBackground(Color.RED);
				}
				countdown.stop();;
				
				btnNewButton_1.setVisible(true);
				if(countWrong>0) {
					String str= "sai ở các câu: ";
					for(int m=0;m<countWrong;m++) {
						str+=wrong[m]+" ";
						
					}
					JOptionPane.showMessageDialog(null, str);
				}else {
					JOptionPane.showMessageDialog(null, "chúc mừng bạn làm đúng hết!");
				}
				
				lbKetQua.setText("     số câu trả lời đúng: "+countCorrect+"/"+socauhoi);
			}else if(x==JOptionPane.CANCEL_OPTION){
				Gui6_1 gui6_1= new Gui6_1(name);
				gui6_1.setVisible(true);
				this.setVisible(false);
			}else {
				
			}
		}else {
			JOptionPane.showMessageDialog(null, "bạn đã nộp bài rồi!");
			
		}
	}
	protected void do_lblNewLabel_6_mouseEntered(MouseEvent e) {
		lblNewLabel_6.setForeground(Color.gray);
	}
	protected void do_lblNewLabel_6_mouseExited(MouseEvent e) {
		lblNewLabel_6.setForeground(Color.BLACK);
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		Gui6_1 gui6_1= new Gui6_1(name);
		gui6_1.setVisible(true);
		this.setVisible(false);
	}
	protected void do_countdown_propertyChange(PropertyChangeEvent evt) {
		if(countdown.getText().equals("0:00:00")&& trangThaiNop==0) {
			JOptionPane.showMessageDialog(null, "HẾT GIỜ!");
			timer.stop();
			for(int k=1;k<=socauhoi;k++) {
				Enumeration<AbstractButton> buttons = lambais[k].getGroup().getElements();
				while (buttons.hasMoreElements()) {
				    AbstractButton button = buttons.nextElement();
				    button.setEnabled(false);
				}
				lambais[k].getLbanswer().setText("Answer: "+lambais[k].getAnswer());
				
				if(Character.toUpperCase(lambais[k].getAnswer())==Character.toUpperCase(lambais[k].getDaChon())) {
					correct[countCorrect]=k;
					countCorrect++;
					lambais[k].getPanel().setBorder(new LineBorder(Color.GREEN));
					lambais[k].getPanel_1().setBorder(new LineBorder(Color.GREEN));
				}else {
					wrong[countWrong]=k;
					countWrong++;
					lambais[k].getPanel().setBorder(new LineBorder(Color.RED));
					lambais[k].getPanel_1().setBorder(new LineBorder(Color.RED));
					
				}
			}
			for(int k=0;k<countWrong;k++) {
				buttons[wrong[k]-1].setBackground(Color.RED);
			}
			countdown.stop();;
			trangThaiNop=1;
			btnNewButton_1.setVisible(true);
			if(countWrong>0) {
				String str= "sai ở các câu: ";
				for(int m=0;m<countWrong;m++) {
					str+=wrong[m]+" ";
					
				}
				JOptionPane.showMessageDialog(null, str);
			}else {
				JOptionPane.showMessageDialog(null, "chúc mừng bạn làm đúng hết!");
			}
			
			lbKetQua.setText("     số câu trả lời đúng: "+countCorrect+"/"+socauhoi);
		}
	}
}
