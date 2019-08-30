package ksiazka;
import java.util.*;

/**
 * Ten program demonstruje u�ycie p�tli <code>do/while</code>
 * @author Micha�
 * @version 1.20 2019-08-30
 */
public class Retirement2 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile pini�dzy rocznie b�dziesz wp�aca�? ");
		double payment = in.nextDouble();
		
		System.out.println("Stopa oprocentowania w %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		double year = 0;
		
		String input;
		
		//Aktualizacja stanu konta, kiedy u�ytkowanik nie jest gotwy do przej�cia na emerytur�.
		do
		{
			//Dodanie tegorocznych p�atno�ci i odsetek
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			year++;
			
			//Drukowanie aktualnego stanu konta
			System.out.printf("Po up�ywie %f lat stan twojego konta wyniesie %,.2f%n", year, balance);
			
			//Zapytanie o gotowo�ci do przej�cia na emerytur� i pobranie danych
			System.out.print("Chcesz przej�� na emerytr�? (T/N) ");
			input = in.next();
		}
		while (input.equals("N"));
	}
}
