from mockito import mock, verify, when
import unittest

from Llanto import Llanto

class Llanto_test(unittest.TestCase):
    def setUp(self):
        self.llanto = Llanto()
    
    def test_performAttack(self):
        self.assertEqual("usa llanto! No pasa absolutamente nada bueno...",self.llanto.performAttack())