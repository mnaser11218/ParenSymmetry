import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ParenSymmetry {


    private static Boolean isBalanced(String s) {
        // implement this method
        int results = 0;
        //System.out.println("inside");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                results++;
            } else if (s.charAt(i) == '(') {
                results--;
            }
        }
       // System.out.println(results==0);
        return results==0;
    }

    private static void checkFile(String filename) throws FileNotFoundException {
        // open file named filename
        System.out.println("inside check file");
        Scanner fileIn = new Scanner(new File(filename));
        while (fileIn.hasNext()) {
            String lineIn = fileIn.nextLine();
            System.out.println( isBalanced(lineIn));

        }


       // scanner.close();

    }

    // for each line in the file
    // read the line
    // print whether or not the line's parenthesis are balanced

    // CLOSE the file


public static void main(String[] args) throws FileNotFoundException {
    ParenSymmetry ps = new ParenSymmetry();
//
//    Boolean b0 = ps.isBalanced("()");
//    printResult(b0, true);
//
//    String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
//    Boolean falses = true;
//    for (String strToTest : falseStrings) {
//        falses = ps.isBalanced(strToTest);
//    }
//    printResult(falses, false);
//
//    String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
//    Boolean trues = false;
//    for (String strToTest : trueStrings) {
//        trues = ps.isBalanced(strToTest);
//    }
//    printResult(trues, true);
    checkFile("TestStrings0.txt");
    //   isBalanced(strToTest);

}

//    private static void isBalanced() {
//    }
//public boolean isBalanced(String stringToTest) {
//    boolean results = false;
//    System.out.println(stringToTest);
//    for (int i = 0; i <= stringToTest; i++) {
//        //if(stringToTest.charAt(i) == ")")
//    }
//}

private static void printResult(Boolean b0, boolean b) {
    if (b0 == null) {
        System.out.println("Null Failure");
        return;
    }
    if (b0 == b) {
        System.out.println("Success");
    } else {
        System.out.println("Failure");
    }
}


    };

