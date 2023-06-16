import java.util.ArrayList;

class Recursion {

        static void func1(int n) {

                // Base Condition.
                if (n == 0)
                        return;
                System.out.print(n + " ");

                // Function call to print i till i increments to n.
                func1(1);

        }

        static void func2(int i, int n) {

                // Base Condition.
                if (i > n)
                        return;
                System.out.println("Raj");

                // Function call to print till i increments.
                func2(i + 1, n);

        }

        static void func3(int i, int n) {

                // Base Condition.
                if (i < 1)
                        return;
                System.out.println(i);

                // Function call to print i till i decrements to 1.
                func3(i - 1, n);

        }

        static void func4(int i, int sum) {

                // Base Condition.
                if (i < 1) {

                        System.out.println(sum);
                        return;
                }

                // Function call to increment sum by i till i decrements to 1.
                func4(i - 1, sum + i);

        }

        long func5(long N) {
                // code here
                if (N == 1) {
                        return 1;
                }
                return func5(N - 1) + N * N * N;
        }

        static int func6(int n) {

                // Base Condition.
                if (n == 0) {

                        return 1;
                }

                // Problem broken down into 2 parts and then combined.
                return n * func6(n - 1);

        }

        static ArrayList<Long> func7(long N) {
                // code here
                ArrayList<Long> al = new ArrayList<>();
                long f = 1;
                for (long i = 1; i <= N; i++) {
                        f = f * i;
                        if (f <= N)
                                al.add(f);

                        else
                                return al;
                }
                return al;
        }

        static void printArray(int arr[], int n) {
                System.out.print("Reversed array is:- \n");
                for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                }
        }

        // Function to reverse array using recursion
   static void func8(int arr[], int start, int end) {
      if (start < end) {
         int tmp = arr[start];
         arr[start] = arr[end];
         arr[end] = tmp;
         func8(arr, start + 1, end - 1);
      }

        void func9(ArrayList<Integer> arr, int n, int k) {
                for (int i = 0; i < n; i = i + k) {
                        int startIndex = i;
                        int endIndex = i + (k - 1);
                        if (endIndex >= n) {
                                endIndex = n - 1;
                        }
                        while (startIndex < endIndex) {
                                Integer temp = arr.get(endIndex);
                                arr.set(endIndex, arr.get(startIndex));
                                arr.set(startIndex, temp);
                                startIndex++;
                                endIndex--;
                        }

                }
        }

        static boolean func9(int i, String s) {

                // Base Condition
                // If i exceeds half of the string, means all the elements
                // are compared, we return true.
                if (i >= s.length() / 2)
                        return true;

                // If start is not equal to end, not palindrome.
                if (s.charAt(i) != s.charAt(s.length() - i - 1))
                        return false;

                // If both characters are same, increment i and check start+1 and end-1.
                return func9(i + 1, s);
        }

        public int func10(String S) {
                if (S.length() == 0 || S.length() == 1) {
                        return 1;
                }
                if (S.charAt(0) == S.charAt(S.length() - 1)) {
                        return func10(S.substring(1, S.length() - 1));
                }
                return 0;
        }

        static int func10(int N) {

                // Base Condition.
                if (N <= 1) {

                        return N;
                }

                // Problem broken down into 2 functional calls
                // and their results combined and returned.
                int last = func10(N - 1);
                int slast = func10(N - 2);

                return last + slast;
        }

        public static long[] func11(int n) {
                long[] v = new long[n];
                v[0] = 1;
                if (n > 1)
                        v[1] = 1;
                for (int i = 2; i < n; i++) {
                        v[i] = v[i - 1] + v[i - 2];
                }

                return v;

        }
}

        public static void main(String[] args) {

                // Here, let’s take the value of n to be 4.
                int n = 4;
                func1(n);
        }
}
