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

        if (isDeluxe(number)) {
            if (!output.isEmpty()) {
                output = output.concat(" ");
            }

            if (isFakeDeluxe(number)) {
                output = output.concat("fake ");
            }

            output = output.concat("deluxe");

        }

        if (output.isEmpty()) {
            return number.toString();
        }


        return output;

    }

    private boolean isDeluxe(Integer number) {
        if (number <= 10) return false;
        String numberString = number.toString();
        for (char c : numberString.toCharArray()) {
            if (c != numberString.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    private boolean isFakeDeluxe(Integer number) {
        return number % 2 != 0;
    }

}
