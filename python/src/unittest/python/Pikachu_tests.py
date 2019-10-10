from mockito import mock, verify, when
import unittest

from Pikachu import Pikachu
from Attack import Attack


class Pikachu_test(unittest.TestCase):

    def setUp(self):
        self.pikachu = Pikachu()
        self.mockedSecondAttack = mock(Attack, strict=False)
        self.mockedMainAttack = mock(Attack, strict=False)
        self.pikachu.setSecondAttack(self.mockedSecondAttack)
        self.pikachu.setMainAttack(self.mockedMainAttack)

    def test_evolve(self):
        self.assertEqual(None,self.pikachu.evolve())
    
    def test_defend(self):
        self.assertEquals("Defending attack, damage caused is 3 new HP is 74",self.pikachu.defend(10))

    def test_secondAttack(self):
        when(self.mockedSecondAttack).performAttack().thenReturn("attack")
        when(self.mockedSecondAttack).getDamage().thenReturn(100)
        self.assertEqual("Attacking opponent with attack causing a damage of 100",self.pikachu.secondAttack())
    
    def test_mainAttack(self):
        when(self.mockedMainAttack).performAttack().thenReturn("attack")
        when(self.mockedMainAttack).getDamage().thenReturn(100)
        self.assertEqual("Attacking opponent with attack causing a damage of 100",self.pikachu.mainAttack())