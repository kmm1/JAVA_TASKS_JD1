package les6OOP.figures;

/**
 * Created by Tom on 22.11.2017.
 */
public class Rectangle implements Figure {
    private Point leftUp;
    private Point rightDown;

    public Rectangle(Point leftUp, Point rightDown) {
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }

    @Override
    public double perimetr() {
        double dx = rightDown.getX() - leftUp.getX();
        double dy = rightDown.getY() - leftUp.getY();
        double perimetr = Math.pow(dx, 2) + Math.pow(dy, 2);
        return perimetr;
    }

    @Override
    public double area() {
        double dx = rightDown.getX() - leftUp.getX();
        double dy = rightDown.getY() - leftUp.getY();
        double area = dx * dy;
        return area;
    }

    @Override
    public double diagonal() {
        double diagonal = Math.sqrt(Math.pow(leftUp.getX() - rightDown.getX(), 2) + Math.pow(leftUp.getY() - rightDown.getY(), 2));
        return diagonal;
    }


}
