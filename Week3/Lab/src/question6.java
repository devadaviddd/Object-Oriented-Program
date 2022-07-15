import java.util.ArrayList;
import java.util.List;

public class question6 {
    public static void main(String[] args) {
        Air thermo1 = new Air("C", 34);
        Ground thermo2 = new Ground("F", 45);
        List<Thermometer> listOfThermo = new ArrayList<Thermometer>();
        listOfThermo.add(thermo1);
        listOfThermo.add(thermo2);
        Instruments softwareControlled = new Instruments(listOfThermo, new Anemometer(46), new Windwane(78),
                new Barometer(75.4), new Raingauge(2345.32123));
        MappingComputer comp1 = new MappingComputer("David");

        System.out.println("request and received the data form the Instrument: " +   comp1.getData(softwareControlled));

    }
}



