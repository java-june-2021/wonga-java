public class Samurai extends Human{
    private static int samurai_count = 0;
    public static int howMany() {
        system.out.println(Samurai.samurai_count);
        return Samurai.samurai_count;
    }
    public Samurai() {
        this.health = 200
        Samurai.samurai_count += 1;
    }
    public void deathBlow(Human target){
        target.health = 0;
        this.health -= this.health/2;
    }
    public void meditate(){
        this.health += this.health/2;
    }
}

//    public Human(String name, Integer strength, Integer stealth, Integer intelligence, Integer health){
