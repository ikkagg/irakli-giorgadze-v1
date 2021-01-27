package ge.edu.btu;

public class Electricity extends Payment {
    public String customerNumber(String x){
        return x;
    }

    public double amount(double x){
        return x;
    }

    @Override
    public String toString() {
        return "Electricity ";
    }
}
