package vacation;

import java.util.Scanner;

public class GuiGu {
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÊı×Ö£º");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		while (a!=1){
			if(a%2==0){
				a=a/2;
			}else{
				a=a*3+1;
			}
		}
		System.out.println(a);
	}
}
