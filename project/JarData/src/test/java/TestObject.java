public class TestObject {
    private String string;

    public TestObject(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }
    public TestObject setString(String string) {
        this.string = string;
        return this;
    }
}
