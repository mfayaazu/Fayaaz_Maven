package Java_cert;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question45 {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(10, 20, 8);
    System.out.println(nums.stream().max(Comparator.comparing(a -> a)).get());
   // System.out.println(nums.stream().max(Integer::max).get());    This gives output as 10 which is not the maximum number in the list.
    //    System.out.println(nums.stream().max());                  //Gives Compilation error
    //    System.out.println(nums.stream().map(a -> a).max());      //Gives Compilation error
  }

}

//Correct answer must be Option A
