public class Bat extends Mammal {

    public Bat() {
        super(300);
    }

    public void fly() {
        System.out.println("FLAPPY FLAPPY THE BAT IS FLYING!");
        this.energyLevel -= 50;
    }

    public void eatHumans() {
        this.energyLevel += 25;
    }

    public void attackTown() {
        System.out.println(
                "BURN BABY BURN THE TOWNS A INFERNO, THE ROOF IS ON FIRE THE ROOF THE ROOF IS ON FIRE , THIS TOWN IS LIT!!!!");
        this.energyLevel -= 100;
    }
}
