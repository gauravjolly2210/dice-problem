package dice;

import java.util.Scanner;
import java.util.Random;
class dices{

public dices(){
Scanner sc=new Scanner(System.in); 

System.out.println("enter the number of sides of dice");
int side=sc.nextInt();

switch(side)
	{
		case 2:System.out.println("answer is"+twoSide());
		break;
		case 4:System.out.println(fourSide());
		break;
		case 6:System.out.println(sixSide());
		break;
		default:System.out.println("invalid sides");
		break;	
	}
}

public String twoSide(){
	String head = "head",tails = "tails";
	Random rand=new Random();
	int rand_int=rand.nextInt(2);

	if(rand_int>0)
		{
		return head;
		}	
	else{return tails;}
}

public int fourSide(){

	Random rand=new Random();
	int rand_int=rand.nextInt(4+1)+1;

	return rand_int;
}

public int sixSide(){

	Random rand=new Random();
	int rand_int=rand.nextInt(6+1)+1;

	return rand_int;
}
public static void main(String args[]) {
	
	dices obj=new dices();
	
}
}
