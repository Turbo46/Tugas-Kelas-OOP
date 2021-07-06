public class Circle
{
    private double g, p, s;
    public Circle(double g,double p, double s)
    {
        this.g = g;
        this.p = p;
        this.s = s;
    }
    public double circum()
    {
        return 2*3.14*s;
    }
    public double area()
    {
        return 3.14*s*s;
    }
    public double rad()
    {
        return s;
    }
}
