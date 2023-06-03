package Entity;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.Icon;

public class Quiz implements Serializable{
    private String tenQuiz;
    private final String iconName="/Resources/tick.png";
    private ArrayList<Question> listQuestions;
    
	public ArrayList<Question> getListQuestions() {
		return listQuestions;
	}
	public void setListQuestions(ArrayList<Question> listQuestions) {
		this.listQuestions = listQuestions;
	}
	public String getIconName() {
		return iconName;
	}
	public Quiz() {

	}
	public Quiz(String tenQuiz) {
		super();
		this.tenQuiz = tenQuiz;
	}

	public String getTenQuiz() {
		return tenQuiz;
	}

	public String getIcon() {
		return iconName;
	}
//	public void setIcon(Icon icon) {
//		this.icon = icon;
//	}
	public void setTenQuiz(String tenQuiz) {
		this.tenQuiz = tenQuiz;
	}

    @Override
    public String toString() {
    	return this.tenQuiz;
    }
     
}
