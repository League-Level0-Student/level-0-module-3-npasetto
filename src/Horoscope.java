import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String sign = JOptionPane.showInputDialog("What is your star sign?");
	if (sign.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading.");
	}else if (sign.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and ighly sensual in nature.");
	}else if (sign.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
	}else if (sign.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
	}
	else {
		JOptionPane.showMessageDialog(null, "That is not a star sign.");
	}
	
	

}
}
