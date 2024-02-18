package geometric;

interface Geometric{
    public double get_left_rect();
    public double get_right_rect();
    public double get_bottom_rect();
    public double get_top_rect();
    public double get_area();
    public void   move_object(double dx, double dy);
}

interface GeometricPredicate{
    public boolean predicate(Geometric shape);
}
