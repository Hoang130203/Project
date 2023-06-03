package Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Question implements Serializable{
	private String name;
	private String cauHoi;
	private ArrayList<String> listChoice;
	private String answer;
	private Boolean isSelected=false;
	
	public Boolean isSelected() {
		return isSelected;
	}
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCauHoi() {
		return cauHoi;
	}
	public void setCauHoi(String cauHoi) {
		this.cauHoi = cauHoi;
	}
	public ArrayList<String> getListChoice() {
		return listChoice;
	}
	public void setListChoice(ArrayList<String> listChoice) {
		this.listChoice = listChoice;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question(String name, String cauHoi, ArrayList<String> listChoice, String answer) {
		super();
		this.name = name;
		this.cauHoi = cauHoi;
		this.listChoice = listChoice;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return name + ": " + cauHoi +"  "+ answer;
	}
	
}
