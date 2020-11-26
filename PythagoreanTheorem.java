import java.lang.Math;
public PythagoreanTheorem {
    public double calculateHypotenuse(int sideA, int sideB) {
        double sideA = Math.sqrt(sideA);
        double sideB = Math.sqrt(sideB);
        int sideC = sideA + sideB;
        return sideC;
    }
}