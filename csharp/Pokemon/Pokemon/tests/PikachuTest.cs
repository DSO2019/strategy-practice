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
            Assert.AreEqual("Attacking opponent with Quick Attack causing damage of 30", Pikachu.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with Quick Attack causing damage of 30", Pikachu.secondAttack());
        }
    }
}