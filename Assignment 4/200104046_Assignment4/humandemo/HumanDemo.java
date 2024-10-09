package humandemo;

public class HumanDemo {

    public static void main(String[] args) {

        Human mother = new Human();
        mother.setSkinTone("White");
        mother.setHair("Brown");
        System.out.println("Mother's SkinTone : " + mother.getSkinTone() + "\nMother's Hair : " + mother.getHair());

        Human father = new Human();
        father.setSkinTone("White");
        father.setHair("Black");
        System.out.println("\nFather's SkinTone : " + father.getSkinTone() + "\nFather's Hair : " + father.getHair());

        Human child = new Human();
        child = mother.produceMixedChild(father);
        System.out.println("\nBaby's SkinTone : " + child.getSkinTone() + "\nBaby's Hair : " + child.getHair());
    }
}
