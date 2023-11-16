import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //input data
        int sizeOfArray = 30;
        int minWestMoney = 100_000;
        int maxWestMoney = 200_000;

        //basic home work
        task1(sizeOfArray, minWestMoney, maxWestMoney);
        task2(sizeOfArray, minWestMoney, maxWestMoney);
        task3(sizeOfArray, minWestMoney, maxWestMoney);
        task4();

        System.out.println("");

        //hardest home work
        // https://skyengpublic.notion.site/1-5-1-6-e341c40d890748719f9713a9604d3f71
        task5();
        task6();
        task7();
        task8and9();
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

    public static void task5(){
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // if index is
                if(3 % (i + 1) == 0) {
                    if(3 % (j + 1) == 0) matrix[i][j] = 1;

                } else if (2 % (i + 1) == 0){
                    if(3 % (j+1) != 0) matrix[i][j] = 1;
                }
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6(){
        int[] wrongArray = new int[]{5, 4, 3, 2, 1};

        int[] reverseArray = new int[wrongArray.length];

        for (int i = wrongArray.length; i > 0; i--) {
            final int element = wrongArray[i-1];

            int newIndex = wrongArray.length - i;
            reverseArray[newIndex] = element;
        }
        System.out.println(Arrays.toString(reverseArray));
    }

    public static void task7(){

     int[] array = new int[]{5, 8, 2, 3, 9};
     System.out.println(Arrays.toString(array));

     int left = 0;
     int right = array.length - 1;

     while (left < right) {
        final int leftEl = array[left];
        final int rightEl = array[right];

        array[left] = rightEl;
        array[right] = leftEl;

        left++;
        right--;
     }
     System.out.println(Arrays.toString(array));
    }

    public static void task8and9(){
        int[] array = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                final int num1 = array[i - 1];
                final int num2 = array[j];

                int sum = num1 + num2;

                if(sum == -2) {
                    System.out.println("два числа, сумма которых равна −2: " + num1 + " и " + num2);
                }

            }
        }

    }

    public static void task9(){

    }
}