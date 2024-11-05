package Final_Work_1;

import java.util.Scanner;

public class income {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("доход за месяц");
        double income = scanner.nextDouble();
        if (income < 18800) {
            double income1 = income - income * 0.11;
            System.out.println(" доход за месяц с вычетом налога " + income1);
        }
        if (income >= 18800 && income < 468700) {
            double income2 = income - income * 0.20;
            System.out.println(" доход за месяц с вычетом налога " + income2);
        }
        if (income >= 468700 && income <= 675700) {
            double income3 = income - income * 0.32;
            System.out.println(" доход за месяц с вычетом налога " + income3);
        }
        if (income > 675700) {
            double income4 = income - income * 0.40;
            System.out.println(" доход за месяц с вычетом налога " + income4);
        }
    }
}
