import java.lang.Math;
public class PythagoreanTheorem {
    public double calculateHypotenuse(int sideA, int sideB) {
        double a = Math.sqrt(sideA);
        double b = Math.sqrt(sideB);
        double sideC = a + b;
        return sideC;
    }
}