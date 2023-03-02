package intro.Java;

public class WileLoop {
    public static void main(String[] args) {

        //boolean check = true;

        int count = 0;
        while(count < 10){
            count ++; //condicion
            if (count == 6)
                break; // rompe el flujo de ejecucion dentro de respetivo bucle
                //continue;

            System.out.println("Hola mundo" + count);
            //count ++; //condicion
        }
        System.out.println("fin");

    }
}
     //se pueden utilizar con el bucle for