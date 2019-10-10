import unittest
from Wartortle import *


class WartortleTest(unittest.TestCase):
    def setUp(self):
        self.wartortle = Wartortle()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Acua Jet causing a damage of 45",
            self.wartortle.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Hidropulso causing a damage of 45",
            self.wartortle.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.wartortle.defend(0))

    def test_name(self):
        self.assertEquals("Wartortle", self.wartortle.getName())

    def test_evolve(self):
        self.assertEquals(None, self.wartortle.evolve())

    def test_type(self):
        self.assertEquals("Agua", self.wartortle.getType())

    def test_evolution(self):
        self.assertEquals(False, self.wartortle.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Acua Jet", self.wartortle.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Hidropulso", self.wartortle.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(45, self.wartortle.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(45, self.wartortle.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.wartortle.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.wartortle.getHitPoints())
