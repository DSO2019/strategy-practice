using System;
using System.Collections.Generic;
using System.Runtime.ConstrainedExecution;
using System.Text;

namespace Pokemon.main
{
    internal class Ninetails : PokemonCharacter
    {
        private readonly int HIT_POINTS = 100;
        private readonly double DEFENSE_MULTIPLIER = 0.4;

        public Ninetails()
        {
            Flamethrower flamethrower= new Flamethrower();
            Ember ember= new Ember();
            setType("fire");
            setName("Ninetails");
            setHasEvolution(true);
            setSecondAttack(ember);
            setMainAttack(flamethrower);
            setHitPoints(HIT_POINTS);
            setDefenseMultiplier(DEFENSE_MULTIPLIER);
            setMainAttackDamage(flamethrower.getAttackDamage());
            setSecondAttackDamage(ember.getAttackDamage());
        }

        override 
        public string evolve()
        {
            return null;
        }

        override
        public string defend(int attack)
        {
            int damage;

            damage = (int)(attack * getDefenseMultiplier());
            int newHP = getHitPoints() - damage;

            String defendMessage = new String("Defending attack, damage caused is "
                                              + damage + " new HP is " + newHP);

            setHitPoints(newHP);
            return defendMessage;

        }

        override 
        public string secondAttack()
        {

            String attackMessage = new String("Attacking opponent with "
                                              + getSecondAttack()
                                              + " causing a damage of " + getSecondAttackDamage());
            return attackMessage;


        }

        override
        public string mainAttack()
        {
            String attackMessage = new String("Attacking opponent with "
                                              + getMainAttack()
                                              + " causing a damage of " + getMainAttackDamage());
            return attackMessage;

        }

        override 
        public void setNewAttack(int attack, int attackDamage,
             IAttack newAttack)
        {
            if (attack == 1)
            {
                setMainAttack(newAttack);
                setMainAttackDamage(attackDamage);
            }
            else
            {
                setSecondAttack(newAttack);
                setSecondAttackDamage(attackDamage);
            }
        }

        public override string getAttack()
        {
            throw new NotImplementedException();
        }
    }
}
