from mockito import mock, verify, when
import unittest

from ElectroWeb import ElectroWeb

class ElectroWeb_test(unittest.TestCase):

    def setUp(self):
        self.electroWeb = ElectroWeb()
    
    def test_performAttack(self):
        self.assertEqual("Electro Web",self.electroWeb.performAttack())
    
    def test_getDamage(self):
        self.assertEqual(55, self.electroWeb.getDamage())