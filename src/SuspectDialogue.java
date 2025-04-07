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
        return "My name is " + name + ". I am " + age + " years old. My relationship to the deceased was " + relationship + ".";
    }

    public String talk() {
        int num = (int) (Math.random() * 3) + 1;
        if (num == 1) {
            return "It's not me I swear!!!";
        } else if (num == 2) {
            return "It got nothing to do with me!!!";
        } else {
            return "I'm innocent. Get me out of here!!!";
        }
    }


}
