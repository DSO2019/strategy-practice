using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice.Clases.Attacks
{
    public class Tackle:  IAttack
    {
    /**
     * attack damage.
     */
    private int attackDamage;

    /**
     * @return attack name.
     */
    public String attack()
    {
        return "Tackle";
    }

    /**
     * @return attack damage.
     */
    public int getAttackDamage()
    {
        return attackDamage;
    }

    /**
     * @param damage attack damage.
     */
    public void setAttackDamage( int damage)
    {
        attackDamage = damage;
    }
    }
}
