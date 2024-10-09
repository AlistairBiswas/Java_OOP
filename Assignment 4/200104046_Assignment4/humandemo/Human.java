package humandemo;

public class Human {

    private String skinTone;
    private String hair;

    Human() {

    }

    public String getSkinTone() {
        return skinTone;
    }

    public void setSkinTone(String skinTone) {
        this.skinTone = skinTone;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Human produceMixedChild(Human secondHuman) {
        Human baby = new Human();
        baby.setSkinTone(this.skinTone + " " + secondHuman.getSkinTone());
        baby.setHair(this.hair + " " + secondHuman.getHair());
        return baby;
    }
}
