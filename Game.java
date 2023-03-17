import java.util.Scanner;
public class Game
{
	public static void main(String[] args) 
	{
		Scanner jt=new Scanner(System.in);
		final String PURPLE_BACKGROUND = "\033[45m";
		final String RESET = "\033[0m";
		final String RED = "\033[0;31m";
		final String CYAN = "\033[0;36m";
		final String YELLOW = "\033[0;33m";
		final String RED_BOLD = "\033[1;31m";
		double a=Math.random()*100;
		boolean jash=true;
		int counter=0,b=0,c=0,d=0;
		char e='n',f='n';
		System.out.println(PURPLE_BACKGROUND +"===========Welcome in Game==========="+RESET);
		System.out.println();
		System.out.println(PURPLE_BACKGROUND +"===Close for type Y or y==="+RESET);
		System.out.println();
		System.out.println(PURPLE_BACKGROUND +"===See Number Which is genrete by AI type Y or y==="+RESET);
		System.out.println();
		System.out.println(PURPLE_BACKGROUND +"==This all type in last=="+RESET);
		System.out.println();
		do
		{
			a=(int)a*7;
			//System.out.println(a);
			System.out.println("Enter 1st Participent Number:");
			b=jt.nextInt();
			if(a==b)
			{
				counter=1;
				jash=false;
				break;
			}
			System.out.println("Enter 2nd Participent Number:");
			c=jt.nextInt();
			if(a==c)
			{
				counter=2;
				jash=false;
				break;
			}
			System.out.println("Enter 3rd Participent Number:");
			d=jt.nextInt();
			if(a==d)
			{
				counter=3;
				jash=false;
				break;
			}
			System.out.println(RED_BOLD+"If you want close this GAME:"+RESET);
			e=jt.next().charAt(0);
			if(e=='y'||e=='Y')
			{
				counter=4;
				break;
			}
			System.out.println(RED_BOLD+"If you want see Number genrate by AI:"+RESET);
			f=jt.next().charAt(0);
			if(f=='y'||f=='Y')
			{
				counter=5;
				break;
			}
			counter++;
			System.out.println();
		}
		while(jash);
		switch(counter)
		{
			case 1:
				System.out.println(YELLOW+"1st is Winner"+RESET);
				break;
			case 2:
				System.out.println(YELLOW+"2nd is Winner"+RESET);
				break;
			case 3:
				System.out.println(YELLOW+"3rd is Winner"+RESET);
				break;
			case 4:
				System.out.println(CYAN+"===Game Over==="+RESET);
				break;
			case 5:
				System.out.println(YELLOW+a+RESET);
				System.out.println(CYAN+"===Game Over==="+RESET);
				break;
			default:
				System.out.println(RED+"==NO COMMAND IN THIS GAME=="+RESET);
				break;
		}
	}
}