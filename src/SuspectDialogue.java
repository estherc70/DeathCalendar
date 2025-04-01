public class SuspectDialogue {

    private String name;
    private int age;
    private String relationship;

    public SuspectDialogue(String name, int age, String relationship) {
        this.name = name;
        this.age = age;
        this.relationship = relationship;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old. My relationship to the decreased was " + relationship;
    }
}
