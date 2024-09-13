/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

    }

    public static void doFizzBuzz(int i) {
        int j = 1;
        while(j < i+1){
            boolean divisibleBy3 = j % 3 == 0;
            boolean divisibleBy5 = j % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(j);

            }
            j++;
        }
    }
}
