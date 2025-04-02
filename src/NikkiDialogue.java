public class NikkiDialogue extends SuspectDialogue{
    public NikkiDialogue(String name, int age, String relationship) {
        super(name, age, relationship);
    }

    @Override
    public String talk() {
        return super.talk() + " I only want to do CS!!!";
    }
}
