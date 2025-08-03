package org.project;
//Classe de teste singleton
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Configuration c1 = Configuration.getInstance();
        Configuration c2 = Configuration.getInstance();

        if(c1 == c2){ // se o c1 for igual ao endereço de memoria de c2:
            System.out.println("O Singleton funcionou!");
        }else {
            System.out.println("Singleton não funcionou!");
        }
        System.out.println("Vamos conferir o endereço de memoria:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();
    }
}