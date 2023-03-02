package intro.Java;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo(4);
        holaMundo("Nombre");
        // holaMundo();

        //holaMundo("Mika");
        //holaMundo("Maria");

        //String hola = devolverHola();
        //System.out.println(hola);

    }

    private static void holaMundo() { //no contiene parametro
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");

    }

    private static void holaMundo(String name) { //contiene parametro string , name
        System.out.println("Hola" + name);
    }

    private static void holaMundo(String name, String surname) { // contiene dos parametros diferentes
        System.out.println("Hola" + name + " " + surname);
    }

    private static void holaMundo(Integer number) { // contiente parametro tipo integer
        System.out.println("El numero es:" + number);
    }


    private static String devolverHola() {
        return "Hola";
    }
}