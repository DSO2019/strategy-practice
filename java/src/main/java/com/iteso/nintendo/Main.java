package com.iteso.nintendo;

public class Main {
    public static void main(String[] args) {
        PokemonCharacter pika = new Pikachu();
        System.out.println(pika.secondAttack());
        System.out.println(pika.mainAttack());

        PokemonCharacter charmander = new Charmander();
        System.out.println(charmander.secondAttack());
        System.out.println(charmander.mainAttack());

        PokemonCharacter charizard = new Charizard();
        System.out.println(charizard.secondAttack());
        System.out.println(charizard.mainAttack());
    }
}
