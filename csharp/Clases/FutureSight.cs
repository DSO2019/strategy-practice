namespace unittestpractice.Clases
{
    public class FutureSight : IAttack
    {

        /**Nombre del ataque.*/
        private readonly String _name = "Ataque Future Sight";
        /**Daño del ataque.*/
        private const int Damage = 22;

        public String GetAttackName()
        {
            return _name;
        }

        public int GetAttackDamage()
        {
            return Damage;
        }
    }
}
