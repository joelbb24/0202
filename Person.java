public class Person {

    private String name;
    private int age;
    private final String DEFAULT_LANG = "english";
    private final static String DEFAULT_NAME = "John Doe";


    public Person() {
        this(DEFAULT_NAME);
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }


    public void speak() {
        speak(DEFAULT_LANG);
    }

    public void speak(String language) {
        System.out.println("Speaking "+ language);
    }

}
