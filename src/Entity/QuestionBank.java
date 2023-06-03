package Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class QuestionBank implements Serializable{
	private String nameQB;
	private String parentOfQB;
	private ArrayList<Question> listQuestion;
	private int soCauHoi;
	
	public int getSoCauHoi() {
		return soCauHoi;
	}
	public String getNameQB() {
		return nameQB;
	}
	public void setNameQB(String nameQB) {
		this.nameQB = nameQB;
	}
	public String getParentOfQB() {
		return parentOfQB;
	}
	public void setParentOfQB(String parentOfQB) {
		this.parentOfQB = parentOfQB;
	}
	public ArrayList<Question> getListQuestion() {
		return listQuestion;
	}
	public void setListQuestion(ArrayList<Question> listQuestion) {
		this.listQuestion = listQuestion;
	}
	public QuestionBank(String nameQB, String parentOfQB) {
		super();
		this.nameQB = nameQB;
		this.parentOfQB = parentOfQB;
	}

	
//	public ArrayList<QuestionBank> listChild(){
//		
//	}
}
