package com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class robo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Robot rob=new Robot();
	rob.delay(5000);
	rob.keyPress(KeyEvent.VK_H);
	rob.keyRelease(KeyEvent.VK_H);
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
