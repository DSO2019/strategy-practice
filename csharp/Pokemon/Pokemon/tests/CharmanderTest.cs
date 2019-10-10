using System;
using NUnit.Framework;
using Pokemon.main;

namespace Pokemon.tests
{
    [TestFixture]
    internal class CharmanderTest
    {
        public Charmander Charmander;
        [SetUp]
        public void Setup()
        {
            Charmander = new Charmander();
        }

        [Test]
        public void mainAttack()
        {
            Assert.AreEqual("Attacking opponent with Ember causing a damage of 30", Charmander.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with Flamethrower causing a damage of 30", Charmander.secondAttack());
        }
    }
}