package befaster.solutions.FIZ;


public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String output = "";

        if (number % 3 == 0 || number.toString().contains("3")) {
            output = output.concat("fizz");
        }

        if (number % 5 == 0 || number.toString().contains("5")) {
            if (output.contains("fizz")) {
                output = output.concat(" ");
            }
            output = output.concat("buzz");
        }

        if (isFakeDeluxe(number)) {
            if (!output.isEmpty()) {
                output = output.concat(" ");
            }

            output = output.concat("fake deluxe");

        }

        if (output.isEmpty()) {
            return number.toString();
        }


        return output;

    }

    private boolean isFakeDeluxe(Integer number) {
        if (number % 3 == 0 && number.toString().contains("3")) {
            return true;
        }
        if (number % 5 == 0 && number.toString().contains("5")) {
            return true;
        }
        return false;
    }

}
