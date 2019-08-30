package ksiazka;
import java.util.*;

/**
 * Ten program demonstruje sposób u¿ycia pêtli <code>while</code>.
 * @author Micha³
 * @version 1.20 2019-08-30
 */
public class Retirement 
{
	public static void main(String[] args) 
	{
		//Wczytanie danych
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile pieniêdzy potrzebujesz aby przejœæ na emeryturê?");
		double goal = in.nextDouble();
		
		System.out.println("Ile pieniêdzy bêdziesz rocznie wp³acaæ?");
		double payment = in.nextDouble();
		
		System.out.println("Stopa procentowa w %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		//Aktualizacja salda konta, jeœli cel nie zosta³ osi¹gniêty
		while(balance < goal)
		{
			//Dodanie tegorocznych p³atnoœci i odsetek
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		
		System.out.println("Mo¿esz przejœæ na emeryturê za " + years + " lat.");
	}
}
