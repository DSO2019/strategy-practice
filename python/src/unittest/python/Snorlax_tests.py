import unittest
from Snorlax import *


class SnorlaxTests(unittest.TestCase):
    def setUp(self):
        self.snorlax = Snorlax()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Slam causing a damage of 15",
            self.snorlax.executeMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Tackle causing a damage of 10",
            self.snorlax.executeSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 150",
            self.snorlax.defend(0))

    def test_name(self):
        self.assertEquals("Snorlax", self.snorlax.getName())

    def test_evolve(self):
        self.assertEquals(None, self.snorlax.evolve())

    def test_type(self):
        self.assertEquals("useless", self.snorlax.getType())

    def test_evolution(self):
        self.assertEquals(False, self.snorlax.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Slam", self.snorlax.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Tackle", self.snorlax.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(15, self.snorlax.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(10, self.snorlax.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.snorlax.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(150, self.snorlax.getHitPoints())
