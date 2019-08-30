package ksiazka;
import java.util.*;

/**
 * Ten program demonstruje spos�b u�ycia p�tli <code>while</code>.
 * @author Micha�
 * @version 1.20 2019-08-30
 */
public class Retirement 
{
	public static void main(String[] args) 
	{
		//Wczytanie danych
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile pieni�dzy potrzebujesz aby przej�� na emerytur�?");
		double goal = in.nextDouble();
		
		System.out.println("Ile pieni�dzy b�dziesz rocznie wp�aca�?");
		double payment = in.nextDouble();
		
		System.out.println("Stopa procentowa w %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		//Aktualizacja salda konta, je�li cel nie zosta� osi�gni�ty
		while(balance < goal)
		{
			//Dodanie tegorocznych p�atno�ci i odsetek
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		
		System.out.println("Mo�esz przej�� na emerytur� za " + years + " lat.");
	}
}
