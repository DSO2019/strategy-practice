﻿using System;
using System.Collections.Generic;
using System.Text;

namespace Pokemon.main
{
    internal class MetalClaw : IAttack
    {
        /**
    * Attack Damage value.
    */
        private static readonly int INITIAL_AD = 30;
        /**
         * Attack name.
         */
        private readonly string attack = "MetalClaw";
        /**
         * Attack Damage.
         */
        private int attackDamage = INITIAL_AD;
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
            return attackDamage;
        }

        /**
         * @param newAttackDamage Sets new AttackDamage.
         */
        public void setAttackDamage(int newAttackDamage)
        {
            this.attackDamage = newAttackDamage;
        }
    }
}