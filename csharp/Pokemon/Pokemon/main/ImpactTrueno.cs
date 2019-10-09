using System;
using System.Collections.Generic;
using System.Text;

namespace Pokemon.main
{
    internal class ImpactTrueno : IAttack
    {
        /**
        * Attack Damage value.
        */
        private static readonly int INITIAL_AD = 20;
        /**
         * Attack name.
         */
        private readonly string attack = "Impact Trueno";
        /**
         * Attack Damage.
         */
        private int _attackDamage = INITIAL_AD;
        /**
         * @return Name of the attack.
         */
        public String getAttack()
        {
            return attack;
        }
        /**
         * @return value of the attack.
         */
        public int getAttackDamage()
        {
            return _attackDamage;
        }

        /**
         * @param newAttackDamage Sets new AttackDamage.
         */
        public void setAttackDamage(int newAttackDamage)
        {
            this._attackDamage = newAttackDamage;
        }
    }
}