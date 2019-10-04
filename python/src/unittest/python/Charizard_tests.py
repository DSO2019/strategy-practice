import unittest
from Charizard import *


class CharizardTests(unittest.TestCase):
    def setUp(self):
        self.charizard = Charizard()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Flamethrower causing a damage of 25",
            self.charizard.executeMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with FireSpin causing a damage of 7",
            self.charizard.executeSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.charizard.defend(0))

    def test_name(self):
        self.assertEquals("Charizard", self.charizard.getName())

    def test_evolve(self):
        self.assertEquals(None, self.charizard.evolve())

    def test_type(self):
        self.assertEquals("fire", self.charizard.getType())

    def test_evolution(self):
        self.assertEquals(False, self.charizard.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Flamethrower", self.charizard.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("FireSpin", self.charizard.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(25, self.charizard.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(7, self.charizard.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.3, self.charizard.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.charizard.getHitPoints())
