namespace unittestpractice.Clases
{
    internal class Charmander : PokemonCharacter 
    {


        /**
         * Hit Points are the maximum life of pokemon.
         */
        private const int HitPoints = 100;

        /**
         * Defense multiplier value between 0-1.
         */
        private const double DefenseMultiplier = 0.7;
        
        public Charmander()
        {
            var mainAtack = new Surf();
            var secondAtack = new WaterGun();
            SetType("fire");
            SetName("Charmander");
            SetHasEvolution(true);
            SetMainAttack(mainAtack.GetAttackName());
            SetSecondAttack(secondAtack.GetAttackName());
            SetHitPoints(HitPoints);
            SetDefenseMultiplier(DefenseMultiplier);
            SetMainAttackDamage(mainAtack.GetAttackDamage());
            SetSecondAttackDamage(secondAtack.GetAttackDamage());
        }

        public override string Evolve()
        {
            return null;
        }

        
        public override string Defend( int attack)
        {
            var damage = (int)(attack * GetDefenseMultiplier());
            var newHp = GetHitPoints() - damage;

            var defendMessage = "Defending attack, damage caused is "+ damage + " new HP is " + newHp;

            SetHitPoints(newHp);
            return defendMessage;

        }

        
        public override string SecondAttack()
        {

            var attackMessage = "Attacking opponent with "
                                              + GetSecondAttack()
                                              + " causing a damage of " + GetSecondAttackDamage();
            return attackMessage;


        }

        
        public override string MainAttack()
        {
            var attackMessage = "Attacking opponent with "
                                              + GetMainAttack()
                                              + " causing a damage of " + GetMainAttackDamage();
            return attackMessage;

        }

        public override void SetNewAttack( int attack,  int attackDamage,
             string newAttack)
        {
            if (attack == 1)
            {
                SetMainAttack(newAttack);
                SetMainAttackDamage(attackDamage);
            }
            else
            {
                SetSecondAttack(newAttack);
                SetSecondAttackDamage(attackDamage);
            }
        }
    }
}
