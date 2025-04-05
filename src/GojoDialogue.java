public class GojoDialogue extends SuspectDialogue{
    public GojoDialogue(String name, int age, String relationship) {
        super(name, age, relationship);
    }

    @Override
    public String talk() {
        int num = (int) (Math.random() * 3) + 1;
        if (num == 1) {
            return super.talk() + " Don't worry I am the Strongest.";
        } else if (num == 2) {
            return super.talk() + " Nah, I'd win.";
        } else {
            return super.talk() + " Love is the most twisted curse of all.";
        }
    }

    public String specialTalkKnife() {
        return "I don't know this knife. I would never kill my wife.";
    }

    public String specialTalkDiary() {
        return "Oh I know that! It's her diary isn't it? I've seen her writing in it multiple times.";
    }

    public String specialTalkHair() {
        return "Don't you see my hair is white? Please let me out of here so I can mourn for my dead wife.";
    }
}
