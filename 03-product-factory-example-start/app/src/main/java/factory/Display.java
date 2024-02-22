package factory;
import java.util.*;

public interface Display {
    public int GetVerticalResolution();
    public int GetHorizontalResolution();
    public int GetRefreshRate();
    public int GetBitsPerPixel();
    public String GetBrand();
    public String GetModel();
    public String GetDisplayTechnology();
    public List<String> GetDisplayConnectors();

    default public int GetNumberOfConnectors(String ConnectorType){
        List<String> Connectors = this.GetDisplayConnectors();
        int TotalConnectors = Connectors.size();
        int NumberOfConnectors = 0;
        for (int i=0; i<TotalConnectors; i++){
            if (Connectors.get(i) == ConnectorType) NumberOfConnectors++;
        }
        return NumberOfConnectors;

    }
}
