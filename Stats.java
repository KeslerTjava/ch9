public class Stats {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Stats <integers>");
            return;
        }

        int first = Integer.parseInt(args[0]);
        int sum = 0;
        int min = first;
        int max = first;

        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            sum += n;
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        double average = (double) sum / args.length;

        System.out.println("Count: " + args.length);
        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Average: %.2f%n", average);
    }
}
