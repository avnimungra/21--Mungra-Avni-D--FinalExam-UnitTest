
public class StringCalculator {
    private String string;

    public static int add(final String numbers) {
        if(numbers.contains("-")){
            throw new IllegalArgumentException("Error");
        }
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                if(1000 > Integer.parseInt(number.trim())) {
                    returnValue += Integer.parseInt(number.trim());
                }

            }
        }
        return returnValue;
    }
    //sets strings
    public void setString(String s) {
        string = s;
    }
    public String getString () {
        return string;
    }
}