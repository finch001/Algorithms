package Stack.DogAndCat;

/**
 * Created by finch on 2017/6/20.
 */
public class EnterPet {
    private Pet pet;

    private long count;

    public EnterPet(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
