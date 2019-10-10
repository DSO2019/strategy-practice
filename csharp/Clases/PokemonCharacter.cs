namespace unittestpractice.Clases
{
    public abstract class PokemonCharacter
    {

        /**
         * Pokemon name.
         */
        private string _name;

        /**
         * Pokemon type.
         */
        private string _type;

        /**
         * Indicator of evolution.
         */
        private bool _hasEvolution;

        /**
         * Main attack name.
         */
        private string _mainAttack;

        /**
         * Second attack name.
         */
        private string _secondAttack;

        /**
         * Damage caused by main attack.
         */
        private int _mainAttackDamage;

        /**
         * Damage caused by second attack.
         */
        private int _secondAttackDamage;

        /**
         * Multiplier to calculate damage received.
         */
        private double _defenseMultiplier;

        /**
         * Pokemon life.
         */
        private int _hitPoints;

        /**
         * Get pokemon name.
         * @return Name.
         */
        public string GetName()
        {
            return _name;
        }

        /**
         * Set pokemon name.
         * @param newName New name.
         */
        protected void SetName(string newName)
        {
            _name = newName;
        }

        /**
         * Method to perform evolution.
         * @return Result of evolution.
         */
        public abstract string Evolve();

        /**
         * Method to defend an attack.
         * @param attackDamage Amount of damage to defend.
         * @return Result of defense.
         */
        public abstract string Defend(int attackDamage);

        /**
         * Method to perform second attack.
         * @return Result of attack.
         */
        public abstract string SecondAttack();

        /**
         * Method to perform main attack.
         * @return Result of main attack.
         */
        public abstract string MainAttack();

        /**
         * Method to change pokemon attack.
         * @param attack Which attack to change.
         * @param attackDamage New damage.
         * @param newAttack New attack name.
         */
        public abstract void SetNewAttack(int attack,
            int attackDamage, string newAttack);

        /**
         * Pokemon type.
         * @return water, fire, normal, electric, plant, bug, etc.
         */
/*
        public string GetType()
        {
            return _type;
        }
*/

        /**
         * Set new pokemon type.
         * @param newType new pokemon type.
         */
        protected void SetType(string newType)
        {
            _type = newType;
        }

        /**
         * Indicate if pokemon can be evolved.
         * @return true or false.
         */
        public bool IsHasEvolution()
        {
            return _hasEvolution;
        }

        /**
         * Set indicator of evolution.
         * @param evolution set to true if pokemon can be evolved.
         */
        protected void SetHasEvolution(bool evolution)
        {
            _hasEvolution = evolution;
        }

        /**
         * Get name of main attack.
         * @return main attack name.
         */
        protected string GetMainAttack()
        {
            return _mainAttack;
        }

        /**
         * Set name of main attack.
         * @param newMainAttack new main attack name.
         */
        protected void SetMainAttack(string newMainAttack)
        {
            _mainAttack = newMainAttack;
        }

        /**
         * Get name of second attack.
         * @return name of second attack.
         */
        protected string GetSecondAttack()
        {
            return _secondAttack;
        }

        /**
         * Set name of second attack.
         * @param newSecondAttack new second attack name.
         */
        protected void SetSecondAttack(string newSecondAttack)
        {
            _secondAttack = newSecondAttack;
        }

        /**
         * Get damage of main attack.
         * @return main attack damage.
         */
        protected int GetMainAttackDamage()
        {
            return _mainAttackDamage;
        }

        /**
         * Set main attack new damage.
         * @param newMainAttackDamage new main attack damage.
         */
        protected void SetMainAttackDamage(int newMainAttackDamage)
        {
            _mainAttackDamage = newMainAttackDamage;
        }

        /**
         * Get second attack damage.
         * @return second attack damage.
         */
        protected int GetSecondAttackDamage()
        {
            return _secondAttackDamage;
        }

        /**
         * Set new second attack damage.
         * @param newSecondAttackDamage new second attack damage.
         */
        protected void SetSecondAttackDamage(int newSecondAttackDamage)
        {
            _secondAttackDamage = newSecondAttackDamage;
        }

        /**
         * Get defense multiplier.
         * @return defense multiplier.
         */
        protected double GetDefenseMultiplier()
        {
            return _defenseMultiplier;
        }

        /**
         * Set new defense mul;tiplier.
         * @param newDefenseMultiplier new defense multiplier.
         */
        protected void SetDefenseMultiplier(double newDefenseMultiplier)
        {
            _defenseMultiplier = newDefenseMultiplier;
        }

        /**
         * Get hit points.
         * @return hit points.
         */
        protected int GetHitPoints()
        {
            return _hitPoints;
        }

        /**
         * Set new het points.
         * @param newHitPoints new hit points.
         */
        protected void SetHitPoints(int newHitPoints)
        {
            _hitPoints = newHitPoints;
        }

    }
}
