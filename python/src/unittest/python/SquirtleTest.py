import unittest
from Squirtle import *


class SquirtleTest(unittest.TestCase):
    def setUp(self):
        self.squirtle = Squirtle()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Acua Jet causing a damage of 45",
            self.squirtle.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Hidropulso causing a damage of 45",
            self.squirtle.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.squirtle.defend(0))

    def test_name(self):
        self.assertEquals("Squirtle", self.squirtle.getName())

    def test_evolve(self):
        self.assertEquals(None, self.squirtle.evolve())

    def test_type(self):
        self.assertEquals("Agua", self.squirtle.getType())

    def test_evolution(self):
        self.assertEquals(False, self.squirtle.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Acua Jet", self.squirtle.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Hidropulso", self.squirtle.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(45, self.squirtle.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(45, self.squirtle.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.5, self.squirtle.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.squirtle.getHitPoints())
