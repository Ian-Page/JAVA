public class Gorilla extends Mammal {

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public void throwSomething() {
        System.out.println("the gorrilla threw a banana at your head");
        this.energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("the gorrilla just ate a banana");
        this.energyLevel += 10;

    }

    public void climb() {
        System.out.println("Gorrila in a treeeeeee swing the branches");
    }

}
