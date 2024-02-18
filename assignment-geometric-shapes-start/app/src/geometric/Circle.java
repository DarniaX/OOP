package geometric;

public class Circle implements Geometric{
    private double[] Centre = new double[2];
    private double Radius;

    public Circle(double[] origin, double radius){
        Centre = origin;
        Radius = radius;
    }
    
        //To make rectangle, get the origin
        //Then add, or subtract the radius to the x or y coords depending on the desired side
    public double get_left_rect(){
        return this.Centre[0]-this.Radius;
    }
    public double get_right_rect(){
        return this.Centre[0]+this.Radius;
    }
    public double get_bottom_rect(){
        return this.Centre[1]-this.Radius;
    }
    public double get_top_rect(){
        return this.Centre[1]+this.Radius;
    }
    public double get_area(){
        //Pi = 3.1415
        //Area = Pi*r*r (Pi*r^2)
        return 3.1415*this.Radius*this.Radius;
    }
    public void move_object(double dx, double dy){
        this.Centre[0] += dx;
        this.Centre[1] += dy;
    }
}
