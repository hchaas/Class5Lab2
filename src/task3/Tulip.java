package task3;

public class Tulip implements Flower {

    private String stemSize;
    private boolean hasLeaves;
    private String stemColor;

    @Override
    public void growPlant() {
        System.out.println("Tuplip grew 4 inches.");
    }

    @Override
    public String getStemSize() {
        return stemSize;
    }

    @Override
    public boolean getHasLeaves() {
        return hasLeaves;
    }

    @Override
    public String getStemColor() {
        return stemColor;
    }

    @Override
    public void setStemSize(String stem) {
        if (stem == null || stem.isEmpty()) {
            throw new IllegalArgumentException("Invalid input.");
        } else {
            this.stemSize = stem;
        }
    }

    @Override
    public void setHasLeaves(boolean leaves) {
        leaves = true;
    }

    @Override
    public void setStemColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Inavliad input.");
        } else {
            this.stemColor = color;
        }
    }

}
