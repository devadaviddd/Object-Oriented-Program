public class Thermometer {
    private String typeDegree;
    private double Data;

    public Thermometer(String typeDegree, double data) {
        this.typeDegree = typeDegree;
        this.Data = data;
    }

    public String getTypeDegree() {
        return typeDegree;
    }

    public void setTypeDegree(String typeDegree) {
        this.typeDegree = typeDegree;
    }

    public double getData() {
        return Data;
    }

    public void setData(double data) {
        Data = data;
    }
}
