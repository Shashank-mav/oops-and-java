class Pen {
    String color;
    String type;
    String content;

    public void setColor(String color) {
        this.color = color; // Without "this", the parameter "color" shadows the instance variable
    }

    public void setType(String type) {
        type = type; // Without "this", the parameter "type" shadows the instance variable
    }

    public void write() {
        System.out.println(color + " " + type + " pen is writing: " + content);
    }
}


public class this_class_object {
    public static void main(String[] args) {
        Pen myPen = new Pen();

        String color = "blue";
        String type = "gel";

        myPen.setColor(color);
        myPen.setType(type);

        myPen.content = "Hello, world!";
        myPen.write();
    }
}
