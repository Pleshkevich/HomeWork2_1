import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}