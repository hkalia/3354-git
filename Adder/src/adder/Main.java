package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Plese format integers correctly");
        } catch (IllegalArgumentException e) {
            System.err.println("Please provide at least two integers to add");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred");
        }
    }

    private static int addArguments(String[] args) {
        if (args.length < 2) throw new IllegalArgumentException();
        int sum = 0;
        if (args[0].equals("-")) {
            if (args.length < 3) throw new IllegalArgumentException();
            for (int i = 1; i < args.length; i++) {
                sum -= Integer.parseInt(args[i]);
            }
            return sum;
        }
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        return sum;
    }
}
