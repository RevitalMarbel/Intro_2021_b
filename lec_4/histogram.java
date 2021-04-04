package lec_4;

public class histogram {

	
	public static void main(String[] args) {
		
		int[] parties= {30,9,8,17,6,7};
		String[] names= {"l","b","t","y","d","r"};
		
		for (int i = 0; i < parties.length; i++) {
			System.out.print(names[i]+": ");
			for (int j = 0; j < parties[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
