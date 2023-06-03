package Entity;

import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

public class ImageTransferHandler extends TransferHandler  {
	 
	        @Override
	        public boolean canImport(TransferSupport support) {
	            return support.isDataFlavorSupported(DataFlavor.imageFlavor);
	        }

	        @Override
	        public boolean importData(TransferSupport support) {
	            if (!canImport(support)) {
	                return false;
	            }

	            Transferable transferable = support.getTransferable();
	            try {
	                Image image = (Image) transferable.getTransferData(DataFlavor.imageFlavor);
	                insertImage(image, support);
	                return true;
	            } catch (UnsupportedFlavorException | IOException ex) {
	                ex.printStackTrace();
	            }

	            return false;
	        }

	        private void insertImage(Image image,TransferSupport support) {
	        	JTextPane textPane = (JTextPane) support.getComponent();
	            int caretPosition = textPane.getCaretPosition();

	            ImageIcon originalIcon = new ImageIcon(image);
	            double maxWidth = textPane.getWidth() * 0.9;

	            double scaleFactor = 1.0;
	            if (originalIcon.getIconWidth() > maxWidth) {
	                scaleFactor = maxWidth / originalIcon.getIconWidth();
	            }

	            int newWidth = (int) (originalIcon.getIconWidth() * scaleFactor);
	            int newHeight = (int) (originalIcon.getIconHeight() * scaleFactor);

	            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
	            ImageIcon scaledIcon = new ImageIcon(scaledImage);

	            Style style = textPane.addStyle("icon", null);
	            StyleConstants.setIcon(style, scaledIcon);

	            Document document = textPane.getDocument();
	            try {
	                document.insertString(caretPosition, " ", style);
	            } catch (BadLocationException ex) {
	                ex.printStackTrace();
	            }
	        }
	        
	    
}
