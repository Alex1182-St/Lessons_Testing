public class Wardrobes
{
    int quantity;
    float height;
    float width;
    float depth;
    String typeOfMaterial;
    String typeOfDoors;

    public Wardrobes(int quantity, float height, float width, float depth, String typeOfMaterial, String typeOfDoors) {
        this.quantity = quantity;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.typeOfMaterial = typeOfMaterial;
        this.typeOfDoors = typeOfDoors;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    public float getDepth() {
        return depth;
    }
    public void setDepth(float depth) {
        this.depth = depth;
    }

    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }
    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public String getTypeOfDoors() {
        return typeOfDoors;
    }
    public void setTypeOfDoors(String typeOfDoors) {
        this.typeOfDoors = typeOfDoors;
    }



    public static void main(String[] args) {


        Wardrobes SteelOak = new Wardrobes(1,2.55f,2.05f,1.1f,"Oak","Manual");

        public void calculateVolume() {

            float Volume = SteelOak.height*SteelOak.width*SteelOak.depth;

            System.out.println(Volume);

        }

        public void myMethodOpenTheDoor() {
        }

        public void myMethodPutClothesOnShelf() {

        }

        public void myMethodHideHimselfInTheWardrobe() {

        }



    }
}
