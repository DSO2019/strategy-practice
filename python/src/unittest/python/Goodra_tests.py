from mockito import mock, verify, when
import unittest

from Goodra import Goodra
from Attack import Attack


class Goodra_test(unittest.TestCase):

    def setUp(self):
        self.goodra = Goodra()
        self.mockedSecondAttack = mock(Attack, strict=False)
        self.mockedMainAttack = mock(Attack, strict=False)
        self.goodra.setSecondAttack(self.mockedSecondAttack)
        self.goodra.setMainAttack(self.mockedMainAttack)

    def test_evolve(self):
        self.assertEqual(None,self.goodra.evolve())
    
    def test_defend(self):
        self.assertEquals("Defending attack, damage caused is 3 new HP is 74",self.goodra.defend(10))

    def test_secondAttack(self):
        when(self.mockedSecondAttack).performAttack().thenReturn("attack")
        when(self.mockedSecondAttack).getDamage().thenReturn(100)
        self.assertEqual("Attacking opponent with attack causing a damage of 100",self.goodra.secondAttack())
    
    def test_mainAttack(self):
        when(self.mockedMainAttack).performAttack().thenReturn("attack")
        when(self.mockedMainAttack).getDamage().thenReturn(100)
        self.assertEqual("Attacking opponent with attack causing a damage of 100",self.goodra.mainAttack())