/**
 * TimeComplexity
 */
public class TimeComplexity {

    public static void main(String[] args) {
        // all 32 bits so basic operations do not effect time complexity
        // all use the same amount of memory because int can only take up so much memory
        // what ever is not used just hold 0.
        int i1 = 10;
        int i2 = 1000000000;
        int i3 = 2 + 3;
        int i4 = 2000000 + 300000;
        int i5 = 2000 * 3000;
        int a = 0, b = 0, N = 1000;

        // allocate N integer memory space
        // fill every value with position 0
        // this is o(N) memory so liner space complexity
        int[] nums = new int[N];

        // Big O
        /*
         * cost for single execution times
         * i = c1 (a certain constant)
         * constant dose note effect time complexity
         * a = c2 (another constant)
         *
         * care about counting occurrence so the number of times the loop runs
         * so c1 N+1 (i=0,1,2,...,N-1,N)
         * c2 N (i=0,1,2,...,N-1)
         * T(N) = c1*(N+1) + c2*N = c1*N + c1 + c2*N + c1 = (c1 + c2) * N + c1
         * Focus on the N
         * c1 and c2 have such a small change in time it takes to run a program
         * so cancel out c1 and c2 and it just leave N
         * This would make time complexity O(N)
         */
        for (int i = 0; i < N; i++) {
            a = a + 1;
        }

        a = 0;
        // why it is n + 1
        int index;
        for (index = 0; index < N; index++) {
            a = a + 1;

            System.out.println("i: " + index + " a: " + a);
        }
        System.out.println("FINAL i: " + index + " FINAL a: " + a);

        /*
         * cost time
         * c1 N+1 (i=0,1,....,N-1,N)
         * c2 N (i=0,1,...,N-1)
         * c3 N (i=0,1,...,N-1)
         * T(N) = c1*(N+1) + c2*N + c3*N = c1*N + c2*N + c3*N + c1 = (c1 + c2 + c3)*N +
         * c1 = O(N)
         */
        for (int i = 0; i < N; i++) {
            a = a + 1;
            b = b + 1;
        }

        /*
         * Nested loop
         * cost time
         * c1 N+1 (i=0,1,2,...N)
         * c2 N+1 (i=0,j=0,1,2,3,...N) + N + 1 (i=1, j=0,1,2,3,...N) + N + 1 (i=N-1,
         * j=0,1,2,3,...N);
         * c3 N * N (i=0, j=0,1,2,3,...N-1), + N(i=N-1, j=0,1,2,3,...N-1)
         * Final time is
         * T(N) = c1*(N+1) + c2*N*(N+1) + c3*N*N = c1*N + c2*N*N + c2*N + c3*N*N
         * T(N) = c2*N*N +c3*N*N + c1*N + c2*N + c1
         * T(N) = (c2+c3)*N*N + (c1+c2)*N + c1
         * so O(N^2)
         */
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                a = a + 1;

        /*
         * cost times
         * c1 N+1 (k=0,1,...,N)
         * c2 N(N+1) (K=0,i,0,1...,N) + N + 1 (k=1,i=0,)
         * c3 N*N*(N+1) (k=0,i=0,j=0)
         * c4 N*N*N (k=0,i=0,j=0,j=0,1,2,3,4...N-1)
         * T(N) = O(N*N*N)
         */
        for (int k = 0; k < N; k++) // c1
            for (int i = 0; i < N; i++) // c2
                for (int j = 0; j < N; j++) // c3
                    a = a + 1; // c4

        /*
         * cost time
         * c1 N+1
         * C2 N*(N+1) / 2= J = 0, (I = 0) + (J=1,I=0,1) + (J=2, I=0,1,...J-1)
         * C3 N*(N-1)/2 1 (J=1. I=0) + (J=2, I=0,1) + ... + (J=N-1, I=0,1,2,...N-1)
         * T(N) = O(N*N) about half of two four loops but still N^2 so that is the
         * soultion
         */
        for (int j = 0; j < N; j++)
            for (int i = 0; i < j; i++)
                a = a + 1;

        for (int j = 0; j < N; j++) // c1 N+1
            for (int i = 0; i < j; i++) // c2 N*(N+1)
                a = a + 1; // c3 N*N
        b = b + 1; // c4 N

        for (int j = 0; j < 10; j++) // c1 11
            for (int i = 0; i < N; i++) // c2 10*(N + 1)
                a = a + 1; // c3 10*N
        System.out.println(a); // c4 10 Writing to screen takes a long time
        // T(N) = O(N)

        for (int j = 0; j < N; j++) // c1 11
            if (j == 10) // c2 11
                break; // c3 1

        for (int i = 0; i < N; i++) { // c1 N+1
            if (i < 10) // c2 N
                a = a + 1; // c3 10
            else
                a = a + 2; // c4 N-10
            // T(N) = c1*(N+1) + c2*N + c3*10 + c4*(N-10) = O(N)
        }

        // T(N) = O(1);
        /*
         * Time Complexity:
         * replay to email takes 2 mins
         * grade hw tokes 5 mins
         * repeat 30 times for a loop
         * 30 is the length of the array
         */
    }
}