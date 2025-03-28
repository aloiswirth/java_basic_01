public class Triangle {
    private double base;
    private double height;
    private double side_a;
    private double side_b;
    private double side_c;

    public Triangle(double base, double height, double side_a, double side_b, double side_c) {
        this.base = base;
        this.height = height;
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public double findArea() {
        return 0.5 * this.base * this.height;
    }

    public double findPerimeter() {
        return this.side_a + this.side_b + this.side_c;
    }

    
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4 , 5, 6, 7);
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
        System.out.println("Triangle created with base: " + triangle.base + " height: " + triangle.height +"." ); // 6
        System.out.println("Triangle created with area: " + triangleA.findArea() +"." ); // 
        System.out.println("Triangle created with area: " + triangleB.findArea() +"." ); //
        System.out.println("Triangle created with perimeter: " + triangle.findPerimeter() +"." ); // 18
    }   
    
}
