public class Main{
    public static void main(String[] args) {
        Dog bulldog = new EnglishBulldog("Tom", 15, "Brown");
        Dog sherpherdDog = new EnglishFoxhound("Tuzik", 25, "Grey");
        Dog shpitz = new Shpitz("Rex", 8, "Ginger");

        bulldog.setName("Button");
        sherpherdDog.setWeight(24);
        shpitz.setColour("Brown");

        bulldog.output();
        sherpherdDog.output();
        shpitz.output();  
    }
}