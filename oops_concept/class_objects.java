// this is class a blueprint

import java.util.Scanner;

class Pen{
  String color;
  String type; // gel ball etc
  String content;
  public void write(){
    System.out.println(color+" "+type+"pen is writing"+ " " + content);
  }
}

public class class_objects{

  static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {

    Pen pen1 = new Pen();
    pen1.color = "green";
    pen1.type = "fountain";
    System.out.println("enter content: ");

    pen1.content = scn.nextLine();

    // now to call method of write

    pen1.write();

  }
}