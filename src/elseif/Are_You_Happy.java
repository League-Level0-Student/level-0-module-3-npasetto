package elseif;

import javax.swing.JOptionPane;

public class Are_You_Happy {
	public static void main(String[] args) {
		int answer = JOptionPane.showConfirmDialog(null, "Are you happy?", "happy", JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}

		else {
			answer = JOptionPane.showConfirmDialog(null, "Do you want to be happy?", "wantHappy", JOptionPane.YES_NO_OPTION);
			
			if (answer == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}

			else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			}
		}
	}
}
