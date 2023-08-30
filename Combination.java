import java.util.Scanner;

public class Combination{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
            int numberOfElements;
            System.out.println("Please write total number of elements in the set : ");
            numberOfElements=input.nextInt();
            int numberOfElementsOfSubset;
            System.out.println("For the number of subsets you will calculate, write how many elements the subset will have:  ");
            numberOfElementsOfSubset=input.nextInt();
            
            int factorialOfNumberOfElements=1;
            for(int i=1; i<=numberOfElements; i++){
                factorialOfNumberOfElements =factorialOfNumberOfElements*i;            }
            int factorialOfNumberOfElementsOfSubset=1;
            for(int k=1; k<=numberOfElementsOfSubset;k++){
                factorialOfNumberOfElementsOfSubset=factorialOfNumberOfElementsOfSubset*k;
            }
            int factorialOfDifference=1;
            for(int j=1; j>=(factorialOfNumberOfElements-factorialOfNumberOfElementsOfSubset);j++){
                factorialOfDifference=factorialOfDifference*j;

            }
            int finalAnswer=1;
            finalAnswer=factorialOfNumberOfElements/(factorialOfNumberOfElementsOfSubset*factorialOfDifference);
                System.out.println(finalAnswer);
        
    }
}