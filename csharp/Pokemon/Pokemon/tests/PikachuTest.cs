using NUnit.Framework;
using Pokemon.main;

namespace Pokemon.tests
{
    [TestFixture]
    internal class PikachuTest
    {
        public Pikachu Pikachu;
        [SetUp]
        public void Setup()
        {
            Pikachu = new Pikachu();
        }

        [Test]
        public void mainAttack()
        {
            Assert.AreEqual("Attacking opponent with Psychic causing a damage of 30", Pikachu.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with THunderpunch causing a damage of 20", Pikachu.secondAttack());
        }
    }
}