package Gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.datatransfer.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.*;

public class JInternalFrameCreateNew extends JFrame {
	public JInternalFrameCreateNew() {
		
		
		JTextPane textPane_1 = new JTextPane();
		JScrollPane scrollPane = new JScrollPane(textPane_1);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
//		scrollPane.setViewportView(textPane_1);
	}

    private JTextPane textPane;

    public void ImageInTextPaneExample() {
    	setTitle(null);
        JTextPane textPane = new JTextPane();
        textPane.setEditable(true);
        textPane.setBackground(Color.WHITE);
        textPane.setForeground(Color.BLACK);
        setBounds(100, 100, 888, 522);
        JScrollPane scrollPane = new JScrollPane(textPane);
        getContentPane().add(scrollPane);

        TransferHandler handler = new ImageTransferHandler();
        textPane.setTransferHandler(handler);

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ImageTransferHandler extends TransferHandler {

        @Override
        public boolean canImport(TransferSupport support) {
            if (!support.isDrop()) {
                return false;
            }
            if (!support.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                return false;
            }
            return true;
        }

        @Override
        public boolean importData(TransferSupport support) {
            if (!canImport(support)) {
                return false;
            }
            Transferable transferable = support.getTransferable();
            try {
                java.util.List<File> files = (java.util.List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);
                for (File file : files) {
                    Image  image = ImageIO.read(file);
                    if (image != null) {
                        ImageIcon imageIcon = new ImageIcon(image);
                        SimpleAttributeSet attrs = new SimpleAttributeSet();
                        StyleConstants.setIcon(attrs, imageIcon);
                        ((StyledDocument) textPane.getDocument()).insertString(textPane.getCaretPosition(), " ", attrs);
                    }
                }
                return true;
            } catch (UnsupportedFlavorException | IOException | BadLocationException ex) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameCreateNew frame = new JInternalFrameCreateNew();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}