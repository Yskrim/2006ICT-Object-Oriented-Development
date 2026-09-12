/********************************* 1. PACKAGES *************************************/
// source: src/com/griffith/game/items/Sword.java
// full name: com.griffith.game.items.Sword
package com.griffith.game.items;
public class Sword {
    // ...
}

/********************************* 2. CLASS VS INSTANCE *************************************/
public class Car {
    String model;
    int year;

    public void printInfo(){
        System.out.println(model + ", " + year);
    }
}

public class Main {
    public static void main(String[] args){
        Car first = new Car();
        first.model = "Tesla Model 3";
        first.year = 2024;

        Car second = new Car();
        second.model = "Toyota Corolla";
        second.year = 2020;

        first.printInfo();
        second.printInfo();
    }
}

/********************************* 3. Static Members *************************************/
public class Main {
    public class Counter {
        public static int total = 0;
        public Counter(){
            Counter.total++;
        }
        public static int getTotal(){
            return total;
        }
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.getTotal());
    }
}

/********************************* 4. Default values for Attributes *************************************/
public class GameSession {
    int level; // 0
    double timeElapsed; // 0.0
    boolean isPaused; // false
    char difficulty; // null
    String playerName; // \u0000 - primitive
}


/*********************************  5.Constructor Overloading *************************************/
public class Player {
    String name;
    int health;

    public Player(){
        this.name = "Unknown";
        this.health = 100;
    }

    public Player(String name, int health){
        this.name = name;
        this.health = health;
    }

    public Player(String name){
        this.name = name;
        this.health = 100;
    }
}

public class Main {
    public static void main(String[] args){
        Player p1 = new Player();
        Player p2 = new Player("Messi", 95);
        Player p3 = new Player("Ronaldo");

        System.out.println(p1.name + ", " + p1.health);
        System.out.println(p2.name + ", " + p2.health);
        System.out.println(p3.name + ", " + p3.health);
    }
}

/********************************* // 6.Access modifiers *************************************/

class Wallet{
    private double amount;

    public void deposit(double sum){
        this.amount+=sum;
    }

    public double getAmount(){
        return this.amount;
    }

    protected void applyFee(double fee){
        this.amount-=fee;
    }
}
// если wallet не подкласс, запись wallet.amount = 500 приведет к ошибке компиляции потому что вне класса прямого доступа к переменной нет