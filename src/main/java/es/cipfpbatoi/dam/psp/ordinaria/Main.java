package es.cipfpbatoi.dam.psp.ordinaria;

public class Main {
    public static void main(String[] args) {

        Vegetal[] vegetals = new Vegetal[6];

        Manzana manzana = new Manzana();
        manzana.setCantidad(10);

        vegetals[0] = manzana;

        Pera pera = new Pera();
        pera.setCantidad(20);

        vegetals[1] = pera;

        Naranja naranja = new Naranja();
        naranja.setCantidad(30);

        vegetals[2] = naranja;



        Lechuga lechuga = new Lechuga();
        lechuga.setCantidad(80);

        vegetals[3] = lechuga;

        Tomate tomate = new Tomate();
        tomate.setCantidad(15);

        vegetals[4] = tomate;

        Pepino pepino = new Pepino();
        pepino.setCantidad(50);

        vegetals[5] = pepino;


        for(Vegetal vegetal : vegetals){
            System.out.println(vegetal.toString() + " " +
                    vegetal.getCantidad());
        }

    }
}