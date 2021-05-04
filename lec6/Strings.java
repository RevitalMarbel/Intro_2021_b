package lec6;

import lec3.MyConsole;

public class Strings {

	
	public static void main(String[] args) {
//		char c1=65;
//		char c2='a';
//		
//		System.out.println(c1);
//		System.out.println((int)c2);
//		
//		for (int i = 65; i < 65+26; i++) {
//			System.out.print((char)i);
//		}
//		System.out.println();
//		for (int i = 97; i < 97+26; i++) {
//			System.out.print((char)i);
//		}
//		for (int i = 0; i < 65; i++) {
//			System.out.print((char)i);
//		}
		
//		char c='r';
//		
//		switch(c){
//		case 'a':
//			System.out.println("very good!");
//			break;
//		case 'b':
//			System.out.println(" good!");
//			break;
//		case 'c':
//			System.out.println(" can be better");
//			break;
//		default:
//			System.out.println("defult");
//			
//		}
		
		
		String s1= "ABA";
		
		String s2= "ABBA";
		
		String s3= new String("Narkirs");
		String s4= new String("Narkis");
		
		
		//System.out.println(s3.compareTo(s4));
		
		s2=s2.replace('B', 'C');
		System.out.println(s2);
		String[] s6= s3.split("r");
		
		System.out.print(s6[0]+" "+s6[1]+" "+s6[2]);
		
		
	}
	
	
}
