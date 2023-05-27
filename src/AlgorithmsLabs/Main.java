package AlgorithmsLabs;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
	int[] tableValues = {1, 10, 20, 30, 40, 50, 100, 1000};
	int[]tableValues2 = {1, 20, 40, 60, 80, 100};
    printResults(tableValues2);
    }

    public static void printResults(int[] nValues){
        int f,g;
        //Just swap out function in print statement as needed to get answer
        //Change %d to %f accordingly

            //PAGE 1
        //Function set 1
        //f(n) = 8lg n -> (8*log2(nValues[i]))
        //g(n) = 2n    -> (2*nValues[i])

        //Function set 2
        //f(n) = nlg n  -> nValues[i]*log2(nValues[i]))
        //g(n) = 9n+9   -> 9*nValues[i]+9)

        //Function set 3
        //f(n) = n^2 + 6n + 5 -> (n*n) + (6*n)+ 5)
        //g(n) = 2(n^2)       -> 2*(n*n)

        //Function set 4
        //f(n) = 2n lg n -> (2*n*log2(n))+(4*n))
        //g(n) = n^2 +1  -> (n*n)+1)

            //PAGE 2
        //Function set 1
        //f(n) = 10lg n -> 10* log2(n)
        //g(n) = n      -> n

        //Function set 2
        //f(n) = 2nlg n  -> (2*n*log2(n))
        //g(n) = n^2 + 2 -> (n*n) +2

            //PAGE 3
        //f(n) = n^2 + 60n + 1 -> (n*n) + (60*n) +1
        //g(n) = 2n^2          -> (2*(n*n))

        //f(n) = n^2 + 2       -> (n*n) +2
        //g(n) = 30nlg n + 10n -> (30*n*log2(n)) + (10*n);
    for(int i=0; i<nValues.length; i++){

        int n = nValues[i];
        System.out.printf("f(n) %d: %f\n",nValues[i], 10* log2(n));
        System.out.printf("g(n) %d: %d\n",nValues[i], n);
        System.out.println("=====================");
    }
    }

    public static double log2(int N){
        double result = (Math.log(N) / Math.log(2));

        return result;
    }
}
