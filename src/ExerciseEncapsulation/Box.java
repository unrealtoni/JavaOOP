package ExerciseEncapsulation;
//comment for test
public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length>=1) {
            this.length = length;
        }else {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    private void setWidth(double width) {
        if (width >=1) {
            this.width = width;
        }else {
            throw new IllegalArgumentException("Width cannot be zero or negative");
        }
    }

    public void setHeight(double height) {
        if (height>=1) {
            this.height = height;
        }else {
            throw new IllegalArgumentException("Height cannot be zero or negative");
        }
    }

    public double getSurfeaceArea(){
        return 2* this.length* this.width + 2* this.length* this.height + 2* this.width* this.height;
    }
    public double getLateralSA(){
        return 2* this.length* this.height + 2* this.width* this.height;
    }
    public double getVolume(){
        return this.length* this.width* this.height;
    }

    @Override
    public String toString() {
        return String.format("Surface area - %.2f%n" +
                "Lateral Surface Area - %.2f%n" +
                "Volume - %.2f%n",getSurfeaceArea(),getLateralSA(),getVolume());
    }
}
