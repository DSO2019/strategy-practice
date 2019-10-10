using NUnit.Framework;
using Pokemon.main;

namespace Pokemon.tests
{
    [TestFixture]
    internal class GengarTest
    {
        public Gengar Lucario;
        [SetUp]
        public void Setup()
        {
            Lucario = new Gengar();
        }

        [Test]
        public void mainAttack()
        {
            Assert.AreEqual("Attacking opponent with THunderpunch causing a damage of 20", Lucario.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with Psychic causing a damage of 30", Lucario.secondAttack());
        }
    }
}