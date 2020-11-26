import java.lang.Math;
public class PythagoreanTheorem {
    public double calculateHypotenuse(int sideA, int sideB) {
        double sideC = Math.sqrt((sideA*sideA) + (sideB*sideB));
        return sideC;
    }
}