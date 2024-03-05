package es.cipfpbatoi.dam.psp.ordinaria;

public class Main {
    public static void main(String[] args) {

        Fruta[] frutas = new Fruta[3];

        Manzana manzana = new Manzana();
        manzana.setCantidad(10);

        frutas[0] = manzana;

        Pera pera = new Pera();
        pera.setCantidad(20);

        frutas[1] = pera;

        Naranja naranja = new Naranja();
        naranja.setCantidad(30);

        frutas[2] = naranja;

        Verdura[] verduras = new Verdura[3];

        Lechuga lechuga = new Lechuga();
        lechuga.setCantidad(80);

        verduras[0] = lechuga;

        Tomate tomate = new Tomate();
        tomate.setCantidad(15);

        verduras[1] = tomate;

        Pepino pepino = new Pepino();
        pepino.setCantidad(50);

        verduras[2] = pepino;



    }
}