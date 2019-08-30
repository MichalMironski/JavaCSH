package ksiazka;
import java.util.*;

/**
 * Ten program demonstruje u¿ycie pêtli <code>do/while</code>
 * @author Micha³
 * @version 1.20 2019-08-30
 */
public class Retirement2 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile piniêdzy rocznie bêdziesz wp³acaæ? ");
		double payment = in.nextDouble();
		
		System.out.println("Stopa oprocentowania w %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		double year = 0;
		
		String input;
		
		//Aktualizacja stanu konta, kiedy u¿ytkowanik nie jest gotwy do przejœcia na emeryturê.
		do
		{
			//Dodanie tegorocznych p³atnoœci i odsetek
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			year++;
			
			//Drukowanie aktualnego stanu konta
			System.out.printf("Po up³ywie %f lat stan twojego konta wyniesie %,.2f%n", year, balance);
			
			//Zapytanie o gotowoœci do przejœcia na emeryturê i pobranie danych
			System.out.print("Chcesz przejœæ na emerytrê? (T/N) ");
			input = in.next();
		}
		while (input.equals("N"));
	}
}
