package javaprogram;

import java.util.*;

public class Game1 {

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int computer=0;
		int user=0;
		System.out.println("Enter your name:");
		String name=sc.next();
		
		Random value = new Random();
		
		System.out.println("[Scissors=(0) Paper=(1) Rock=(2)]");
		int i=0;
		while(i<5) {
			System.out.println("--------------------------------------------");
     try {
			int a = value.nextInt(3);
			System.out.println("Choose any one no. (0),(1),(2)");
			
			int b=sc.nextInt();
			if(b==0 || b==1 || b==2) {
			System.out.printf("Computer choose (%d) & %s choose (%d)"+"\n",a,name,b);
			i++;
			 if (a == 0 && b == 1)
			{
				System.out.println("[computer won]");
				computer++;
			}else if (a == 0 && b == 2)
			{
				System.out.printf("[%s won]"+"\n",name);
				user++;
			}else if (a == 1 && b == 0)
			{
				System.out.printf("[%s won]"+"\n",name);
				user++;
			}else if (a == 1 && b == 2)
			{
				System.out.println("[computer won]");
				computer++;
			}else if (a == 2 && b == 0)
			{
				System.out.println("[computer won]");
				computer++;
			}else if (a == 2 && b== 1)
			{
				System.out.printf("[%s won]"+"\n",name);
				user++;
			}else	System.out.println("[Match Draw]");
			 
			}else {
				System.out.println("you choose Invalid no.");
			     }
	   }catch(Exception e) {
		    	 System.out.println(sc.next()+" is not a number please enter a valid no.");
		     }
		}
		    System.out.println("--------------------------------------------");
			System.out.printf("The final score of computer: %d & %s: %d"+"\n",computer,name,user);
		
		if (computer>user)
		{
			System.out.println("[copmuter won series]");
			
		}else if(computer<user){
			System.out.printf("[%s Won the Series]"+"\n",name);
			
		}else System.out.println("[Series Draw]");
		
	}		
 }

		

	
