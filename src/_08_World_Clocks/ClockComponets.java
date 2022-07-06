package _08_World_Clocks;

import javax.swing.JTextArea;

public class ClockComponets {
	String date;
	String time;
	JTextArea text;
	String city;
	public ClockComponets(String date, String time, String city, JTextArea text) {
		this.date = date;
		this.time = time;
		this.city = city;
		this.text = text;
	}
}
