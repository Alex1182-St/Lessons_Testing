public class UnmannedAerialVehicle
{
    String typeOfUAV;
    String nameOfUAV;
    String typeOfEngine;
    String maxTimeOfFlying;
    float maxCargoWeight;
    int quantity;
    int maxHeightOfFlying;
    int maxFlyingSpeed;
    boolean IsCamera;

    public UnmannedAerialVehicle(String nameOfUAV, String typeOfEngine, float maxCargoWeight, int maxHeightOfFlying, int maxFlyingSpeed, boolean isCamera) {
        this.nameOfUAV = nameOfUAV;
        this.typeOfEngine = typeOfEngine;
        this.maxCargoWeight = maxCargoWeight;
        this.maxHeightOfFlying = maxHeightOfFlying;
        this.maxFlyingSpeed = maxFlyingSpeed;
        IsCamera = isCamera;
    }

    public String getTypeOfUAV() {
        return typeOfUAV;
    }
    public void setTypeOfUAV(String typeOfUAV) {
        this.typeOfUAV = typeOfUAV;
    }

    public String getNameOfUAV() {
        return nameOfUAV;
    }
    public void setNameOfUAV(String nameOfUAV) {
        this.nameOfUAV = nameOfUAV;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }
    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getMaxTimeOfFlying() {
        return maxTimeOfFlying;
    }
    public void setMaxTimeOfFlying(String maxTimeOfFlying) {
        this.maxTimeOfFlying = maxTimeOfFlying;
    }

    public float getMaxCargoWeight() {
        return maxCargoWeight;
    }
    public void setMaxCargoWeight(float maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMaxHeightOfFlying() {
        return maxHeightOfFlying;
    }

    public void setMaxHeightOfFlying(int maxHeightOfFlying) {
        this.maxHeightOfFlying = maxHeightOfFlying;
    }

    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }
    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    public boolean isCamera() {
        return IsCamera;
    }
    public void setCamera(boolean camera) {
        IsCamera = camera;
    }



    public static void main(String[] args) {

        public void myMethodUAVTakeoff() {
        }

        public void myMethodIncreaseFlyingSpeed() {
        }

        public void myMethodExecuteAutomaticReturning() {
        }

        public void myMethodVideoRecording() {
        }

        public void myMethodUAVLanding() {
        }

    }
}
