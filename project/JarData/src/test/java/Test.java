import com.denesgarda.JarData.data.statics.Serialization;

public class Test {
    public static void main(String[] args) {
        TestObject before = new TestObject("hello there");
        String middle = Serialization.objectToString(before);
        TestObject after = (TestObject) Serialization.stringToObject(middle);
        System.out.println(after.getString());
    }
}
