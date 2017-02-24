
package week4.chapter11;

/**
 *
 * @author 55allenjn05
 */
public abstract class Pet {

    private String petName;

    public abstract String speak();

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "C11Pet{" + "petName=" + petName + '}';
    }

}
