import java.util.Scanner;


class Pen {
    String color;
    String type;
    String content;
    public void write(){
      System.out.println(color + " "+ type+" "+content);
    }
  }

public class class_objects_user_defined {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Pen userPen = new Pen();

    System.out.println("enter color: ");
    userPen.color = scn.nextLine();

    System.out.println("enter type: ");
    userPen.type = scn.nextLine();

    System.out.println("enter content: ");
    userPen.content = scn.nextLine();

    userPen.write();

    // NOW SOMETHING NEW, THIS KEYWORD, SEE IN THE NEXT FILE
  }
}
