package System.out;

import java.util.Scanner;

public class SumOfNumbers {
	void hap(){
		Scanner s = new Scanner(System.in);
		int	sum= 0;
		while(true)	{
			
		System.out.print("마지막 수를 입력(Q는 종료)>>");
		String n = s.nextLine();		
		if(n.equals("q"))
			break;	
		else 	{
			int j = Integer.parseInt(n);
		
			for(int i=1; i<=j; i++)
				sum = sum + i;
		}
	
		System.out.println("총 합은 "+sum+" 입니다.");
		}
		
	}
	
}		
	
		
