public class JoGoDiagolue extends SuspectDialogue{
    public JoGoDiagolue(String name, int age, String relationship) {
        super(name, age, relationship);
    }

    @Override
    public String talk() {
        return super.talk() + " No thanks.";
    }

    public String specialTalkKnife() {
        return "What is this!!! Get this away from me!!!";
    }

    public String specialTalkDiary() {
        return "I don't know what this is. Please let me go!!!";
    }

    public String specialTalkHair() {
        return "What's your problem??? I ain't even got hair hello??!!";
    }
}
