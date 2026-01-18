package unit_8;

public class Main {

    public static void main(String[] args) {

        // Создание точки 2D
        Point point2D = new Point(3, 4);
        System.out.println("Координаты точки 2D: X=" + point2D.getX() + ", Y=" + point2D.getY());

        // Создание точки 3D
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println("Координаты точки 3D: X=" + point3D.getX() +
                ", Y=" + point3D.getY() +
                ", Z=" + point3D.getZ());

        System.out.println("Точка 2D в строковом предствлении: " + point2D.toString());
        System.out.println("Точка 3D в строковом предствлении: " + point3D.toString());
    }
}