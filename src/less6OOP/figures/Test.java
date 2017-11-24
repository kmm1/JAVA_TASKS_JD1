package less6OOP.figures;


/**
 * Created by Tom on 22.11.2017.
 */
public class Test {
    public static void main(String[] args) {
        Point pointA = new Point(5, 1);
        Point pointB = new Point(1, 1);
        Rectangle rectangle = new Rectangle(new Point(1, 5), new Point(6, 7));

        System.out.println("расстояние между двумя точками" + Point.distance(pointA, pointB));
        System.out.println("площадь прямоугольника " + rectangle.area());
        System.out.println("диаганаль прямоугольника " + rectangle.diagonal());

    }
}
