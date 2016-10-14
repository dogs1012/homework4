package System.out;

import java.util.Scanner;

public class SumAndAvg {
	void avg(){
		Scanner s = new Scanner(System.in);
		int sum=0, count=0;
		double avg;
		while(true){
			
			System.out.print("숫자를 입력(Q:종료) >> "); 
						String n = s.nextLine(); 
					if(n.equals("q")){ 
					avg=sum/(double)count; 
					System.out.printf("합계는 %d이고, 평균은 %.2f입니다.\n",sum,avg); 
					break; 
				} 
				else{ 
					 sum = sum + Integer.parseInt(n);  
						 count ++; 
					 avg = sum/count; 

			}
					
			}

		}

	
	}

