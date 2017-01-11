package rechnen1;

import javax.swing.JOptionPane;

public class mathe1 {

	public static void main(String[] args) {
		int ergebnis = 0;
		String eingabe1 = JOptionPane.showInputDialog("Gib eine Zahl ein");
		String eingabe2 = JOptionPane.showInputDialog("Gib noch eine Zahl ein");
		String operator = JOptionPane.showInputDialog("Und jetzt Dein Operator");
		int zahl1 = Integer.parseInt(eingabe1);
		int zahl2 = Integer.parseInt(eingabe2);
		if (operator.equals("+"))
			ergebnis = zahl1 + zahl2;
		if (operator.equals("-"))
			ergebnis = zahl1 - zahl2;
		if (operator.equals("*"))
			ergebnis = zahl1 * zahl2;
		if (operator.equals("/"))
			ergebnis = zahl1 / zahl2;
		JOptionPane.showMessageDialog(null, "Ergebnis ist " + ergebnis);
	}

}
