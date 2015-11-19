package hipster.controller;

/**
 * Starts the Hipster Project
 * @author rbar3155
 * @version 0.1 Nov 19, 2015
 */
public class HipsterRunner
{
	public static void main (String [] args)
	{
		HipsterController myController = new HipsterController();
		myController.start();
	}
}
