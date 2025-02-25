public class MultiSphere {
        public static void main(String[] args) {

            // Create several Sphere objects
            Sphere sphere1 = new Sphere(12.0);
            Sphere sphere2 = new Sphere(25.0);
            Sphere sphere3 = new Sphere(10.0);

            // Print details of each sphere using toString
            System.out.println(sphere1);
            System.out.println(sphere2);
            System.out.println(sphere3);

            // Update the diameter of sphere1 and print the new details
            sphere1.setDiameter(10.0);
            System.out.println("\nAfter updating diameter of sphere1: ");
            System.out.println(sphere1);

            // Modify another sphere and display the updated details
            sphere2.setDiameter(25.0);
            System.out.println("\nAfter updating diameter of sphere2:");
            System.out.println(sphere2);
        }
    }
