using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice.Clases
{
    public abstract class PokemonCharacter
    {

        /**
         * Pokemon name.
         */
        private String name = null;

        /**
         * Pokemon type.
         */
        private String type = null;

        /**
         * Indicator of evolution.
         */
        private bool hasEvolution = false;

        /**
         * Main attack name.
         */
        private String mainAttack = null;

        /**
         * Second attack name.
         */
        private String secondAttack = null;

        /**
         * Damage caused by main attack.
         */
        private int mainAttackDamage = 0;

        /**
         * Damage caused by second attack.
         */
        private int secondAttackDamage = 0;

        /**
         * Multiplier to calculate damage received.
         */
        private double defenseMultiplier = 0;

        /**
         * Pokemon life.
         */
        private int hitPoints = 0;

        /**
         * Get pokemon name.
         * @return Name.
         */
        public String getName()
        {
            return name;
        }

        /**
         * Set pokemon name.
         * @param newName New name.
         */
        public void setName(String newName)
        {
            this.name = newName;
        }

        /**
         * Method to perform evolution.
         * @return Result of evolution.
         */
        public abstract String evolve();

        /**
         * Method to defend an attack.
         * @param attackDamage Amount of damage to defend.
         * @return Result of defense.
         */
        public abstract String defend(int attackDamage);

        /**
         * Method to perform second attack.
         * @return Result of attack.
         */
        public abstract String SecondAttack();

        /**
         * Method to perform main attack.
         * @return Result of main attack.
         */
        public abstract String MainAttack();

        /**
         * Method to change pokemon attack.
         * @param attack Which attack to change.
         * @param attackDamage New damage.
         * @param newAttack New attack name.
         */
        public abstract void setNewAttack(int attack,
            int attackDamage, String newAttack);

        /**
         * Pokemon type.
         * @return water, fire, normal, electric, plant, bug, etc.
         */
        public String getType()
        {
            return type;
        }

        /**
         * Set new pokemon type.
         * @param newType new pokemon type.
         */
        public void setType(String newType)
        {
            this.type = newType;
        }

        /**
         * Indicate if pokemon can be evolved.
         * @return true or false.
         */
        public bool isHasEvolution()
        {
            return hasEvolution;
        }

        /**
         * Set indicator of evolution.
         * @param evolution set to true if pokemon can be evolved.
         */
        public void setHasEvolution(bool evolution)
        {
            this.hasEvolution = evolution;
        }

        /**
         * Get name of main attack.
         * @return main attack name.
         */
        public String getMainAttack()
        {
            return mainAttack;
        }

        /**
         * Set name of main attack.
         * @param newMainAttack new main attack name.
         */
        public void setMainAttack(String newMainAttack)
        {
            this.mainAttack = newMainAttack;
        }

        /**
         * Get name of second attack.
         * @return name of second attack.
         */
        public String getSecondAttack()
        {
            return secondAttack;
        }

        /**
         * Set name of second attack.
         * @param newSecondAttack new second attack name.
         */
        public void setSecondAttack(String newSecondAttack)
        {
            this.secondAttack = newSecondAttack;
        }

        /**
         * Get damage of main attack.
         * @return main attack damage.
         */
        public int getMainAttackDamage()
        {
            return mainAttackDamage;
        }

        /**
         * Set main attack new damage.
         * @param newMainAttackDamage new main attack damage.
         */
        public void setMainAttackDamage(int newMainAttackDamage)
        {
            this.mainAttackDamage = newMainAttackDamage;
        }

        /**
         * Get second attack damage.
         * @return second attack damage.
         */
        public int getSecondAttackDamage()
        {
            return secondAttackDamage;
        }

        /**
         * Set new second attack damage.
         * @param newSecondAttackDamage new second attack damage.
         */
        public void setSecondAttackDamage(int newSecondAttackDamage)
        {
            this.secondAttackDamage = newSecondAttackDamage;
        }

        /**
         * Get defense multiplier.
         * @return defense multiplier.
         */
        public double getDefenseMultiplier()
        {
            return defenseMultiplier;
        }

        /**
         * Set new defense mul;tiplier.
         * @param newDefenseMultiplier new defense multiplier.
         */
        public void setDefenseMultiplier(double newDefenseMultiplier)
        {
            this.defenseMultiplier = newDefenseMultiplier;
        }

        /**
         * Get hit points.
         * @return hit points.
         */
        public int getHitPoints()
        {
            return hitPoints;
        }

        /**
         * Set new het points.
         * @param newHitPoints new hit points.
         */
        public void setHitPoints(int newHitPoints)
        {
            this.hitPoints = newHitPoints;
        }

    }
}
