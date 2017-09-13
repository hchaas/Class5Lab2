
package task1;

public class Plant {
    
    private String stem;
    private boolean leaves;
    private String color;

    public Plant(String stem, boolean leaves, String color) {
        setStem(stem);
        setHasLeaves(leaves);
        setColor(color);
    }

    public String getStem() {
        return stem;
    }

    public boolean hasLeaves() {
        return leaves;
    }

    public String getColor() {
        return color;
    }

    public void setStem(String stem) {
        if (stem == null || stem.isEmpty()){
            throw new IllegalArgumentException("Invalid input.");
        }
        else{
            this.stem = stem;
        }
        
    }

    public void setHasLeaves(boolean leaves) {
        leaves = true;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()){
            throw new IllegalArgumentException("Inavliad input.");
        }
        else{
            this.color = color;
        }
        
    }
    
    
}
