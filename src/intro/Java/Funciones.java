package intro.Java;

public class Funciones {
    public static void main(String[] args) {
        // holaMundo();
        // holaMundo();

        //holaMundo("Mika");
        //holaMundo("Maria");

        String hola = devolverHola();
        System.out.println(hola);

    }

    private static void holaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");

    }

    private static void holaMundo(String name) {
        System.out.println("Hola" + name);
    }

    private static String devolverHola() {
        return "Hola";
    }
}