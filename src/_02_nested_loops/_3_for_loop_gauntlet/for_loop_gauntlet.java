package _02_nested_loops._3_for_loop_gauntlet;

public class for_loop_gauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}	
	for (int i = 0; i < 101; i++) {
		System.out.println(100-i);
	}	
	
	for (int i = 1; i < 101; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	
	for (int i = 0; i < 101; i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
	
	for (int i = 1; i < 501; i++) {
		if (i%2==0) {
			System.out.println(i + " is even.");
		}
		else {
			System.out.println(i + " is odd.");
		}
	}	
	
	for (int i = 0; i < 778; i++) {
		if(i%7==0) {
			System.out.println(i);
		}
	}	
		
	for (int i = 0; i < 17; i++) {
		int year = 2004 + i;
		System.out.println("In "+ year + " I was " + i + " years old.");
	}	
		
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(i + " " + j);
			
		}
	}	
	
	int num = 1;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print(num+ " " );
			num++;
		}
		System.out.println();
	}
		
	}

}
