import java.io.*;

public class Help {
	public static void main(String args[]) throws IOException{
		System.out.print("Help on:\n"
				+ "\t1. if\n"
				+ "\t2. switch\n"
				+ "Choose one: ");
		char choice = (char)System.in.read();

		switch(choice){
		case '1':
			System.out.println("The if:\n"
					+ "if(condition)\n"
					+ "\tstatement;\n"
					+ "else\n"
					+ "\tstatement;");
			break;
		case '2':
			System.out.println("The switch:\n"
					+ "switch(expression){\n"
					+ "\tcase constant:\n"
					+ "\t\tstatement sequence\n"
					+ "\t\tbreak;\n"
					+ "\t//...\n"
					+ "}");
			break;	
		default:
			System.out.println("Selection not found.");
		}
		
		// code from the book
		System.out.println("Help on:\n");
		System.out.println("\t1. if\n");
		System.out.println("\t2. switch\n");
		System.out.println("Choose one: ");
		choice = (char)System.in.read();

		switch(choice){
		case '1':
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;\n");
			System.out.println("else\n");
			System.out.println("\tstatement;");
			break;
		case '2':
			System.out.println("The switch:\n");
			System.out.println("switch(expression){\n");
			System.out.println("\tcase constant:\n");
			System.out.println("\t\tstatement sequence\n");
			System.out.println("\t\tbreak;\n");
			System.out.println("\t//...\n");
			System.out.println("}");
			break;	
		default:
			System.out.println("Selection not found.");
		}
	}
}
