class Person {
    String name;
    Person(String name) { // constructor
        this.name = name;
    }
    public static void main(String[] args) {
        Person p = new Person("Sonu");
        System.out.println(p.name); // Sonu
    }
}
