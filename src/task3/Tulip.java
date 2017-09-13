package task3;

public class Tulip implements Flower {

    private String stem;
    private boolean leaves;
    private String color;

    @Override
    public void growPlant() {
        System.out.println("Tuplip grew 4 inches.");
    }

    @Override
    public String getStem() {
        return stem;
    }

    @Override
    public boolean hasLeaves() {
        return leaves;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setStem(String stem) {
        if (stem == null || stem.isEmpty()) {
            throw new IllegalArgumentException("Invalid input.");
        } else {
            this.stem = stem;
        }
    }

    @Override
    public void setHasLeaves(boolean leaves) {
        leaves = true;
    }

    @Override
    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Inavliad input.");
        } else {
            this.color = color;
        }
    }

}
