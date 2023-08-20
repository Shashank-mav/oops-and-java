class Pen {
    String color;
    String type;
    String content;

    public void setColor(String color) {
        color = color; // Without "this", the parameter "color" shadows the instance variable
    }

    public void setType(String type) {
        type = type; // Without "this", the parameter "type" shadows the instance variable
    }

    public void write() {
        System.out.println(color + " " + type + " pen is writing: " + content);
    }
}
