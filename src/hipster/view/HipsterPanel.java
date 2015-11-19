package hipster.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import hipster.controller.HipsterController;
import hipster.model.Book;

/**
 * @author rbar3155
 * @version 0.1 Nov 17, 2015
 * 
 */
public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		bookPageCountLabel = new JLabel("The page count");
		bookAuthorLabel= new JLabel("The author");
		bookPriceLabel = new JLabel("The price");
		bookSubjectLabel = new JLabel("The subject");
		bookTitleLabel = new JLabel ("The title");
		changeBookButton = new JButton("Change books");
		phraseComboBox = new JComboBox<String>();
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		startClick = 0;
		
		setupComboBox();
		setupPanel();
		
		
		
		
		
		
		
		
		
		
		
		private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.setBackground(Color.ORANGE);
			this.add(bookAuthorLabel);
			this.add(phraseComboBox);
			this.add(bookPageCountLabel);
			this.add(bookTitleLabel);
			this.add(bookPriceLabel);
			this.add(bookSubjectLabel);
			this.add(changeBookButton);
	}
	
		
private void setupLayout()
	{
		return baseLayout;
	}

public void setBaseLayout(SpringLayout baseLayout)
{
	this.baseLayout = baseLayout;
}

