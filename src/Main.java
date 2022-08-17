public class Main {
    public static void main(String[] args) {
    }
// Задание 1
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
            System.out.println("Сумма трат за месяц составила " + sum + "рублей");
            return arr;
        }

    }























