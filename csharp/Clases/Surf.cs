namespace unittestpractice.Clases
{
    public class Surf : IAttack
    {

        /**Nombre del ataque.*/
        private const string Name = "Ataque Surf";
        /**Daño del ataque.*/
        private const int Damage = 10;

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