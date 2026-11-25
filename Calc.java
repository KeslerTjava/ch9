public class Calc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
            return;
        }

        String op = args[0];

        if (!op.equals("add") && !op.equals("mult")
                && !op.equals("max") && !op.equals("min")) {
            System.err.println("Unknown operation: " + op);
            return;
        }

        int result = Integer.parseInt(args[1]);

        for (int i = 2; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            if (op.equals("add")) {
                result += n;
            } else if (op.equals("mult")) {
                result *= n;
            } else if (op.equals("max")) {
                if (n > result) {
                    result = n;
                }
            } else if (op.equals("min")) {
                if (n < result) {
                    result = n;
                }
            }
        }

        System.out.println(result);
    }
}
