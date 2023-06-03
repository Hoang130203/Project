package Entity;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.ImageIcon;

public class LamBai extends JPanel{
	private char answer;
	private char daChon;
	JPanel panel;
	JPanel panel_1;
	private DefaultButtonModel dbm= new DefaultButtonModel();
	public JPanel getPanel_1() {
		return panel_1;
	}
	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		this.answer = answer;
	}
	public char getDaChon() {
		return daChon;
	}
	public void setDaChon(char daChon) {
		this.daChon = daChon;
	}
	private int i;
	ButtonGroup group;
	
	public ButtonGroup getGroup() {
		return group;
	}
	public void setGroup(ButtonGroup group) {
		this.group = group;
	}
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lbanswer;
	
	public JLabel getLbanswer() {
		return lbanswer;
	}
	public void setLbanswer(JLabel lbanswer) {
		this.lbanswer = lbanswer;
	}
	public LamBai(int i,Question question) {
		this.i=i;
		this.answer= question.getAnswer().trim().charAt(8);
		setSize(950,300);
		setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(87, 87, 87)));
		panel.setBounds(10, 10, 155, 237);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Question "+i);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 10, 107, 28);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Not yet");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 45, 87, 28);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("answered");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 63, 87, 28);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Make out of");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(10, 92, 87, 28);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("1.00");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(10, 113, 87, 28);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("Flag Question");
		lblNewLabel_2.setIcon(new ImageIcon(LamBai.class.getResource("/Resources/34221_flag_icon.png")));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 151, 107, 28);
		panel.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(186, 10, 754, 280);
		add(scrollPane);
		

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(new BorderLayout());
//		panel_1.setLayout(null);
		JTextPane debai= new JTextPane();
		
		debai.setEditable(false);
		debai.setBounds(30, 10, 752, 100);
		debai.setCaret(null);
		debai.setFont(new Font("Tahoma",Font.PLAIN,14));
		debai.setContentType("text/html");
		debai.setText("<html><body style='width: 570px'>" + question.getName() + ": " + question.getCauHoi() + "</body></html>");
		panel_1.add(debai,BorderLayout.NORTH);
		debai.setPreferredSize(null);
		group= new ButtonGroup();
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new GridLayout(0,1));
		for(String s:question.getListChoice()) {
			JRadioButton choice= new JRadioButton();
//			choice.setContentType("text/html");
			choice.setText("<html><body style='width: 570px'>" + s + "</body></html>");
			choice.setActionCommand(s.trim());
			choice.setBackground(Color.white);
//			choice.setPreferredSize(new Dimension(30,500));
		    choice.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_rdbtnNewRadioButton_actionPerformed(e);
				}
			});
			group.add(choice);
			
			choice.setPreferredSize(choice.getSize());
			panel_2.add(choice);
		}
		panel_1.add(panel_2,BorderLayout.CENTER);
		scrollPane.setViewportView(panel_1);
		
		lbanswer = new JLabel("");
		lbanswer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbanswer.setBounds(20, 249, 129, 41);
		add(lbanswer);
	}
	protected void do_rdbtnNewRadioButton_actionPerformed(ActionEvent e) {
		ButtonModel selectedButton = group.getSelection();
		if (selectedButton != null) {
		    // Lấy tên của JRadioButton được chọn
		    String selectedRadioButtonText = selectedButton.getActionCommand();
//		    System.out.println("Selected RadioButton: " + selectedRadioButtonText);
		    
		    if (selectedRadioButtonText != null) {
		    	this.daChon=selectedRadioButtonText.trim().charAt(0);
		    	lblNewLabel_1.setText("");
		    	lblNewLabel_1_1.setBounds(10, 45, 87, 28);
//		    	System.out.println("Selected "+daChon);
		    } else {
//		        System.out.println("Selected RadioButton text is null at "+i);
		    }
		} else {
//		    System.out.println("No RadioButton selected at "+i);
		}
	}
}
