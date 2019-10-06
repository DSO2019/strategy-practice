from mockito import mock, verify, when
import unittest

from Thunder import Thunder

class Thunder_test(unittest.TestCase):

    def setUp(self):
        self.thunder = Thunder()
    
    def test_performAttack(self):
        self.assertEqual("Thunder",self.thunder.performAttack())
    
    def test_getDamage(self):
        self.assertEqual(110, self.thunder.getDamage())