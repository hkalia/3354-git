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
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        return sum;
    }
}
