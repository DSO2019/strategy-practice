using System;
using System.Collections.Generic;
using System.Text;

namespace Pokemon.main
{
    public interface IAttack
    {
        string getAttack();
        int getAttackDamage();
        void setAttackDamage(int newAttackDamage);
    }
}
