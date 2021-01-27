package ge.edu.btu;

public class Water extends Payment {
    private double x;
    private String s;
    public String customerNumber(String x){
        return x;
    }

    public double amount(double x){
        return x;
    }

    public Water() {
        this.x = x;
        this.s = s;
    }


    @Override
    public String toString() {
        return "Water{" +
                "x=" + x +
                ", s='" + s + '\'' +
                '}';
    }
}
