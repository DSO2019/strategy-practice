import unittest
from Pikachu import *


class PikachuTests(unittest.TestCase):
    def setUp(self):
        self.pikachu = Pikachu()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Thunderbolt causing a damage of 90",
            self.pikachu.performMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with Boltstrike causing a damage of 90",
            self.pikachu.performSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.pikachu.defend(0))

    def test_name(self):
        self.assertEquals("Pikachu", self.pikachu.getName())

    def test_evolve(self):
        self.assertEquals(None, self.pikachu.evolve())

    def test_type(self):
        self.assertEquals("electric", self.pikachu.getType())

    def test_evolution(self):
        self.assertEquals(True, self.pikachu.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Thunderbolt", self.pikachu.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Boltstrike", self.pikachu.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(90, self.pikachu.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(90, self.pikachu.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.pikachu.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.pikachu.getHitPoints())
