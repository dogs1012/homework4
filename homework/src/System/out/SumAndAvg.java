package System.out;

import java.util.Scanner;

public class SumAndAvg {
	void avg(){
		Scanner s = new Scanner(System.in);
		int sum=0, count=0;
		double avg;
		while(true){
			
			System.out.print("���ڸ� �Է�(Q:����) >> "); 
						String n = s.nextLine(); 
					if(n.equals("q")){ 
					avg=sum/(double)count; 
					System.out.printf("�հ�� %d�̰�, ����� %.2f�Դϴ�.\n",sum,avg); 
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

