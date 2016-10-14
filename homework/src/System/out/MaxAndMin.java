package System.out;

import java.util.Scanner;

public class MaxAndMin {
	void max(){
		Scanner s = new Scanner(System.in);
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

		
		while(true){
			System.out.print("0~100사이의 숫자를 입력(Q는 종료)>>");
			String n = s.nextLine();		
			if(n.equals("q"))
				break;	
			else {
				
				int num = Integer.parseInt(n); 
							if (num > max){ 
							max = num;} 
								if(min > num){ 
							min = num; 

			}
		System.out.print("가장 큰 수는" +max+ "이고 작은수는" +min+"입니다.\n");
		}
	}
	}
}

