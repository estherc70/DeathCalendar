public class NikkiDialogue extends SuspectDialogue{
    public NikkiDialogue(String name, int age, String relationship) {
        super(name, age, relationship);
    }

    @Override
    public String talk() {
        return super.talk() + " I only want to do CS!!!";
    }

    public String specialTalkKnife() {
        return "I've never seen that knife in my whole life!!! We are just co-workers, why would I kill her??!!";
    }

    public String specialTalkDiary() {
        return "That's surprising, I didn't know she owned one? ";
    }

    public String specialTalkHair() {
        return "My hair is way longer than that. We are enemies in work but I would never harm her in any way.";
    }
}
