public class Tasks {

    public Tasks(){
    }

    public void Task1(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int product = 1;
            for (int j = i; j <= 2 * i; j++) {
                product *= j;
            }
            sum += product;
        }

        System.out.println("Результат: " + sum);
    }

    public void Task2(int n) {
        int result = 1;

            if (n % 2 == 0) {
                for (int i = 2; i <= n; i += 2) {
                    result *= i;
                }
            } else {
                for (int i = 1; i <= n; i += 2) {
                    result *= i;
                }
            }
       System.out.println(n + "!! = " + result);
    }

    public void Task3(int a, int b) {

        System.out.println("Числа Армстронга в диапазоне [" + a + ", " + b + "]:");
        for (int num = a; num <= b; num++) {
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }

    public void Task4(int a, int b) {

        System.out.println("Пары дружественных чисел в диапазоне [" + a + ", " + b + "]:");
        for (int i = a; i <= b; i++) {
            for (int j = i + 1; j <= b; j++) {
                if (sumTask4(i) == j && sumTask4(j) == i) {
                    System.out.println(i + " и " + j);
                }
            }
        }
    }

    static int sumTask4(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public void Task5(double x, int n) {
        double result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        System.out.println(x + "^" + n + "=" + result);
    }

    public void Task6() {
        int count = 0;

        for (int num = 0; num <= 999999; num++) {
            int firstPart = num / 1000;
            int secondPart = num % 1000;

            if (sumTask6(firstPart) == sumTask6(secondPart)) {
                System.out.printf("%06d ", num);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        System.out.println("\nВсего: " + count + " счастливых билетов");
    }

    static int sumTask6(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public void Task7(int g) {
        if (g <= 0) {
            System.out.println("Номер должен быть положительным");
            return;
        }

        if (g == 1 || g == 2) {
            System.out.println("F(" + g + ") = 1");
            return;
        }

        int fib1 = 1, fib2 = 1, fib = 0;
        for (int i = 3; i <= g; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        System.out.println("F(" + g + ") = " + fib);
    }

    public void Task8(double x) {
        double res = 1;
        int[] coefficients = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int c : coefficients) {
            res = res * x + c;
        }
        System.out.println("Результат: " + res);
    }


}
