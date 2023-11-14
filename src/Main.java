import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //input data
        int sizeOfArray = 30;
        int minWestMoney = 100_000;
        int maxWestMoney = 200_000;

        //call home work functions
        task1(sizeOfArray, minWestMoney, maxWestMoney);
        task2(sizeOfArray, minWestMoney, maxWestMoney);
        task3(sizeOfArray, minWestMoney, maxWestMoney);

        task4();
    }

    public static int[] generateRandomArray(int sizeOfArray, int minValue, int maxValue){
        //initial array with size
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < array.length; i++) {
            // assignment random value from min to max
            array[i] = maxValue - (int) (Math.random() * minValue);
        }

        return array;
    }

    public static void task1(int sizeOfArray, int minWestMoney, int maxWestMoney){

        // create random array
        int[] westMoneyInMonth = generateRandomArray(sizeOfArray, minWestMoney, maxWestMoney);

        int totalWestInMonth = 0;
        //get total west sum
        for (int i = 0; i < westMoneyInMonth.length; i++) {
            final int westInDay = westMoneyInMonth[i];
            totalWestInMonth += westInDay;
        }

        System.out.println("Сумма трат за месяц составила " + totalWestInMonth + " рублей");

    }

    public static void task2(int sizeOfArray, int minWestMoney, int maxWestMoney){
        // initial variable to find min and max value in array
        int min = maxWestMoney, max = minWestMoney;
        // create random array
        int[] westMoneyInMonth = generateRandomArray(sizeOfArray, minWestMoney, maxWestMoney);

        for (final int westInDay : westMoneyInMonth) {
            min = Math.min(westInDay, min);
            max = Math.max(westInDay, max);
        }

        // for test
        //System.out.println(Arrays.toString(westMoneyInMonth));
        System.out.println("Минимальная сумма трат за день составила "+ min + " рублей. Максимальная сумма трат за день составила " +max + " рублей");
    }

    public static void task3(int sizeOfArray, int minWestMoney, int maxWestMoney){
        double totalWestInMonth = 0;
        // create random array
        int[] westMoneyInMonth = generateRandomArray(sizeOfArray, minWestMoney, maxWestMoney);
        // get total sum for west
        for (final int westInDay : westMoneyInMonth) {
            totalWestInMonth += westInDay;
        }
        // get average
        double averageWestInMonth = totalWestInMonth / westMoneyInMonth.length;

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей %n", averageWestInMonth);
    }

    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            final char element = reverseFullName[i];
            System.out.print(element);
        }
    }
}