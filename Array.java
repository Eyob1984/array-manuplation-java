import java.util.Arrays;

public class Array {
  public static void main (String[] args) {
    //Task 1
    int[] numbers = {1, 2, 3};
    System.out.println("First Element: " + numbers[0]);
    System.out.println("Secound Element: " + numbers[1]);
    System.out.println("Third Element: " + numbers[2]);

    //Task 2
    int[] arrayElements = {13, 5, 7, 68, 2};
    System.out.println( arrayElements[arrayElements.length / 2]);

    //Task 3
    String[] color  = {"red", "green", "blue", "yellow"};
    System.out.println("Color array length: " + color.length);
    String[] copiedColor = color.clone();
    System.out.println("Copied Array: " + Arrays.toString(copiedColor));

    //Task 4
    int[] fiveElements = {1, 2, 3, 4, 5};
    System.out.println("First Index: " + fiveElements[0]);
    int lastElement = fiveElements.length - 1;
    System.out.println("Last Element: " + fiveElements[lastElement]);

    //Task 5
    int[] loopArray = {1, 2, 3, 4, 5};
    for(int i = 0; i < loopArray.length; i++){
      System.out.println("Looped Array Elements: " + loopArray[i]);
    }

    //Task 6
    for(int j = 0; j < loopArray.length; j++){
    System.out.println("Looped Array Elements: " + loopArray[j] * 2);
    }

    //Task 7
    for(int i = 0; i < loopArray.length; i++){
      int middleEle = loopArray.length / 2;
      if(i == middleEle){
        continue;
      }
      System.out.println("Looped Array Elements: " + loopArray[i]);
    }

    //Task 8
    String[] swapElements  = {"red", "blue", "green", "yellow", "black"};
    int middleEle = loopArray.length / 2;
    String temp = "";
    temp = swapElements[0];
    swapElements[0] = swapElements[middleEle];
    swapElements[middleEle] = temp;

    System.out.println("Swapped Elements in Array: " + Arrays.toString(swapElements));

  }
}