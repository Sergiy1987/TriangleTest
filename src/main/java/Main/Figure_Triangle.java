package Main;

/**
 * Created by slobse01 on 07.02.2018.
 */
public class Figure_Triangle {
    public static final int Scalene = 1;
    public static final int Isosceles = 2;
    public static final int Equilateral = 3;
    public static final int error = 4;

    public static int IdentifyTriangle(int Aside, int Bside, int Cside) {
        int result = error;
        if (Aside <= 0 || Bside <= 0 || Cside <= 0) {
            // not a triangle
            result = error;
            System.out.println("It is not a triangle");

        } else if (Aside == Bside && Bside == Cside) {
            // equilateral
            result = Equilateral;
            System.out.println("It is a Equilateral triangle");
        } else if (Aside == Bside || Aside == Cside || Bside == Cside) {
            // isosceles
            result = Isosceles;
            System.out.println("It is a Isosceles triangle");
        } else {
            // scalene
            if (Aside + Bside > Cside &&
                    Aside + Cside > Bside &&
                    Bside + Cside > Aside) {
                result = Scalene;
                System.out.println("It is a Scalene triangle");
            } else {
                // in other cases it's not a triangle
                result = error;
                System.out.println("In this case it's not a triangle too");
            }
        }

        return result;
    }

}
