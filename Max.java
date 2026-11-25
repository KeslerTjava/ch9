public class Max {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Max <numbers>");
            return;
        }
        int max = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max);
    }
}
