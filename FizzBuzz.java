public class FizzBuzz {
  public String of(int i) {

    for (int i = 1; i <= 100; i++)

      if (i % 3 == 0 && i % 5 == 0) {
      return "FizzBuzz";
      }
      else if (i % 3 == 0) {
      return "Fizz";
      }
      else if (i % 5 == 0) {
      return "Buzz";
      }
      else {
        return String.valueOf(i);
      }
    }
  }
