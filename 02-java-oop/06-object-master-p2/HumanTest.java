public class HumanTest{
    public static void main(String[] args) {
        Human adam = new Human();
        Human george = new Human();
        george.displayhealth();
        adam.attackHuman(george);
        george.displayhealth();
        Ninja gordon = new Ninja();
        gordon.runAway();
        gordon.displayhealth();

    }
}