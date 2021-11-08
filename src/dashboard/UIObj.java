import java.awt.Graphics;

public interface UIObj {


    public void setValue(double d);

    public double getValue();

    public void setMax(double d);

    public double getMax();

    public void setMin(double d);

    public double getMin();

    public void draw(Graphics g);
}