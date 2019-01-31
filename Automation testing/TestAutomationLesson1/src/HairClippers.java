public class HairClippers
{
    String markOfHairClipper;
    int quantity;
    int electricityConsumption;
    int wireLength;
    boolean hasReplacebleCutters;

    public HairClippers(String markOfHairClipper, int quantity, int electricityConsumption, int wireLength, boolean hasReplacebleCutters) {
        this.markOfHairClipper = markOfHairClipper;
        this.quantity = quantity;
        this.electricityConsumption = electricityConsumption;
        this.wireLength = wireLength;
        this.hasReplacebleCutters = hasReplacebleCutters;
    }

    public String getMarkOfHairClipper() {
        return markOfHairClipper;
    }

    public void setMarkOfHairClipper(String markOfHairClipper) {
        this.markOfHairClipper = markOfHairClipper;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getElectricityConsumption() {
        return electricityConsumption;
    }

    public void setElectricityConsumption(int electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }

    public int getWireLength() {
        return wireLength;
    }

    public void setWireLength(int wireLength) {
        this.wireLength = wireLength;
    }

    public boolean isHasReplacebleCutters() {
        return hasReplacebleCutters;
    }

    public void setHasReplacebleCutters(boolean hasReplacebleCutters) {
        this.hasReplacebleCutters = hasReplacebleCutters;
    }

    void startHairCutting() {
    }

    void startCuttersCleaning() {
    }

    void changeCutterType() {
    }

    public static void main(String[] args) {

    }
}
