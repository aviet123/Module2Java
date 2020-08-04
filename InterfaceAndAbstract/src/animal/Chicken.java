package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "quác quác éc ec";
    }


    @Override
    public String howToEat() {
        return "mlem mlem";
    }
}
