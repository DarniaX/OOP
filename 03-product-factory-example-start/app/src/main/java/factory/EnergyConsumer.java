package factory;

public interface EnergyConsumer {
    public double GetVoltage();
    public double GetCurrent();
    default public double GetPowerConsumption(double Volt, double Amps){
        return Volt*Amps*24*365*0.001;
    }
}
