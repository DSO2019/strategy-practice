import unittest
from main.pokemon.Squirtle import *

class CharmanderTests(unittest.TestCase):
    def setUp(self):
        self.squirtle = Squirtle()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Splash causing a damage of 6",
            self.squirtle.doMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with tackle causing a damage of 6",
            self.squirtle.doSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.squirtle.defend(0))

    def test_name(self):
        self.assertEquals("Squirtle", self.squirtle.getName())

    def test_evolve(self):
        self.assertEquals(None, self.squirtle.evolve())

    def test_type(self):
        self.assertEquals("water", self.squirtle.getType())

    def test_evolution(self):
        self.assertEquals(False, self.squirtle.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Splash", self.squirtle.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Tackle", self.squirtle.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(6, self.squirtle.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(6, self.squirtle.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.squirtle.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.squirtle.getHitPoints())