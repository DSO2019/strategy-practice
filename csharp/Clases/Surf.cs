namespace unittestpractice.Clases
{
    public class Surf : IAttack
    {

        /**Nombre del ataque.*/
        private readonly String _name = "Ataque Surf";
        /**Daño del ataque.*/
        private const int Damage = 10;

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