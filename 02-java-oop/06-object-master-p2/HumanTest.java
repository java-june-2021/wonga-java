public class HumanTest{
    public static void main(String[] args) {
        Human adam = new Human("adam");
        Human george = new Human("george");
        george.displayhealth();
        adam.attackHuman(george);
        george.displayhealth();
    }
}