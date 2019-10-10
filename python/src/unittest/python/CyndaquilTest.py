import unittest
from Cyndaquil import *


class CyndaquilTest(unittest.TestCase):
    def setUp(self):
        self.cyndaquil = Cyndaquil()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Fireblast causing a damage of 80",
            self.cyndaquil.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Flamethrower causing a damage of 60",
            self.cyndaquil.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.cyndaquil.defend(0))

    def test_name(self):
        self.assertEquals("Cyndaquil", self.cyndaquil.getName())

    def test_evolve(self):
        self.assertEquals(None, self.cyndaquil.evolve())

    def test_type(self):
        self.assertEquals("fire", self.cyndaquil.getType())

    def test_evolution(self):
        self.assertEquals(False, self.cyndaquil.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Fireblast", self.cyndaquil.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Flamethrower", self.cyndaquil.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(80, self.cyndaquil.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(60, self.cyndaquil.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.cyndaquil.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.cyndaquil.getHitPoints())
