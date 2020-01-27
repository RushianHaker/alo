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
				System.out.println("Привет...\r\n");
				System.out.println("Введите пароль для входа в систему:\r\n");
	            playerNumber = scanner.nextInt();
	            if (playerNumber < a) {
	                JOptionPane.showMessageDialog(null,"Error Comand!");
	                System.out.println("Повторите попытку...\r\n");
	            } else if (playerNumber > a) {
	                JOptionPane.showMessageDialog(null,"Error Comand!");
	                System.out.println("Повторите попытку...\r\n");
	            } else {
	                break;
	            }
	        } while (playerNumber != a);
	        System.out.println("Вы вошли в систему... спасибо!\r\n");       
	        JOptionPane.showMessageDialog(null,"Comand is true!");                       
	    }
}