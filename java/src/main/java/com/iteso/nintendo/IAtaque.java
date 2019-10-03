package com.iteso.nintendo;

import net.sf.saxon.type.StringConverter;

public interface IAtaque
{
    void setNombre(String nombre);
    String getNombre();
    void setDamage(int damage);
    int getDamage();

}
