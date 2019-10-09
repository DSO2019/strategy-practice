using NUnit.Framework;
using Pokemon.main;

namespace Pokemon.tests
{
    [TestFixture]
    internal class LucarioTest
    {
        public Lucario Lucario;
        [SetUp]
        public void Setup()
        {
            Lucario = new Lucario();
        }

        [Test]
        public void mainAttack()
        {
            Assert.AreEqual("Attacking opponent with Quick Attack causing damage of 30", Lucario.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with Quick Attack causing damage of 30", Lucario.secondAttack());
        }
    }
}