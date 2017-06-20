package Stack.DogAndCat;

/**
 * Created by finch on 2017/6/20.
 */
public class Pet {
    private String type;

    public Pet(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public final class Cat extends Pet {
        public Cat() {
            super("Cat");
        }
    }


    public final class Dog extends Pet {
        public Dog() {
            super("Dog");
        }
    }
}
