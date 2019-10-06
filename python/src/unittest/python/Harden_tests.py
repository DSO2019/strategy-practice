from mockito import mock, verify, when
import unittest

from Harden import Harden

class Harden_test(unittest.TestCase):
    def setUp(self):
        self.harden = Harden()
    
    def test_performAttack(self):
        self.assertEqual("usa Harden! No pasa absolutamente nada...",self.harden.performAttack())