namespace unittestpractice.Clases
{
    public class WaterGun : IAttack
    {

        /**Nombre del ataque.*/
        private const string Name = "Ataque Water Gun";
        /**Daño del ataque.*/
        private const int Damage = 25;

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