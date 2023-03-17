import java.util.Scanner;
public class Game2
{
	public static void main(String[] args) 
	{
		Scanner jt=new Scanner(System.in);
		final String PURPLE_BACKGROUND = "\033[45m";
		final String RESET = "\033[0m";
		//final String RED = "\033[0;31m";
		final String CYAN = "\033[0;36m";
		final String YELLOW = "\033[0;33m";
		final String RED_BOLD = "\033[1;31m";
		System.out.println(PURPLE_BACKGROUND+"=====Welcome in Game====="+RESET);
		System.out.println(RED_BOLD+"+++ROCK+++"+RESET);
		System.out.println(RED_BOLD+"++PAPER+++"+RESET);
		System.out.println(RED_BOLD+"+++SIZER+++"+RESET);
		System.out.println("Your turn:");
		String e=jt.nextLine();
		char a=e.charAt(0);
		double b=Math.random();
		char c='r';
		if(b>=0.33)
		{
			System.out.println("COMPUTER sign rock");
			c='r';
		}
		else if(b>=0.66 && b<=0.33)
		{
			System.out.println("COMPUTER sign paper");
			c='p';
		}
		else
		{
			System.out.println("COMPUTER sign SIZER");
			c='s';
		}
		if(a==c)
		{
			System.out.println(YELLOW+"Match draw"+RESET);
		}
		else if((a=='r' && c=='s') || (a=='s' && c=='p') || (a=='p' && c=='r'))
		{
			System.out.println(CYAN+"You are winner"+RESET);
		}
		else
		{
			System.out.println(CYAN+"Computer is Winner"+RESET);
		}
	}
}