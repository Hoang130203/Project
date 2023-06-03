package Entity;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class QuizRendered extends JPanel implements ListCellRenderer<Quiz>{
	private JLabel lbIcon= new JLabel();
	private JLabel lbTenQuiz = new JLabel();
	
	public QuizRendered() {
	
//		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
//		setLayout(new FlowLayout(FlowLayout.LEADING));
		setLayout(new BorderLayout(10, 20));
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
//		add(Box.createRigidArea(new Dimension(10, 4)));
//		JPanel panel=new JPanel(new GridLayout(1,2));
//		setLayout(new BoxLayout(this, BoxLayout.X_AXIS)); // Sử dụng BoxLayout ngang
//        lbIcon.setIconTextGap(10);
		add(lbIcon,BorderLayout.WEST);
		add(lbTenQuiz,BorderLayout.CENTER);
//		setFont(new Font("Tahoma", Font.PLAIN, 20));
//		add(panel);
	}
	 @Override
	    public Component getListCellRendererComponent(JList<? extends Quiz> list,
	            Quiz quiz, int index, boolean isSelected, boolean cellHasFocus) {
		  lbIcon.setIcon(new ImageIcon(getClass().getResource(quiz.getIcon()))); 
		  lbTenQuiz.setText(quiz.getTenQuiz());
		  lbIcon.setOpaque(true);
		  lbTenQuiz.setOpaque(true);
//		    lbIcon.setOpaque(true);
//		  Font font= this.getFont();
//		  setFont(font.deriveFont(22));
		    // when select item
		    if (isSelected) {
		        lbTenQuiz.setBackground(list.getSelectionBackground());
//		        lbAuthor.setBackground(list.getSelectionBackground());
		        lbIcon.setBackground(list.getSelectionBackground());
		        setBackground(list.getSelectionBackground());
		    } else { // when don't select
		        lbTenQuiz.setBackground(list.getBackground());
//		        lbAuthor.setBackground(list.getBackground());
		        lbIcon.setBackground(list.getBackground());
		        setBackground(list.getBackground());
		    }
		  return this;
		 
	 }
	 
}
