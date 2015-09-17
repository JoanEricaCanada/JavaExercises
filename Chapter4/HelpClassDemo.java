import java.io.*;

public class HelpClassDemo {
	public static void main(String[] args) throws IOException{
		Help_exercise4 help = new Help_exercise4();
		char choice= ' ';
		
		do{
			if (choice != '\n'){
				help.showmenu();
				choice = (char)System.in.read();
				help.helpon(choice);
			}
		}while(choice != 'q');
		
		//code from the book
		/*char ignore;
		for(;;){
			do{
				choice = (char)System.in.read();
				do{
					ignore = (char) System.in.read();
				}while(ignore != '\n');
			}while(!help.isValid(choice));
			
			if (choice == 'q') break;
			System.out.println("\n");
			help.helpon(choice);
		}*/
	}
}
