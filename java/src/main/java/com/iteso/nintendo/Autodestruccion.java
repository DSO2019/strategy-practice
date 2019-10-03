package com.iteso.nintendo;

public class Autodestruccion implements AttackInterface{
    public final String  performAttack(){
         String attackMessage = new String("usa autodestrucción! El pokemon ha muerto...");
        return attackMessage;
    };
}