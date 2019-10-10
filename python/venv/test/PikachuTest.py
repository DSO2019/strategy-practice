import unittest
from main.pokemon.Pikachu import *

class CharmanderTests(unittest.TestCase):
    def setUp(self):
        self.pikachu = Pikachu()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with Thunderbolt causing a damage of 6",
            self.pikachu.doMainAttack())

    def test_secondAttack(self):
        self.assertEquals(
            "Attacking opponent with tackle causing a damage of 6",
            self.pikachu.doSecondAttack())

    def test_defend(self):
        self.assertEquals(
            "Defending attack, damage caused is 0 new HP is 100",
            self.pikachu.defend(0))

    def test_name(self):
        self.assertEquals("Pikachu", self.pikachu.getName())

    def test_evolve(self):
        self.assertEquals(None, self.pikachu.evolve())

    def test_type(self):
        self.assertEquals("eletric", self.pikachu.getType())

    def test_evolution(self):
        self.assertEquals(False, self.pikachu.isHasEvolution())

    def test_getMain(self):
        self.assertEquals("Thunderbolt", self.pikachu.getMainAttack())

    def test_getSecondary(self):
        self.assertEquals("Tackle", self.pikachu.getSecondAttack())

    def test_getMainDamage(self):
        self.assertEquals(6, self.pikachu.getMainAttackDamage())

    def test_getSecondDamage(self):
        self.assertEquals(6, self.pikachu.getSecondAttackDamage())

    def test_getMultiplier(self):
        self.assertEquals(0.4, self.pikachu.getDefenseMultiplier())

    def test_getPoints(self):
        self.assertEquals(100, self.pikachu.getHitPoints())