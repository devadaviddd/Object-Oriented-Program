import java.util.List;

public class Instruments {
    private List<Thermometer> ThermoList;
    private Anemometer anemometer;
    private Windwane windwane;
    private Barometer barometer;
    private Raingauge raingauge;


    public Instruments(List<Thermometer> thermoList, Anemometer anemometer, Windwane windwane, Barometer barometer, Raingauge raingauge) {
        ThermoList = thermoList;
        this.anemometer = anemometer;
        this.windwane = windwane;
        this.barometer = barometer;
        this.raingauge = raingauge;
    }

    public double dataSummarize() {
        double data = 0;
        for(Thermometer thermometer: ThermoList) {
            data += thermometer.getData();
        }
        data += anemometer.getData();
        data += windwane.getData();
        data += barometer.getData();
        data += raingauge.getData();
        return data;
    }
}
