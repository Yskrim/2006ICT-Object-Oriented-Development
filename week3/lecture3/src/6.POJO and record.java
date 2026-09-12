/******************  // EXAMPLE 1 == NO Overriden equals **** (POJO = Plain Old Java Object)  ********************/

    public class Person {
        String name;
        int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        /// no predefined equals(), meaning two new objects with the same data inside will still return .equals() => false
    }

    public class Main{
        public static void main(String[] args){
            Person p1 = new Person("Alice", 30);
            Person p2 = new Person("Alice", 30);  /// ДРУГОЙ объект, но с ТЕМИ ЖЕ данными
            System.out.println(p1 == p2);         /// false
            System.out.println(p1.equals(p2));    /// false  <- вот в чём проблема
        }
    }

/***************** // EXAMPLE 2 == Overriden equals **** (POJO = Plain Old Java Object) ********************/

    public class Person {
        String name;
        int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        @Override
        public boolean equals(Object o) {
            if(this == o) return true;                                      /// проверка 1
            if(o == null || getClass() != o.getClass()) return false;       /// проверка 2
            Person person = (Person) o;                                     /// приведение типа
            return this.age == person.age && this.name.equals(person.name);  /// проверка 3
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;       /// либо имя есть == возвращается код, либо нет == 0
            result = 31 * result + age;         /// прайм * hashCode() + возраст == воспроизводимый псевдорандомный хэш
            return result;
        }
    }

    public class Main{
        public static void main(String[] args){
            Person p1 = new Person("Alice", 30);
            Person p2 = new Person("Alice", 30);
            System.out.println(p1 == p2);         /// false — по-прежнему разные объекты в памяти
            System.out.println(p1.equals(p2));    /// true  — теперь сравниваются ДАННЫЕ, а не адрес
        }
    }
/********************  // 1. equals() and hashCode()  ***  (POJO = Plain Old Java Object)  ******************/

/// equals compares objects by values, not pointers.
/// RULE OF THUMB: if equals is updated, hashCode() has to be updated too.
/// two objects that equal by equals() MUST have identical hashCode(), or object will break in HashMap/HashSet

class Point {
    int x;
    int y;
}

@Override
public boolean equals(Object o){ /// Обязательно "Object o" иначе не перепишется, а создастся новый метод equals()
    if (this == o) { return true; } /// same Point
    if (o == null || getClass() != o.getClass()) { return false; } /// Not Class Point/null => false;

    Point point = (Point) o;  // приводим к одинаковому виду для сравнения свойств.
    return this.x == point.x && this.y == point.y;
}

@Override
public int hashCode() {
    int result = x; /// already int.
    result= 31 * result + y;
    return result;
}

public class Main{
    public static void main(String[] args){
        Point p1 = new Point(3, 5);
        Point p2 = new Point(3, 5);

        System.out.println(p1.equals(p2)); // true, compares values;
        System.out.println(p1 == p2); // false, compares pointers to points;
    }
}

/***********************************  // 2. Record  ******************************************/
/// record is a special type for basic data, compiler generates constructor/ getters(no get- prefix)/equals/hashCode/toString
/// all fields are immutable == no setters at all.
/// не относится к POJO!

public record Coordinates(int x, int y){
    public Coordinates {
        if(x < 0 || y < 0){
            throw new IllegalArgumentException("Coordinate cannot be negative");
        }
    }
    public double distanceFromOrigin(){
        return (Math.sqrt(x*x + y*y)); // hypotenuse
    }
}

public class Main {
    public static void main(String[] args){
        Coordinates coord1 = new Coordinates(3, 4);
        Coordinates coord2 = new Coordinates(4,3);
        System.out.println("Generated x getter coord.x(): " + coord1.x());
        System.out.println("Generated y getter coord.y(): " + coord1.y());
        System.out.println("Generated equals: coord1.equals(coord2): " + coord1.equals(coord2));
        System.out.println("Generated toString: " + coord1);
        System.out.println("Distance from origin(0,0) = " + coord1.distanceFromOrigin());
        System.out.println("Distance from origin(0,0) = " + coord2.distanceFromOrigin());
    }
}

/******************************************************************************************************/