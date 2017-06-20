package Stack.DogAndCat;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by finch on 2017/6/20.
 */
public class DogCatQueue {
    private Queue<EnterPet> dogQ;
    private Queue<EnterPet> catQ;
    // 作为时间戳来计时
    private long count;

    public DogCatQueue() {
        dogQ = new LinkedList<EnterPet>();
        catQ = new LinkedList<EnterPet>();
        count = 0;
    }

    public void add(Pet pet) {
        if (pet.getType().equals("cat")) {
            catQ.add(new EnterPet(new Pet("cat"), count++));
        } else if (pet.getType().equals("dog")) {
            dogQ.add(new EnterPet(new Pet("dog"), count++));
        } else {
            throw new RuntimeException("Empty");
        }
    }

    public Pet pollAll() {
        if (!dogQ.isEmpty() && !catQ.isEmpty()) {
            if (dogQ.peek().getCount() < catQ.peek().getCount()) {
                return dogQ.remove().getPet();
            } else {
                return catQ.remove().getPet();
            }
        } else if (!dogQ.isEmpty()) {
            return dogQ.remove().getPet();
        } else if (!catQ.isEmpty()) {
            return catQ.remove().getPet();
        } else {
            throw new RuntimeException("empty Queue");
        }
    }

    public Pet.Dog getDog() {
        if (!isDogEmpty()) {
            return (Pet.Dog) dogQ.poll().getPet();
        } else {
            throw new RuntimeException("empty dog queue");
        }

    }

    public Pet.Cat getCat() {
        if (!isCatEmpty()) {
            return (Pet.Cat) catQ.poll().getPet();
        } else {
            throw new RuntimeException("empty cat queue");
        }

    }

    public boolean isEmpty() {
        return dogQ.isEmpty() && catQ.isEmpty();
    }

    public boolean isDogEmpty() {
        return dogQ.isEmpty();
    }

    public boolean isCatEmpty() {
        return catQ.isEmpty();
    }

}
