
package task2;

public abstract class Plant {
    private String stemWidth;
    private boolean hasLeaves;
    private String plantColor;
    
    public abstract void growPlant();
    
    public String getStemWidth() {
        return stemWidth;
    }

    public boolean hasLeaves() {
        return hasLeaves;
    }

    public String getPlantColor() {
        return plantColor;
    }

    public void setStemWidth(String stem) {
        if (stem == null || stem.isEmpty()){
            throw new IllegalArgumentException("Invalid input.");
        }
        else{
            this.stemWidth = stem;
        }
        
    }

    public void setHasLeaves(boolean leaves) {
        leaves = true;
    }

    public void setPlantColor(String color) {
        if (color == null || color.isEmpty()){
            throw new IllegalArgumentException("Inavliad input.");
        }
        else{
            this.plantColor = color;
        }
        
    }
    
    
}

