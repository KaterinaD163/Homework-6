public class Main {

    // Задание 1
    // int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + "рублей");

        //Задание 2
        int minCosts = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minCosts) ;
            minCosts = arr[i];
            break;
        }
        int maxCosts = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCosts);
            maxCosts = arr[i];
            break;
        }
        System.out.println("Минимальная сумма трат за день составила " + minCosts + "рублей." +
                " Максимальная сумма трат за день составила " + maxCosts + "рублей.");
    }
}

// Задание 3






























