import java.io.*;

public class Help {
	public static void main(String args[]) throws IOException{
		char choice, ignore;
		do{
			System.out.print("Help on:\n"
					+ "\t1. if\n"
					+ "\t2. switch\n"
					+ "\t3. for\n"
					+ "\t4. while\n"
					+ "\t5. do-while\n"
					+ "Choose one: ");
			choice = (char)System.in.read();
		}while(choice < '1' && choice > '7');
		
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
		case '3':
			System.out.println("The for:\n"
					+ "for(init; condition; iteration)\n"
					+ "\tstatement;");
			break;
		case '4':
			System.out.println("The while:\n"
					+ "while(condition)\n"
					+ "\t statement;");
			break;
		case '5':
			System.out.println("The do-while:\n"
					+ "do{\n"
					+ "\tstatement;\n"
					+ "}while(condition);");
			break;
		case '6':
			System.out.println("The break:\n"
					+ "break; or break label;");
			break;
		case '7':
			System.out.println("The continue:\n"
					+ "continue; or continue label;");
			break;
		default:
			System.out.println("Selection not found.");
			break;
		}
		
		// code from the book
		do{
			System.out.print("Help on:\n");
			System.out.print("\t1. if\n");
			System.out.print("\t2. switch\n");
			System.out.print("\t3. for\n");
			System.out.print("\t4. while\n");
			System.out.print("\t5. do-while\n");
			System.out.print("\t6. break\n");
			System.out.print("\t7. continue\n");
			System.out.print("Choose one: ");
			choice = (char)System.in.read();
			do{
				ignore = (char)System.in.read();
			}while(ignore != '\n');
		}while(choice < '1' | choice > '7');

		switch(choice){
		case '1':
			System.out.print("The if:\n");
			System.out.print("if(condition) statement;");
			System.out.print("else");
			System.out.print("\tstatement;");
			break;
		case '2':
			System.out.print("The switch:\n");
			System.out.print("switch(expression){");
			System.out.print("\tcase constant:");
			System.out.print("\t\tstatement sequence");
			System.out.print("\t\tbreak;");
			System.out.print("\t//...");
			System.out.println("}");
			break;
		case '3':
			System.out.println("The for:\n");
			System.out.print("for(init; condition; iteration)");
			System.out.println("\tstatement;");
			break;
		case '4':
			System.out.println("The while:\n");
			System.out.print("while(condition)");
			System.out.print("\t statement;");
			break;
		case '5':
			System.out.println("The do-while:\n");
			System.out.print("do{");
			System.out.print("\tstatement;");
			System.out.println("}while(condition);");
			break;
		case '6':
			System.out.println("The break:");
			System.out.println("break; or break label;");
			break;
		case '7':
			System.out.println("The continue:");
			System.out.println("continue; or continue label;");
			break;
		default:
			System.out.println("Selection not found.");
			break;
		}
	}
}
