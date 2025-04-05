public class Inventory {
    private boolean knife;
    private boolean diary;
    private boolean hair;
    private boolean isHoldingKnife;
    private boolean isHoldingDiary;
    private boolean isHoldingHair;
    public Inventory() {
        knife = false;
        diary = false;
        hair = false;
        isHoldingKnife = false;
        isHoldingDiary = false;
        isHoldingHair = false;
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

    public void setHoldingKnife(boolean input) {
        isHoldingKnife = input;
    }

    public void setHoldingDiary(boolean input) {
        isHoldingDiary = input;
    }

    public void setHoldingHair(boolean input) {
        isHoldingHair = input;
    }

    public boolean getHoldingKnife() {
        return isHoldingKnife;
    }

    public boolean getHoldingDiary() {
        return isHoldingDiary;
    }

    public boolean getHoldingHair() {
        return isHoldingHair;
    }

    public boolean getKnife() {
        return knife;
    }

    public boolean getDiary() {
        return diary;
    }

    public boolean getHair() {
        return hair;
    }
}
