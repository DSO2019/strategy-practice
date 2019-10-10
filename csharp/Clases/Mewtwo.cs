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
    class Mewtwo : PokemonCharacter
    {

        /**
         * Hit Points are the maximum life of pokemon.
         */
        public static int HIT_POINTS = 100;
        /**
         * Defense multiplier value between 0-1.
         */
        public static double DEFENSE_MULTIPLIER = 0.7;
        
        public Mewtwo()
        {
            WaterGun mainAtack = new WaterGun();
            Scratch secondAtack = new Scratch();
            setType("fire");
            setName("Mewtwo");
            setHasEvolution(true);
            setMainAttack(mainAtack.GetAttackName());
            setSecondAttack(secondAtack.GetAttackName());
            setHitPoints(HIT_POINTS);
            setDefenseMultiplier(DEFENSE_MULTIPLIER);
            setMainAttackDamage(mainAtack.GetAttackDamage());
            setSecondAttackDamage(secondAtack.GetAttackDamage());
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