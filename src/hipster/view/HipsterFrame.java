package hipster.view;

import javax.swing.JFrame;
import hipster.controller.HipsterController;

/**
 * @author rbar3155
 * @version 0.1 Nov 17 2015
 * 
 */
public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = new baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be a first line of setupFrame!
		this.setSize(500,500); //Find a good size for the app.
		this.setResizable(false); //Advisable, not required.
		this.setVisible(true); //Must be the last line of setupFrame!
	}
	
	public HipsterController getBaseController()
	{
		return baseController;
	}
}
