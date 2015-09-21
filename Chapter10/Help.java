import java.io.*;

public class Help {
	String helpfile;
	
	Help(String fname){
		helpfile = fname;
		//System.out.println(fname + "--");
	}
	
	boolean helpon(String what){
		int ch;
		String topic, info;
		
		try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))){
			do{
				ch = helpRdr.read();
				if(ch == '#'){
					topic = helpRdr.readLine();
					if(what.compareTo(topic) == 0){
						do{
							info = helpRdr.readLine();
							if(info != null)
								System.out.println(info);
						}while((info != null) && (info.compareTo("") !=0));
						return true;
					}
				}
			}while (ch != -1);
		}catch (IOException exc){
			System.out.println("Error accessing help file.");
			//System.out.println(helpfile);
			return false;
		}
		return false;
	}
	
	String getSelection(){
		String topic = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter topic: ");
		try{
			topic = br.readLine();
			//System.out.print(topic);
		}catch (IOException exc){
			System.out.println("Error reading console.");
		}
		return topic;
	}
}
