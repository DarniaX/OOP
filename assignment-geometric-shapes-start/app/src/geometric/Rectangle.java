package geometric;

public class Rectangle implements Geometric {
    private double[] Corner = new double[2];
    private double   Width;
    private double   Height;

    public Rectangle(double[] corner, double width, double heigth){
        Corner = corner;
        Width = width;
        Height = heigth;
    } 
    public double get_left_rect(){
        return this.Corner[0];
    }
    public double get_right_rect(){
        return this.Corner[0]+this.Width;
    }
    public double get_bottom_rect(){
        return this.Corner[1];
    }
    public double get_top_rect(){
        return this.Corner[1]+this.Height;
    }
    public double get_area(){
        //Pi = 3.1415
        //Area = Pi*r*r (Pi*r^2)
        return this.Height*this.Width;
    }
    public void move_object(int dx, int dy){
        this.Corner[0] += dx;
        this.Corner[1] += dy;
    }
}



