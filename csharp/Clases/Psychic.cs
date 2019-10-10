namespace unittestpractice.Clases
{
    public class Psychic : IAttack
    {

        /**Nombre del ataque.*/
        private const string Name = "Ataque Psychic";
        /**Daño del ataque.*/
        private const int Damage = 17;

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