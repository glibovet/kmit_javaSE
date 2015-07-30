package java1_oka.lection3;

import java.util.Comparator;

import utils.StdDraw;

public class Point implements Comparable<Point> {

	// порівнює точки за нахилом
    public final Comparator<Point> SLOPE_ORDER = new SOrder();

    private final int x;// x координата
    private final int y;// y координата

    // створюємо точку (x, y)
    public Point(int x, int y) {
        /* DO NOT MODIFY */
        this.x = x;
        this.y = y;
    }

    // малюємо точку
    public void draw() {
        /* DO NOT MODIFY */
        StdDraw.point(x, y);
    }

    // малюємо відрізок
    public void drawTo(Point that) {
        /* DO NOT MODIFY */
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // нахил між цією і that точкою
    public double slopeTo(Point that) {
    	/* YOUR CODE HERE */
		return 0;
    }

    // чи ця точка лексикографічно менша за that?
    public int compareTo(Point that) {
    	/* YOUR CODE HERE */
		return 0;
    }
    
    private static class SOrder implements Comparator<Point>{
    	public int compare(Point p, Point q){
    		/* YOUR CODE HERE */
    		return 0;
    	}
    }

    // точка у вигляді String
    public String toString() {
        /* DO NOT MODIFY */
        return "(" + x + ", " + y + ")";
    }
}
