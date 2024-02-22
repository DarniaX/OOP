package factory;

public interface ProductVisitor {
    public void visit(Chair chair);
    public void visit(Fridge fridge);
    public void visit(TV tv);
}


