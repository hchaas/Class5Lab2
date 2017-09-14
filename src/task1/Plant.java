
package task1;

public class Plant {
    
    private String stemSize;
    private boolean hasLeaves;
    private String stemColor;
    
    public void growPlant(){
        System.out.println("Grew 1 inch.");
    }
    
    public String getStemSize() {
        return stemSize;
    }

    public boolean hasLeaves() {
        return hasLeaves;
    }

    public String getStemColor() {
        return stemColor;
    }

    public void setStemSize(String stem) {
        if (stem == null || stem.isEmpty()){
            throw new IllegalArgumentException("Invalid input.");
        }
        else{
            this.stemSize = stem;
        }
        
    }

    public void setHasLeaves(boolean leaves) {
        this.hasLeaves = hasLeaves;
    }

    public void setStemColor(String color) {
        if (color == null || color.isEmpty()){
            throw new IllegalArgumentException("Inavliad input.");
        }
        else{
            this.stemColor = color;
        }
        
    }
    
    
}
