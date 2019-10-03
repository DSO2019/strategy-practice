package com.iteso.nintendo;

import net.sf.saxon.type.StringConverter;

public interface IAtaque
{
    public void setNombre(String nombre);
    public String getNombre();
    public void setDamage(int damage);
    public int getDamage();

}
