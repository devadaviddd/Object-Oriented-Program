public class MappingComputer {
    private String author;

    public MappingComputer(String author) {
        this.author = author;
    }

    public double getData(Instruments softwareControl) {
        return softwareControl.dataSummarize();
    }
}
