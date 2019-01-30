public class Airplanes{

    public void main(String[] args) { // на static "ругается", static убрал

        Airplane AN225 = new Airplane("Antonov An-225 Mriya", 2, 1000, true);

        System.out.println(AN225.getNameOfPlane()); //выведет имя "Antonov An-225 Mriya"
        AN225.setNameOfPlane("Antonov225");
        System.out.println(AN225.getNameOfPlane()); //выведет "Antonov225"

        System.out.println(AN225.getQuantity()); // ничего не виведет, будет ошибка, потому, что атрибут "приват"

        System.out.println(AN225.getFuelCapacity()); // выведет "1000"

        System.out.println(AN225.getIsRefuel()); // выведет "FUEL IS NOT ENOUGH TO FLY"
    }

    public class Airplane {

        String typeOfAirplane; // по умолчанию "паблик"
        String nameOfPlane; // по умолчанию "паблик"
        private int quantity;
        int passangersCapacity; // по умолчанию "паблик"
        float cargoWeightCapacity; // по умолчанию "паблик"
        float cargoVolumeCapacity; // по умолчанию "паблик"
        public float ticketsPrice;
        protected float fuelCapacity;
        boolean isRefuel; // по умолчанию "паблик"

        public Airplane(String nameOfPlane, int quantity, float fuelCapacity, boolean isRefuel) { // указываем что вносим в базу???????
            this.nameOfPlane = nameOfPlane;
            this.quantity = quantity;
            this.fuelCapacity = fuelCapacity;
            this.isRefuel = isRefuel;
        }

        public String getNameOfPlane() { // возвращаем имя самолета
            return this.nameOfPlane;
        }

        public void setNameOfPlane(String nameOfPlane) { // присваиваем атрибуту имя нового самолета
            this.nameOfPlane = nameOfPlane;
        }

        public int getQuantity() { // возвращаем количество самолетов
            return this.quantity;
        }

        public void setQuantity(int quantity) { // устанавливаем новое количество самолетов
            this.quantity = quantity;
        }

        public float getFuelCapacity() { //возвращаем количество топлива
            return this.fuelCapacity;
        }

        public void setFuelCapacity(float fuelCapacity){ // устанавливаем новое значение топлива
            this.fuelCapacity = fuelCapacity;
        }

        public boolean getIsRefuel(){ // возвращаем "Заправлен ли самолет"
            return this.isRefuel;
        }

        public void setIsrefuel(boolean isRefuel) { //уст. атрибуту класса значение атрибута метода + проверка
            if (fuelCapacity >= 2000) {
                this.isRefuel = isRefuel;
            } else {
                System.out.println("FUEL IS NOT ENOUGH TO FLY");
            }
        }
    }
}









