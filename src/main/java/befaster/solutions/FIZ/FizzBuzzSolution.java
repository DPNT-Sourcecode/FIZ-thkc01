package befaster.solutions.FIZ;


public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if ((number.toString().contains("3") && number.toString().contains("5"))) {
            return "fizz buzz";
        } else if (number % 3 == 0 || number.toString().contains("3")) {
            return "fizz";
        } else if (number % 5 == 0 || number.toString().contains("5")) {
            return "buzz";
        } else {
            return number.toString();
        }
    }

}
