namespace unittestpractice.Clases
{
    public class WaterGun : IAttack
    {

        /**Nombre del ataque.*/
        private readonly String _name = "Ataque Water Gun";
        /**Daño del ataque.*/
        private const int Damage = 25;

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