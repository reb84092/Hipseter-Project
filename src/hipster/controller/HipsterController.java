package hipster.controller;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * Hipster Controller
 * @author rbar3155
 * @version 0.x Nov 17, 2016
 * 
 */
public class HipsterController
{

	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	public HipsterController()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What is your name?");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName + "'s Hipster Project!");
	}
	
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}
}