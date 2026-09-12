package lecture3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public record Coordinates(int x, int y){
    public Coordinates {
        if(x < 0 || y < 0){
            throw new IllegalArgumentException("Coordinate cannot be negative");
        }
    }
    public double distanceFromOrigin(){
        return (Math.sqrt(x*x + y*y)); // hipotenuse
    }
}
