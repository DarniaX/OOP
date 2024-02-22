package factory;

public class Visitor implements ProductVisitor{
    @Override
    public void visit(Chair chair){
        if (chair.GetMaterial().equals("wooden"))
            chair.ChangePrice(0.85);
        if (chair.GetMaterial().equals("metal"))
            chair.ChangePrice(1.12);
    }

    @Override
    public void visit(Fridge fridge){
        if (fridge.GetBrand().equals("Samsung"))
            fridge.ChangePrice(0.95);
    }

    @Override
    public void visit(TV tv){
        if (tv.GetNumberOfConnectors("DP") >= 2)
            tv.ChangePrice(0.70);
    }
}
