public class Main {

    static class Student {
        String name;
        int age;

        Student(String Name , int Age) {
            this.name = Name;
            this.age = Age;
        }

        public String toString() {
            return "Name: " + name + ", Age: " + age;
        } 
    }

    class Box {
        int length;
        int bredth;
        int height;

        Box() {
            this.length = 10;
            this.bredth = 20;
            this.height = 30;
        }
    }

    public static void main(String[] args) {
        Student akshat = new Student("Akshat Singh Thakur",19);

        System.out.println("Hey! This is Akshat.");
        System.out.println(akshat);

    }

}

// class Main {

//     static class Greeting {
//         String message;
//     }

// public static void main(String[] args) {
//     Greeting greeting = new Greeting();
//     greeting.message = "Good Morning this is Akshat.";
//     System.out.println(greeting);
// }

// }