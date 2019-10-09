using NUnit.Framework;
using Pokemon.main;

namespace Pokemon.tests
{
    [TestFixture]
    internal class SquirtleTest
    {
        public Squirtle Squirtle;
        [SetUp]
        public void Setup()
        {
            Squirtle = new Squirtle();
        }

        [Test]
        public void mainAttack()
        {
            Assert.AreEqual("Attacking opponent with Quick Attack causing damage of 30", Squirtle.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with Quick Attack causing damage of 30", Squirtle.secondAttack());
        }
    }
}