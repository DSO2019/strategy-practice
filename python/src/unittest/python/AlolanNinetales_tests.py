from mockito import mock, verify, when
import unittest

from AlolanNinetales import AlolanNinetales
from Attack import Attack


class AlolanNinetales_test(unittest.TestCase):

    def setUp(self):
        self.alolanNinetales = AlolanNinetales()
        self.mockedSecondAttack = mock(Attack, strict=False)
        self.mockedMainAttack = mock(Attack, strict=False)
        self.alolanNinetales.setSecondAttack(self.mockedSecondAttack)
        self.alolanNinetales.setMainAttack(self.mockedMainAttack)

    def test_evolve(self):
        self.assertEqual(None,self.alolanNinetales.evolve())
    
    def test_defend(self):
        self.assertEquals("Defending attack, damage caused is 3 new HP is 74",self.alolanNinetales.defend(10))

    def test_secondAttack(self):
        when(self.mockedSecondAttack).performAttack().thenReturn("attack")
        when(self.mockedSecondAttack).getDamage().thenReturn(100)
        self.assertEqual("Attacking opponent with attack causing a damage of 100",self.alolanNinetales.secondAttack())
    
    def test_mainAttack(self):
        when(self.mockedMainAttack).performAttack().thenReturn("attack")
        when(self.mockedMainAttack).getDamage().thenReturn(100)
        self.assertEqual("Attacking opponent with attack causing a damage of 100",self.alolanNinetales.mainAttack())