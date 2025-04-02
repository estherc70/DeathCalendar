public class GogoDialogue extends SuspectDialogue{
    public GogoDialogue(String name, int age, String relationship) {
        super(name, age, relationship);
    }

    @Override
    public String talk() {
        return super.talk() + " It's Not About Whether I Can.";
    }
}
