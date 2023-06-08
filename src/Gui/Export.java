package Gui;
import Entity.Question;
import Entity.Quiz;
import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import DAT.FileDsQuiz;
import Entity.Quiz;
public class Export {
	String name;
	Export(String name)	
	{
		this.name=name;
	}
	void expordPdf()
	{
		String s="";
		Quiz quiz = null;
		try {
			ArrayList<Quiz> listquiz= new FileDsQuiz().docQuiz();
			for(Quiz q:listquiz) {
				if(q.getTenQuiz().trim().equals(name.trim())) {
					quiz= q;
				}
			}
		} catch (Exception e1) {
		}
		for(Question ques:quiz.getListQuestions())
		{
			s=s+ques.getName()+"\n";
			for(String choice:ques.getListChoice())
			{
				s=s+choice+"\n";
			}
			s=s+"\n";
			try {
				String path="D:\\Question.pdf"; 
				Document doc = new Document();
				PdfWriter.getInstance(doc, new FileOutputStream(path));
				doc.open();
				BaseFont bf = BaseFont.createFont("UVNThoiNay_I.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
				Font font = new Font(bf, 12f, Font.NORMAL, BaseColor.BLACK);
				Paragraph para = new Paragraph();
				para.setFont(font);
				para.add(s);
				doc.add(para);
				doc.close();
			}
		 catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (DocumentException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
