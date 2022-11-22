package modifiedcompoundinterestjl; //@author Justin Little
import java.util.Scanner;

public class ModifiedCompoundInterestJL {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double amount;
        double principal = 1000.0;
        double rate;
        
        System.out.println("Compound-Interest Program");
        
        for(rate = 0.05; rate <= 0.10; rate += 0.01)
        {
            System.out.printf("Compound-Interest for the rate of %.2f%n", rate);
            System.out.printf("%s%20s%n", "Year", "Amount on deposit");
                                
            for(int year = 1; year <= 10; ++year)
            {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            
            }
        }
    }
    }