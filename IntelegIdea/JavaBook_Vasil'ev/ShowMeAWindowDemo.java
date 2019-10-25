import javax.swing.JOptionPane;
import java.util.Scanner;
class ShowMeAWindowDemo{
	static Scanner scanner = new Scanner(System.in);

		public static void main(String[] args){
			int a = 114995;
			//int b = 5;
			int playerNumber;

			//JOptionPane.showMessageDialog(null,"Hello Bitch!");

			do {
	            playerNumber = scanner.nextInt();
	            if (playerNumber < a) {
	                JOptionPane.showMessageDialog(null,"Error Comand!");
	            } else if (playerNumber > a) {
	                JOptionPane.showMessageDialog(null,"Error Comand!");
	            } else {
	                break;
	            }
	        } while (playerNumber != a);
	               
	        JOptionPane.showMessageDialog(null,"Comand is true!");                       
	    }
}