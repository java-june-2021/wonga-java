public class Wizard extends Human{
    public Wizard () {
        this.intelligence = 8;
        this.health = 50;
    }
    public Integer heal(Human target){
        target.health += this.intelligence;
        return target.health;
    }
    public Integer fireball(Human target){
        target.health -= this.intelligence*3;
        return target.health;
    }
}

//    public Human(String name, Integer strength, Integer stealth, Integer intelligence, Integer health){
