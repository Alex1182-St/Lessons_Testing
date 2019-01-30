public class Airplanes{

    public void main(String[] args) { // на static "ругается", static убрал


        Airplane newAirplane = newAirplane();

        Airplane AN225 = new Airplane("Antonov An-225 Mriya", 2, 1000, true);

        System.out.println(AN225.getNameOfPlane()); //выведет имя "Antonov An-225 Mriya"
        AN225.setNameOfPlane("Antonov225");
        System.out.println(AN225.getNameOfPlane()); //выведет "Antonov225"

        System.out.println(AN225.getQuantity()); // ничего не виведет, будет ошибка, потому, что атрибут "приват"

        System.out.println(AN225.getFuelCapacity()); // выведет "1000"

        System.out.println(AN225.getIfRefuel()); // выведет "FUEL IS NOT ENOUGH TO FLY"
    }

    public class Airplane {

        public String typeOfAirplane;
        public String nameOfPlane;
        private int quantity;
        public int passangersCapacity;
        public float cargoWeightCapacity;
        public float cargoVolumeCapacity;
        public float ticketsPrice;
        protected float fuelCapacity;
        public boolean ifRefuel;

        public Airplane(String nameOfPlane, int quantity, float fuelCapacity, boolean ifRefuel) { // указываем что вносим в базу
            this.nameOfPlane = nameOfPlane;
            this.quantity = quantity;
            this.fuelCapacity = fuelCapacity;
            this.ifRefuel = ifRefuel;
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

        public boolean getIfRefuel(){ // возвращаем "Заправлен ли самолет"
            return this.ifRefuel;
        }

        public void setIfRefuel(boolean ifRefuel) { //уст. атрибуту класса значение атрибута метода + проверка
            if (getFuelCapacity() >= 2000) {
                this.ifRefuel = ifRefuel;
            } else {
                System.out.println("FUEL IS NOT ENOUGH TO FLY");
            }
        }
    }
}









