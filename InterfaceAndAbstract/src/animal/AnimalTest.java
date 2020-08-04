package animal;
import edible.Edible;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
            if (animal instanceof Tiger){
                Edible edibler = (Tiger) animal;
                System.out.println(edibler.howToEat());

            }
        }
    }
}
