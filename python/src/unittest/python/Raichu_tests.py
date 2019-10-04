import unittest
from Raichu import *


class RaichuTests(unittest.TestCase):
    def setUp(self):
        self.raichu = Raichu()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Impacthunder causing a damage of 25",
            self.raichu.executeMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Slam causing a damage of 15",
            self.raichu.executeSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.raichu.defend(0))

    def test_name(self):
        self.assertEquals("Raichu", self.raichu.getName())

    def test_evolve(self):
        self.assertEquals(None, self.raichu.evolve())

    def test_type(self):
        self.assertEquals("electric", self.raichu.getType())

    def test_evolution(self):
        self.assertEquals(False, self.raichu.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Impacthunder", self.raichu.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Slam", self.raichu.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(25, self.raichu.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(15, self.raichu.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.raichu.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.raichu.getHitPoints())
