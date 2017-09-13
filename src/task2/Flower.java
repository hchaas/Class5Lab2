
package task2;

public abstract class Flower extends Plant{
        private String petalSize;
    
    public void setPetalSize(String petalSize){
        if (petalSize == null || petalSize.isEmpty()){
            throw new IllegalArgumentException("Invalid input.");
        }
        else{
            this.petalSize = petalSize;
        }
    
    }
}
