package Final_Work_1;

public class expenses_per_week {
    public static void main (String[] args) {
        int [] array = new int[8];
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            int random = (int) (1000 + Math.random() * 4001) ;
            array[i] = random;
            System.out.print(i + " день: ");
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("Расход за всю неделю: " + sum);
    }
}
