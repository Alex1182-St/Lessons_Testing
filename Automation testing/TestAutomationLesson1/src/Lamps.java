public class Lamps
{
    String nameOfProducer;
    String typeOfLamp;
    int quantity;
    int lightTemperature;
    int lightbuldPower;
    String lightbulbType;

    public Lamps(String typeOfLamp, int quantity, int lightTemperature, int lightbuldPower, String lightbulbType) {
        this.typeOfLamp = typeOfLamp;
        this.quantity = quantity;
        this.lightTemperature = lightTemperature;
        this.lightbuldPower = lightbuldPower;
        this.lightbulbType = lightbulbType;
    }

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public void setNameOfProducer(String nameOfProducer) {
        this.nameOfProducer = nameOfProducer;
    }

    public String getTypeOfLamp() {
        return typeOfLamp;
    }

    public void setTypeOfLamp(String typeOfLamp) {
        this.typeOfLamp = typeOfLamp;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLightTemperature() {
        return lightTemperature;
    }

    public void setLightTemperature(int lightTemperature) {
        this.lightTemperature = lightTemperature;
    }

    public int getLightbuldPower() {
        return lightbuldPower;
    }

    public void setLightbuldPower(int lightbuldPower) {
        this.lightbuldPower = lightbuldPower;
    }

    public String getLightbulbType() {
        return lightbulbType;
    }

    public void setLightbulbType(String lightbulbType) {
        this.lightbulbType = lightbulbType;
    }

    public void turnLightOn() {
    }

    public void turnLightOff() {
    }

    public void replaceLightbulb() {
    }

    public void changeLightbulbType() {

    }

    public static void main(String[] args) {

    }
}