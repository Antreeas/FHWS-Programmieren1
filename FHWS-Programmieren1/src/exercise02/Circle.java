package exercise02;

public class Circle
{
    public static void main(String[] args)
    {
        double circleRadius = 10;

        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        double circlePerimeter = 2 * Math.PI * circleRadius;
        double sphereVolume = (4.0 / 3) * Math.PI * Math.pow(circleRadius, 3);

        System.out.printf("Radius: %20.2f\n", circleRadius);
        System.out.printf("Circle Area: %15.2f\n", circleArea);
        System.out.printf("Circle Perimter: %11.2f\n", circlePerimeter);
        System.out.printf("Sphere Volumen: %12.2f\n", sphereVolume);
    }
}
