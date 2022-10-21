package stacks;

import java.util.Collections;
import java.util.Stack;

public class StackChallenge {

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack();
       numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers);


        numbers.push(5);
        System.out.println(numbers);

      if(numbers.isEmpty()) {
          throw new RuntimeException("There are no numbers in the stack");
      } else {
          System.out.println(numbers.pop());
      }
      System.out.println(numbers);

      if(numbers.isEmpty()) {
          throw new RuntimeException("There are no numbers in the stack");
      } else {
          System.out.println(Collections.max(numbers));
      }





    }
}
