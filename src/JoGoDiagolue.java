public class JoGoDiagolue extends SuspectDialogue{
    public JoGoDiagolue(String name, int age, String relationship) {
        super(name, age, relationship);
    }

    @Override
    public String talk() {
        return super.talk() + " No thanks.";
    }
}
