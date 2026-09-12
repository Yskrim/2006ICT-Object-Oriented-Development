/***********************************   1. String immutability + methods   ***********************************/

/// string == IMMUTABLE
/// string methods create NEW string from original -> results need to be saved in a variable
public class Main {
    public static void main(String[] args){
        String phrase = "  Griffith University  ";
        System.out.println("// task1: length: " + phrase.length());
        System.out.println("// task2: charAt(2): " + phrase.charAt(2));
        System.out.println("// task3: " + phrase.substring(11, 21));
        System.out.println("// task4: phrase.trim() без присваивания не изменит исходную переменную.");
    }
}

/***********************************   2. StringBuilder   ***********************************/

/// StringBuilder можно изменять без нового обьекта.

public class Main {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append(" is fun");
        System.out.println(sb);
        sb.insert(7, " really");
        System.out.println(sb);
        sb.delete(0, 5);
        String result = sb.toString();
        System.out.println(result);
    }
}

/***********************************   3. Text Blocks   ***********************************/

/// """...""" = syntax for multiline strings
/// takes away the need for \n and + on every line
/// indentation is normalized (trimmed left indent)

public class Main {
    public static void main(String[] args){
        String textBlock = """
                // Name: Anton
                // Course: 2006ICT
                // Status: In Progress
                """;
        System.out.println(textBlock);
        System.out.println("// I think this is used for logs, or maybe for debugging, when one function checks multiple things at once. Just simplifies larger data handling");
    }
}

/// с ручными \n на каждом переносе и/или + конкатенацией. Text block избавляет от этого: можно просто визуально написать текст как он есть, с реальными переносами строк, без escape-последовательностей. Особенно ценно для встраивания форматированного контента — JSON, HTML, SQL-запросов — где \n на каждой строке сделал бы код нечитаемым.

/*********************************************************************************************/