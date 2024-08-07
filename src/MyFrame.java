import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

//	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dateFormat;
	SimpleDateFormat dayFormat;
	JLabel timeLabel;
	JLabel dateLabel;
	JLabel dayLabel;
	String time;
	String date;
	String day;

	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.setResizable(false);

		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		dayFormat = new SimpleDateFormat("EEEE");

		timeLabel = new JLabel();
		timeLabel.setFont(new Font("SansSerif", Font.PLAIN, 50));
		timeLabel.setForeground(new Color(0x00ff00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);

		dateLabel = new JLabel();
		dateLabel.setFont(new Font("SansSerif", Font.PLAIN, 25));
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("SansSerif", Font.PLAIN, 35));
		
		
		this.add(timeLabel);
		this.add(dateLabel);
		this.add(dayLabel);
		this.setVisible(true);

		setTime();

	}

	public void setTime() {
		while (true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);

			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
