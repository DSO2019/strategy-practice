namespace unittestpractice.Clases
{
    public class FutureSight : IAttack
    {

        /**Nombre del ataque.*/
        private const string Name = "Ataque Future Sight";

        /**Daño del ataque.*/
        private const int Damage = 22;

        public string GetAttackName()
        {
            return Name;
        }

        public int GetAttackDamage()
        {
            return Damage;
        }
    }
}
