public class SnowClearingMachine
{
    String typeOfChassis;
    String nameOfProducer;
    int quantity;
    int enginePower;
    float fuelConsumption;
    boolean ifRefuel;

    public SnowClearingMachine(String typeOfChassis, String nameOfProducer, int quantity, int enginePower, float fuelConsumption, boolean ifRefuel) {
        this.typeOfChassis = typeOfChassis;
        this.nameOfProducer = nameOfProducer;
        this.quantity = quantity;
        this.enginePower = enginePower;
        this.fuelConsumption = fuelConsumption;
        this.ifRefuel = ifRefuel;
    }

    public String getTypeOfChassis() {
        return typeOfChassis;
    }

    public void setTypeOfChassis(String typeOfChassis) {
        this.typeOfChassis = typeOfChassis;
    }

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public void setNameOfProducer(String nameOfProducer) {
        this.nameOfProducer = nameOfProducer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public boolean isIfRefuel() {
        return ifRefuel;
    }

    public void setIfRefuel(boolean ifRefuel) {
        this.ifRefuel = ifRefuel;
    }

    public void startRefuel() {
    }

    public void startSnowCleaning() {
    }

    public void startEngineMaintenance() {
    }

    public static void main(String[] args) {

    }
}
