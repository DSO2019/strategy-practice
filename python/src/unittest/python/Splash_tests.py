from mockito import mock, verify, when
import unittest

from Splash import Splash

class Splash_test(unittest.TestCase):
    def setUp(self):
        self.splash = Splash()
    
    def test_performAttack(self):
        self.assertEqual("usa Splash! No pasa absolutamente nada...",self.splash.performAttack())