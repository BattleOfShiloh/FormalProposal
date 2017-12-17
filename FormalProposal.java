import javax.swing.JOptionPane;
public class FormalProposal {
	public static void main(String[] args) {
		int answer;
		String message = "You're my FIRST choice to formal.\n"
				+ "Do you graciously accept?";
		do {
			answer = JOptionPane.showConfirmDialog(null, message);
		} while (answer != JOptionPane.YES_OPTION); // Only takes yes for an answer
	}
}
