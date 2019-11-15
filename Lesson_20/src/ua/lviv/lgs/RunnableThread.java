package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Scanner;

public class RunnableThread implements Runnable {
	private ArrayList<Integer> Fibonachi_arrlist;

	public void run() {
		Fibonachi_arrlist = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How much we want to see Fibonacci numbers_RunnableThread:");
		int num_fibo=sc.nextInt();
		
		int n0 = 1;Fibonachi_arrlist.add(n0);
		int n1 = 1;Fibonachi_arrlist.add(n1);
		int n2;
		for(int i = 3; i <= num_fibo; i++){
			n2=n0+n1;
			Fibonachi_arrlist.add(n2);
			n0=n1;n1=n2;
		}
		
	}
	
	
	public void Out_Print() {
		
		for (int i=Fibonachi_arrlist.size()-1;i>=0;i--) 
		{
			System.out.println(Fibonachi_arrlist.get(i));
		}
			
	}
	
}
