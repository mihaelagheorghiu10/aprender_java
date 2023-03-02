package intro.Java;

public class WileLoop {
    public static void main(String[] args) {

        //boolean check = true;

        int count = 0;
        while(count < 10){
            count ++; //condicion
            if (count == 6)
                continue;

            System.out.println("Hola mundo" + count);
            //count ++; //condicion
        }
        //System.out.println("fin");

    }
}
