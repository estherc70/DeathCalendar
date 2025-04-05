public class GogoDialogue extends SuspectDialogue{
    public GogoDialogue(String name, int age, String relationship) {
        super(name, age, relationship);
    }

    @Override
    public String talk() {
        return super.talk() + " It's Not About Whether I Can.";
    }

    public String specialTalkKnife() {
        return "I don't know what your trying to do. It's got nothing to do with me.";
    }

    public String specialTalkDiary() {
        return "I saw her sometimes writing in it, but I don't know what's inside.";
    }

    public String specialTalkHair() {
        return "Did you think it's my hair? Even tho it's black its got nothing to do with me.";
    }
}
