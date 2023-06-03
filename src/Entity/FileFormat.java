package Entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

//import DataAccess.Question;

public class FileFormat {
	public ArrayList<Question> format(String text){

	      ArrayList<Question> questions = new ArrayList<>();
	      Scanner scanner= new Scanner(text);
	      ArrayList<String> q= new ArrayList<>();
//	      int i=0;
	      while(scanner.hasNextLine()) {
	    	  String line=scanner.nextLine();
	    	  String tex="";
	    	  if(line==null) {
	    		  break;
	    	  }
	    	  if(line.isBlank() || line.isEmpty()) {
//	    		  line= scanner.nextLine();
	    		  continue;
	    	  }
	    	  while(!line.equalsIgnoreCase("ANSWER: A") &&!line.equalsIgnoreCase("ANSWER: B") &&!line.equalsIgnoreCase("ANSWER: C") 
	    			  &&!line.equalsIgnoreCase("ANSWER: D") &&!line.equalsIgnoreCase("ANSWER: E")){
	    		  tex= tex+line+"\n";
	    		  line=scanner.nextLine();
	    	  }
	    	  tex=tex+line;
	    	  if(!tex.isBlank() && !tex.isEmpty()) {
	    		  q.add(tex);
//	    		  i++;
	    	  }
	    	  
//	    	  line=scanner.nextLine();
	      }
	    int demdong=0;
	    String loi= "Error at: ";
        for(String qs: q) {
        	Scanner sc= new Scanner(qs);
        	String line= sc.nextLine();
        	demdong++;
        	String name= line.substring(0,line.indexOf(':'));
        	String cauHoi= line.substring(line.indexOf(':')+1).trim();
        	line=sc.nextLine();
        	demdong++;
        	while(line.trim().charAt(0)!='A' && line.trim().charAt(0)!='a'
        			&&line.trim().charAt(0)!='B' && line.trim().charAt(0)!='b'
	    					  &&line.trim().charAt(0)!='C' && line.trim().charAt(0)!='c'
	    					  &&line.trim().charAt(0)!='D' && line.trim().charAt(0)!='d'
	    					  &&line.trim().charAt(0)!='E' && line.trim().charAt(0)!='e') {
        		cauHoi=cauHoi+"<br>"+line;
        		line=sc.nextLine();
        		demdong++;
        	}
        	ArrayList<String> choices= new ArrayList<>();
        	while(!line.equalsIgnoreCase("ANSWER: A") &&!line.equalsIgnoreCase("ANSWER: B") &&!line.equalsIgnoreCase("ANSWER: C") 
	    			  &&!line.equalsIgnoreCase("ANSWER: D") &&!line.equalsIgnoreCase("ANSWER: E") ){
        		choices.add(line);
        		line= sc.nextLine();
        		demdong++;
        	}
        	String answer= line;
        	if(name==null || cauHoi==null || cauHoi.equalsIgnoreCase("") || choices==null ||choices.size()<=2 || answer==null || answer.equalsIgnoreCase("")) {
        		loi+=demdong+" ";
        		continue;
        	}else {
        		Question ques= new Question(name, cauHoi, choices, answer);
            	questions.add(ques);
        	}
        	
        }
        if(loi.equals("Error at: ")) {
        	JOptionPane.showMessageDialog(null, "Không có lỗi nào!");
        }else {
        	JOptionPane.showMessageDialog(null, loi);
        }
        return questions;
    }
}
	

