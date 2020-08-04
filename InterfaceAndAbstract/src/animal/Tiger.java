package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "roarrrrrr";
    }

    @Override
    public String howToEat() {
        return "nhằm nhằm";
    }
}
