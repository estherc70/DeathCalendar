public class Inventory {
    private boolean knife;
    private boolean diary;
    private boolean hair;

    public Inventory() {
        knife = false;
        diary = false;
        hair = false;
    }

    public void setKnife(boolean input) {
        knife = input;
    }

    public void setDiary(boolean input) {
        diary = input;
    }

    public void setHair(boolean input) {
        hair = input;
    }

    public boolean getKnife() {
        return knife;
    }

    public boolean getDiary() {
        return diary;
    }

    public boolean hair() {
        return hair;
    }
}
