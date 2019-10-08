import unittest
from Jolteon import *


class JolteonTests(unittest.TestCase):
    def setUp(self):
        self.jolteon = Jolteon()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Thunderbolt causing a damage of 90",
            self.jolteon.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Psychic causing a damage of 80",
            self.jolteon.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 75",
            self.jolteon.defend(0))

    def test_name(self):
        self.assertEquals("Jolteon", self.jolteon.getName())

    def test_evolve(self):
        self.assertEquals(None, self.jolteon.evolve())

    def test_type(self):
        self.assertEquals("electric", self.jolteon.getType())

    def test_evolution(self):
        self.assertEquals(False, self.jolteon.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Thunderbolt", self.jolteon.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Psychic", self.jolteon.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(90, self.jolteon.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(80, self.jolteon.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.jolteon.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(75, self.jolteon.getHitPoints())