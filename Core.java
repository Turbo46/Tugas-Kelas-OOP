public class Core
{
    public static void main(String [] args)
    {
        Circle circle99 = new Circle(10,20,5);
        System.out.println("Rad=" + circle99.rad() + "Area=" + circle99.area());
        System.out.println("Rad=" + circle99.rad() + "Circumfer=" + circle99.circum());
    }
}
