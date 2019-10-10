import unittest
from Pichu import *


class PichuTest(unittest.TestCase):
    def setUp(self):
        self.pichu = Pichu()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Impactrueno causing a damage of 5",
            self.pichu.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Rayo causing a damage of 80",
            self.pichu.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.pichu.defend(0))

    def test_name(self):
        self.assertEquals("Pichu", self.pichu.getName())

    def test_evolve(self):
        self.assertEquals(None, self.pichu.evolve())

    def test_type(self):
        self.assertEquals("electric", self.pichu.getType())

    def test_evolution(self):
        self.assertEquals(True, self.pichu.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Impactrueno", self.pichu.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Rayo", self.pichu.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(5, self.pichu.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(80, self.pichu.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.pichu.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.pichu.getHitPoints())
