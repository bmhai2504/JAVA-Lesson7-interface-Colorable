public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(100, 10);
        shapes[1] = new Circle(10);

        System.out.println("Before Colorable: ");
        for (Shape element : shapes){
            System.out.println(element);
        }

        System.out.println("After Colorable: ");
        shapes[0].howToColor("red");
        shapes[1].howToColor("blue");
        for (Shape element : shapes){
            System.out.println(element);
        }
    }
}