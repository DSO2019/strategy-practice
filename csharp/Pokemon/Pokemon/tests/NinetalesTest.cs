using NUnit.Framework;
using Pokemon.main;

namespace Pokemon.tests
{
    [TestFixture]
    internal class NinetailsTest
    {
        public Ninetails Ninetails;
        [SetUp]
        public void Setup()
        {
            Ninetails = new Ninetails();
        }

        [Test]
        public void mainAttack()
        {
            Assert.AreEqual("Attacking opponent with Flamethrower causing a damage of 30", Ninetails.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with Ember causing a damage of 20", Ninetails.secondAttack());
        }
    }
}