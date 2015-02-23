
package javaapplication2;
import java.io.*;
public class first_program {
  public static void main(String[] arg) {
        String first = "John";
        String middle = "Fitzgerald";
        String last = "Kennedy";
        String initials;
        String firstInit, middleInit, lastInit;
        firstInit = first.substring(0, 1);
        middleInit = middle.substring(0, 1);
        lastInit = last.substring(0, 1);
        initials = firstInit.concat(middleInit);
        initials = initials.concat(lastInit);
        System.out.println();
        System.out.println(first + " " + middle + " " + last + "");
        System.out.println(initials);
        System.out.println(last + "," + first + "" + middle);
        System.out.println(last + "," + first + "" + middle + ".");
        System.out.println(first.toUpperCase() + "" + last.toUpperCase());
        System.out.println(first + "equals John is" + first.equals("John"));
        System.out.println(first + "equals John(ignoring case)is" + first.equalsIgnoreCase("John"));
        System.out.println("The character at index 3 in" + middle + "is" + middle.substring(1, 3));
        System.out.println("The index of \"gerald\"within" + middle + "is" + middle.indexOf("gerald"));
        System.out.println("The index of \"gerald\"within" + last + "is" + last.indexOf("gerald"));
        System.out.println();

    }
}

