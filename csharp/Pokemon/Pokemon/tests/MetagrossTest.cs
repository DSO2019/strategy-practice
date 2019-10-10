using NUnit.Framework;
using Pokemon.main;

namespace Pokemon.tests
{
    [TestFixture]
    internal class MetagrossTest
    {
        public Metagross Metagross;
        [SetUp]
        public void Setup()
        {
            Metagross = new Metagross();
        }

        [Test]
        public void mainAttack()
        {
            Assert.AreEqual("Attacking opponent with Psychic causing a damage of 30", Metagross.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with MetalClaw causing a damage of 30", Metagross.secondAttack());
        }
    }
}