

public class Etherium {
    public static void main (String [] args) {

    }

    public double sumOfSquares (double first, double second) {
        return ((first * first) + (second * second));
    }

    public double range (double[] numbers) {
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
