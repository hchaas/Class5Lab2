
package task2;

public abstract class Tulip extends Flower{
    private SimpleReportService output;
    
    public Tulip(){
        output = new SimpleReportService();
    }
    
    @Override
    public void growPlant(){
        String msg = "Tulip grew 4 inches.";
        this.output.simpleOutput(msg);
    }
}
