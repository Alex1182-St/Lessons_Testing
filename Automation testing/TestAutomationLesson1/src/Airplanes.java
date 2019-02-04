public class Airplanes {

    public String typeOfAirplane;
    public String nameOfPlane;
    private int quantity;
    public int passangersCapacity;
    public float cargoWeightCapacity;
    public float cargoVolumeCapacity;
    public float ticketsPrice;
    protected float fuelCapacity;
    public boolean ifRefuel;

    public Airplanes(String nameOfPlane, int quantity, int passangersCapacity, float cargoWeightCapacity, float fuelCapacity, boolean ifRefuel) {
        this.nameOfPlane = nameOfPlane;
        this.quantity = quantity;
        this.passangersCapacity = passangersCapacity;
        this.cargoWeightCapacity = cargoWeightCapacity;
        this.fuelCapacity = fuelCapacity;
        this.ifRefuel = ifRefuel;
    }

    public String getTypeOfAirplane() {
        return typeOfAirplane; }
    public void setTypeOfAirplane(String typeOfAirplane) {
        this.typeOfAirplane = typeOfAirplane;
    }

    public String getNameOfPlane() {
        return nameOfPlane; }
    public void setNameOfPlane(String nameOfPlane) {
        this.nameOfPlane = nameOfPlane;
    }

    public int getQuantity() {
        return quantity; }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPassangersCapacity() {
        return passangersCapacity; }
    public void setPassangersCapacity(int passangersCapacity) {
        this.passangersCapacity = passangersCapacity;
    }

    public float getCargoWeightCapacity() {
        return cargoWeightCapacity; }
    public void setCargoWeightCapacity(float cargoWeightCapacity) {
        this.cargoWeightCapacity = cargoWeightCapacity;
    }

    public float getCargoVolumeCapacity() {
        return cargoVolumeCapacity; }
    public void setCargoVolumeCapacity(float cargoVolumeCapacity) {
        this.cargoVolumeCapacity = cargoVolumeCapacity;
    }

    public float getTicketsPrice() {
        return ticketsPrice; }
    public void setTicketsPrice(float ticketsPrice) {
        this.ticketsPrice = ticketsPrice;
    }

    public float getFuelCapacity() {
        return fuelCapacity; }
    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public boolean isIfRefuel() {
        return ifRefuel; }
    public void setIfRefuel(boolean ifRefuel) {
        this.ifRefuel = ifRefuel;
    }


    public void main(String[] args) {

        Airplanes AN225 = new Airplanes("Antonov-225 Mriya",1,30,500.5f,200.5f,true)

        public void myMethodFuelChecking(){
            if (isIfRefuel() = true) {   // выдает ошибку  - non static method isIfRefuel cannot be referenced from static context
                System.out.println("Airplane is ready to fly");
            } else {
                System.out.println("FUEL IS NOT ENOUGH TO FLY");
            }
        }

        public myMethodStartRefuel(){
            return
        }

        public void myMethodTakeOff(){}


        public void myMethodLanding(){}
    }


}










