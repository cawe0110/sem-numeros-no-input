package br.com.senai;

import br.com.senai.model.Carro;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner l = new Scanner(System.in);
        while (!l.hasNext("[A-Za-z]+"))
        {
            System.out.println("paraaa: ");
            l.next();
        }
        String word = l.next();

        Carro carro1 = new Carro();
        carro1.setMarca(word);
        System.out.println("Criar marca: ");
        System.out.println("Marca: " + carro1.getMarca());
    }
}
