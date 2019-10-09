using NUnit.Framework;
using Pokemon.main;

namespace Pokemon.tests
{
    [TestFixture]
    internal class JigglypuffTest
    {
        public Jigglypuff Jigglypuff;
        [SetUp]
        public void Setup()
        {
            Jigglypuff = new Jigglypuff();
        }

        [Test]
        public void mainAttack()
        {
            Assert.AreEqual("Attacking opponent with Quick Attack causing damage of 30", Jigglypuff.mainAttack());
        }

        [Test]
        public void secondAttack()
        {
            Assert.AreEqual("Attacking opponent with Quick Attack causing damage of 30", Jigglypuff.secondAttack());
        }
    }
}