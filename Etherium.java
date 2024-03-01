

public class Etherium {
    public static void main (String [] args) {
        double[] range = {2.0, 1.0, 133.0, 2.0, 53.0, 5.0};
        System.out.println (sumOfSquares(3, 3));
        System.out.println (range(range));
    }

    public static double sumOfSquares (double first, double second) {
        return ((first * first) + (second * second));
    }

    public static double range (double[] numbers) {
        double max = numbers[0];
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max - min;
    }
}
