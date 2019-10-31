package oop_mod2_questions.generics.ques1;

class Name {
    String firstName;
    String lastName;
}

class Student<T extends String, Name> {
    T name;
}

class Main {
    public static void main(String[] args) {
        Student<String, Name> nameStudent = new Student<>();
    }
}