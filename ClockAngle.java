public class ClockAngle
{
    public static double calculatingAngle(double h , double m)
    {
        double hourAngle = (h%12)*30 + (m/60)*30;
        double minuteAngle = m*6;
        double angle = Math.abs(hourAngle - minuteAngle);
        if(angle>180)
        {
            angle = 360 - angle;
        }
        return angle;
    }
    public static void main(String[] args)
    {
        double h1 = 12 , m1 = 30;
        double h2 = 3 , m2 = 30;
        System.out.println(calculatingAngle(h1,m1));
        System.out.println(calculatingAngle(h2,m2));
    }
}