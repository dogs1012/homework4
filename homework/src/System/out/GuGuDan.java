package System.out;

import java.util.Scanner;

public class GuGuDan {
	void gugu(){
		
	  Scanner s = new Scanner(System.in); 
	  System.out.println("원하는 구구단 출려하기"); 
	  while(true){
		  System.out.print("출력하고 싶은 단(Q:종료)>>"); 
		   String gu = s.nextLine();
		   if(gu.equals("q"))  { 
			   			   break; 
		   }
		   else if(Integer.parseInt(gu) >1 && Integer.parseInt(gu)<10){
			   for(int i = 1; i<10 ; i++){ 
			  if(i%2 == 0) 
			  System.out.print(+Integer.parseInt(gu)+"*"+i+ "="+Integer.parseInt(gu)*i+"\n"); 
			  else 
         	  System.out.print(+Integer.parseInt(gu)+"*"+i+ "="+Integer.parseInt(gu)*i+"\n"); 
				   } 
			  

		   }
		   else 
	 	   { 
			   System.out.println("===> 잘못입력"); 
		   } 
	  }
	  }


}
