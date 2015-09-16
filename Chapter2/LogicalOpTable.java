
public class LogicalOpTable {
	public static void main(String args[]){
		boolean p,q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		p = true;q = true;
		for(int a=0; a<4; a++){
			if (a == 2)
				p = !p;
			q = !((a%2)!= 0); // convert int to boolean
			
			System.out.print(p + "\t" + q +"\t");
			System.out.print((p & q) + "\t" + (p | q) +"\t");
			System.out.println((p ^ q) + "\t" + (!p) +"\t");
		}
		
		//code from book
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = true;q = true;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p & q) + "\t" + (p | q) +"\t");
		System.out.println((p ^ q) + "\t" + (!p) +"\t");
		
		p = true;q = false;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p & q) + "\t" + (p | q) +"\t");
		System.out.println((p ^ q) + "\t" + (!p) +"\t");
		
		p = false;q = true;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p & q) + "\t" + (p | q) +"\t");
		System.out.println((p ^ q) + "\t" + (!p) +"\t");
		
		p = false;q = true;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p & q) + "\t" + (p | q) +"\t");
		System.out.println((p ^ q) + "\t" + (!p) +"\t");
	}
}
