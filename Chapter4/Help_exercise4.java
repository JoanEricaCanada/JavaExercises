
public class Help_exercise4 {
	void helpon(char what){
		switch(what){
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
		}
	}
	
	void showmenu(){
		System.out.print("Help on:\n"
				+ "\t1. if\n"
				+ "\t2. switch\n"
				+ "\t3. for\n"
				+ "\t4. while\n"
				+ "\t5. do-while\n"
				+ "\t6. break\n"
				+ "\t7. continue\n"
				+ "Choose one (q to quit): ");
	}

	//code from the book
	/*boolean isValid(char ch){
		if(ch < '1' && ch > '7' | ch == 'q')
			return false;
		else
			return true;
	}*/
	
}
