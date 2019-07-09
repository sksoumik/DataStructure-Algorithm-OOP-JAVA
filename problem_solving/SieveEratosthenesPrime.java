package problem_solving;

import java.util.Scanner;

// Find all the prime numbers upto n number
// This solution is called Sieve Eratosthenes
// Time complexity is O(n root(n) / log n )
public class SieveEratosthenesPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find all prime numbers <=n, enter the value of n: ");
        int n = sc.nextInt();
        boolean [] primes = new boolean[n+1]; // sieve

        // initialize primes[i] to true

        for(int i = 0; i< primes.length; i++) {
            primes[i] = true;
        }

        for(int k =2; k<= n/k; k++ ){
            if (primes[k]){
                for(int i = k; i <= n/k; i++ ){
                    primes[k*i] = false; // k * i is not prime
                }
            }
        }

        int count = 0; // Count the number of primes found so far.
        // Print prime numbers
        System.out.println("The prime numbers are: \n");
        for(int i = 0; i< primes.length; i++){
            if (primes[i]){
                count ++;
                if(count%10 == 0){
                    System.out.printf("%7d\n", i);
                }else {
                    System.out.printf("%7d", i);
                }
            }
        }

        System.out.println("\n"+ count + " primes less than or equal to "+ n);

    }


}

