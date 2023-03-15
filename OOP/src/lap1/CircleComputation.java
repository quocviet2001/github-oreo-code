package lap1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String []args) {
        double radius;
        double diameter;
        double circumference;
        double area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);

        // SphereComputation:
        double sphereRadius;
        double surfaceArea;
        double sphereVolume;
        System.out.print("Enter the sphereRadius : ");
        sphereRadius = in.nextDouble();
        surfaceArea = 4 * Math.PI * sphereRadius * sphereRadius;
        sphereVolume = 4/3 * Math.PI * sphereRadius * sphereRadius * sphereRadius;
        System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
        System.out.printf("volume is: %.2f%n", sphereVolume);

        //CylinderComputation:
        double baseRadius;
        double baseArea;
        double surfaceArea1;
        double cylinderVolume;
        System.out.print("Enter the baseRadius: ");
        baseRadius = in.nextDouble();
        baseArea = Math.PI * baseRadius * baseRadius;
        surfaceArea1 = 2.0 * Math.PI * baseRadius + 2.0 * baseArea;
        cylinderVolume = baseArea * baseArea;
        System.out.printf("BaseArea is: %2f%n", baseArea);
        System.out.printf("surfaceArea1 is: %.2f%n", surfaceArea1);
        System.out.printf("Cylinder Volume is: 5.2f%n");
    }
}
