using NUnit.Framework;
using Pokemon.main;

namespace Pokemon.tests
{
    [TestFixture]
    internal class AlakazamTest
    {
        public Alakazam Jigglypuff;
        [SetUp]
        public void Setup()
        {
            Jigglypuff = new Alakazam();
        }

        [Test]
        public void mainAttack()
        {
            Assert.AreEqual("Attacking opponent with THunderpunch causing a damage of 30", Jigglypuff.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with Psychic causing a damage of 30", Jigglypuff.secondAttack());
        }
    }
}