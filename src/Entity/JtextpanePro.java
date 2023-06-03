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
import Entity.ImageTransferHandler;


public class JtextpanePro extends JTextPane{
	
    public JtextpanePro() {
        setEditable(true);
        setTransferHandler(new ImageTransferHandler());
    }


	
}