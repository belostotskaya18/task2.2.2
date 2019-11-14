import java.util.Locale;


public class Vector2D {
    double vX;
    double vY;
    static int count = 0;
    public Vector2D() {
        vX = 1;
        vY = 1;
        count++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D v) {
        this.vX = v.vX;
        this.vY = v.vY;
    }

    public void print() {
        System.out.println("(" + String.format(Locale.US, "%.2f, %.2f", vX, vY) + ")");

    }

    public double length() {
        return Math.sqrt(vX * vX + vY * vY);
    }

    public void add(Vector2D v) {
        this.vX = this.vX + v.vX;
        this.vY = this.vY + v.vY;
    }

    public void sub(Vector2D v) {
        this.vX = this.vX - v.vX;
        this.vY = this.vY - v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX = vX*scaleFactor;
        this.vY = vY*scaleFactor;
    }
    public void normalized() {
        double length = Math.sqrt(vX * vX + vY * vY);
        this.vX = (1/length)*vX;
        this.vY = (1/length)*vY;
    }
    public double dotProduct(Vector2D v) {
        return this.vX*v.vX + this.vY*v.vY;
    }

}
