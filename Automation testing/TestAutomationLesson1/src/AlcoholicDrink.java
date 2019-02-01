public class AlcoholicDrink { // создаю класс объекта

        // указываю переменные
        public String typeOfDrink;
        public String nameOfProducer;
        public String strengthOfDrink;
        public float bottleVolume;
        private float price;
        public boolean ifCold;


        // создаю конструктор объекта
        public AlcoholicDrink(String typeOfDrink, float bottleVolume, float price, boolean ifCold) {
            this.typeOfDrink = typeOfDrink;
            this.bottleVolume = bottleVolume;
            this.price = price;
            this.ifCold = ifCold;
        }

        //создаю геттер и сеттер ALT+INSERT (IDEA)


    public String getTypeOfDrink() {
        return typeOfDrink; }
    public void setTypeOfDrink(String typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    public String getNameOfProducer() {
        return nameOfProducer; }
    public void setNameOfProducer(String nameOfProducer) {
        this.nameOfProducer = nameOfProducer;
    }

    public String getStrengthOfDrink() {
        return strengthOfDrink; }
    public void setStrengthOfDrink(String strengthOfDrink) {
        this.strengthOfDrink = strengthOfDrink;
    }

    public float getBottleVolume() {
        return bottleVolume; }
    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    public float getPrice() {
        return price; }
    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isIfCold() {
        return ifCold; }
    public void setIfCold(boolean ifCold) {
        this.ifCold = ifCold;
    }

    public static void main(String[] args) {

        // создаю новый объект Дринк1
        AlcoholicDrink Drink1 = new AlcoholicDrink("XXX", 0.500f,500.5f,false);

        // создаю новый объект Дринк2
        AlcoholicDrink Drink2 = new AlcoholicDrink("yyyyy",0.7f,205.7f,true);


            // Methods

            public void setIfCold(boolean ifCold) {
                this.ifCold = ifCold;
            }

            public void showColdDrinks() throws Exception {
                if(AlcoholicDrink.isIfCold().contains(true)) // выдает ошибку  - non static method cannot be referenced from static context
                {
                    System.out.println("Cold drinks are" + AlcoholicDrink.getTypeOfDrink());
                } // выдает ошибку  - non static method cannot be referenced from static context, Но я пишу get
                else
                {System.out.println("Not cold drinks are" + AlcoholicDrink.getTypeOfDrink());}
            // выдает ошибку  - non static method cannot be referenced from static context, Но я пишу get

            System.out.println(AlcoholicDrink.showColdDrinks()); //Cannot resolve method showColdDrinks
            }

        System.out.println(Drink1.getBottleVolume());
        System.out.println(Drink1.getPrice());
        System.out.println(Drink2.isIfCold());


            public void Mymethod1(){}
            public void Mymethod2(){}



    }
}