// this is class a blueprint

class Pen{
  String color;
  String type; // gel ball etc

  public void write(){
    System.out.println(color+" "+type+"pen is writing");
  }
}

public class class_objects{
  public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color = "green";
    pen1.type = "fountain";

    // now to call method of write

    pen1.write();

  }
}