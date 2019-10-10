import unittest
from Pikachu import *


class PikachuTests(unittest.TestCase):
    def setUp(self):
        self.pikachu = Pikachu()

    def test_firstAttack(self):
        self.assertEquals(
            "Attacking opponent with ",
            self.pikachu.executeMainAttack())
