from mockito import mock, verify, when
import unittest

from Autodestruccion import Autodestruccion

class Autodestruccion_test(unittest.TestCase):
    def setUp(self):
        self.autodestruccion = Autodestruccion()
    
    def test_performAttack(self):
        self.assertEqual("usa autodestrucción! El pokemon ha muerto...",self.autodestruccion.performAttack())