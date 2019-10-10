using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using unittestpractice;
using unittestpractice.Clases;
using unittestpractice.Clases.Attacks;

namespace unittestpractice.Clases
{
    class Squirtle : PokemonCharacter
    {

        /**
         * Hit Points are the maximum life of pokemon.
         */
        public static int HIT_POINTS = 100;
        /**
         * Defense multiplier value between 0-1.
         */
        public static double DEFENSE_MULTIPLIER = 0.7;
        /**
         * Damage from 1 - 20.
         */
        public static int MAIN_ATTACK_DAMAGE = 6;
        /**
         * Damage from 1 -25.
         */
        public static int SECOND_ATTACK_DAMAGE = 22;

        /**
         * Charizard constructor.
         */
        public Squirtle()
        {
            Tackle mainAtack = new Tackle();
            Hadouken secondAtack = new Hadouken();
            setType("fire");
            setName("Squirtle");
            setHasEvolution(true);
            setMainAttack(mainAtack.attack());
            setSecondAttack(secondAtack.attack());
            setHitPoints(HIT_POINTS);
            setDefenseMultiplier(DEFENSE_MULTIPLIER);
            setMainAttackDamage(mainAtack.getAttackDamage());
            setSecondAttackDamage(secondAtack.getAttackDamage());
        }

        public override String evolve()
        {
            return null;
        }


        public override String defend(int attack)
        {
            int damage;

            damage = (int)(attack * getDefenseMultiplier());
            int newHP = getHitPoints() - damage;

            String defendMessage = "Defending attack, damage caused is " + damage + " new HP is " + newHP;

            setHitPoints(newHP);
            return defendMessage;

        }


        public override String SecondAttack()
        {

            String attackMessage = "Attacking opponent with "
                                   + getSecondAttack()
                                   + " causing a damage of " + getSecondAttackDamage();
            return attackMessage;


        }


        public override String MainAttack()
        {
            String attackMessage = "Attacking opponent with "
                                   + getMainAttack()
                                   + " causing a damage of " + getMainAttackDamage();
            return attackMessage;

        }

        public override void setNewAttack(int attack, int attackDamage,
            String newAttack)
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
    }
}