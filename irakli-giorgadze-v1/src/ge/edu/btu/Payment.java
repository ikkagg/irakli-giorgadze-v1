package ge.edu.btu;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

public class Payment {
    final static Logger logger= Logger.getLogger(Main.class);
    public static void main(String[] args) {
        Electricity electricity = new Electricity();
        Payment payment = new Payment();
        Water water = new Water();
        pay(electricity.customerNumber("Name123"),electricity.amount(10.5));
        pay(water.customerNumber("Name345"),water.amount(2.3));

    }

    public static void pay(String s,double x){
        logger.info("გადახდილია: "+ s+"-მიერ"+" თანხა: "+x);
    }
}
