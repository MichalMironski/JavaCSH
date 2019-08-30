package ksiazka;
import java.util.*;
/**
 * Ten program demonstruje zastosowanie p�tli <code>for</code>
 * @author Micha�
 * @version 1.20 2019-08-30
 */
public class LotteryOdds 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile liczb ma by� wylosowanych?");
		int k = in.nextInt();
		
		System.out.println("Jaka jest g�rna granica przedzia�u losowanych liczb? ");
		int n = in.nextInt();
		
		/*
		 * Obliczanie wsp�czynnik dwumianowego n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
		 */
		int lotteryOdds = 1;
		for (int i = 1 ; i <= k ; i++)
		{
			lotteryOdds = lotteryOdds * (n - i + 1) / i;
		}
		System.out.println("Twoje szanse to 1 do " + lotteryOdds + ". Powodzenia!");
	}
}
