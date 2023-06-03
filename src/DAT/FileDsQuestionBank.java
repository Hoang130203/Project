package DAT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale.Category;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

import Entity.Question;
import Entity.QuestionBank;
import Entity.Quiz;

public class FileDsQuestionBank implements Serializable{
	File f=new File("DsQuestionBank.DAT");
    public void ghiBank(ArrayList<QuestionBank> list)
    {
        try{
            if(!f.exists())
                f.createNewFile();
            FileOutputStream fo= new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(list);
            oos.close();
            fo.close();
        }   
        catch(Exception e){}
    }
    
    public ArrayList<QuestionBank> docQuiz() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        if(!f.exists()) {
            return new ArrayList<QuestionBank>();
        }
        FileInputStream fi= new FileInputStream(f);
        ObjectInputStream ois =new  ObjectInputStream(fi);
        ArrayList<QuestionBank> l= (ArrayList<QuestionBank>)ois.readObject(); 
        ois.close();
        fi.close();
        return (ArrayList<QuestionBank>)l;
    }
    public DefaultComboBoxModel<String> listCategory() throws FileNotFoundException, IOException, ClassNotFoundException {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        if (!f.exists()) {
//            model.addElement("Default");
            QuestionBank qb= new QuestionBank("Default", "");
            ArrayList<QuestionBank> list= new ArrayList<>();
            list.add(qb);
            new FileDsQuestionBank().ghiBank(list);
//            return model;
        }

        try {
            List<QuestionBank> list = new FileDsQuestionBank().docQuiz();
            DefaultMutableTreeNode root = null; // Khởi tạo root bằng null

            DefaultMutableTreeNode[] listNode = new DefaultMutableTreeNode[list.size()];

            for (int i = 0; i < list.size(); i++) {
                QuestionBank questionBank = list.get(i);
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(questionBank.getNameQB());
                listNode[i] = node;
            }

            for (int i = 0; i < list.size(); i++) {
                QuestionBank questionBank = list.get(i);
                for (int j = 0; j < list.size(); j++) {
                    if (listNode[j].toString().equals(questionBank.getParentOfQB())) {
                        for (int h = 0; h < list.size(); h++) {
                            if (listNode[h].toString().equals(questionBank.getNameQB())) {
                                listNode[j].add(listNode[h]);
                            }
                        }
                    }
                }
                if (listNode[i].toString().equalsIgnoreCase("Default")) {
                    root = listNode[i];
                }
            }

            if (root == null) {
                root = new DefaultMutableTreeNode("Default"); // Tạo root mặc định nếu không có nút "Default" nào được tìm thấy
            }

            JTree tree = new JTree(root);

            traverseTree(tree.getModel().getRoot(), model,0);

        } catch (Exception e) {
            // Xử lý ngoại lệ
        }

        return model;
    }


    private void traverseTree(Object node, DefaultComboBoxModel<String> model,int i) {
        if (node instanceof DefaultMutableTreeNode) {
            DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) node;
            String kc="";
            for(int j=0;j<=i;j++) {
            	kc+="   ";           
            	}
           
            int k=0;
            try {
				ArrayList<QuestionBank> listQB= new FileDsQuestionBank().docQuiz();
//				listQB= new FileDsQuestionBank().docQuiz();
				
				for(QuestionBank q:listQB) {
					if(q.getNameQB().equalsIgnoreCase(node.toString().trim())) {
						k=q.getListQuestion().size();

					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
            
            model.addElement(kc+treeNode.toString());
//            model.addElement(kc+treeNode.toString()+" ("+k+")");
            Enumeration<?> children = treeNode.children();
            while (children.hasMoreElements()) {
                Object childNode = children.nextElement();
                traverseTree(childNode, model,i+1);
            }
        }
    }


}
