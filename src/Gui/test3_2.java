package Gui;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test3_2 extends JFrame {
	JScrollPane scrollPane=null;
	int trangthai=0;
	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3_2 frame = new test3_2();
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
	public test3_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 3, 803, 865);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 779, 804);
		contentPane.add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		panel.add(btnNewButton);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		expandPanel();
	}
	private void expandPanel() {
		if(trangthai==0) {
			// Lấy kích thước hiện tại của panel
		    Dimension currentSize = panel.getSize();
		    
		    // Tạo một kích thước mới gấp đôi chiều dài hiện tại
		    Dimension newSize = new Dimension(currentSize.width, currentSize.height * 2);
		    
		    // Đặt kích thước mới cho panel
		    panel.setSize(newSize);
		    
		    // Cập nhật lại kích thước của scrollPane
		    panel.setPreferredSize(newSize);
		    
		    // Yêu cầu scrollPane cập nhật hiển thị
		    scrollPane.revalidate();
		    scrollPane.repaint();
		    trangthai=1;
		}else {
			// Lấy kích thước hiện tại của panel
		    Dimension currentSize = panel.getSize();
		    
		    // Tạo một kích thước mới gấp đôi chiều dài hiện tại
		    Dimension newSize = new Dimension(currentSize.width, currentSize.height /2);
		    
		    // Đặt kích thước mới cho panel
		    panel.setSize(newSize);
		    
		    // Cập nhật lại kích thước của scrollPane
		    panel.setPreferredSize(newSize);
		    
		    // Yêu cầu scrollPane cập nhật hiển thị
		    scrollPane.revalidate();
		    scrollPane.repaint();
		    trangthai=0;
		}
	    
	}
}
