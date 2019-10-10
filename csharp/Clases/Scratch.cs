namespace unittestpractice.Clases
{
    public class Scratch : IAttack
    {

        /**Nombre del ataque.*/
        private readonly String _name = "Ataque Scratch";
        /**Daño del ataque.*/
        private const int Damage = 17;

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