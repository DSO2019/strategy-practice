from mockito import mock, verify, when
import unittest

from Moonblast import Moonblast

class Moonblast_test(unittest.TestCase):

    def setUp(self):
        self.moonblast = Moonblast()
    
    def test_performAttack(self):
        self.assertEqual("Moonblast",self.moonblast.performAttack())
    
    def test_getDamage(self):
        self.assertEqual(95, self.moonblast.getDamage())