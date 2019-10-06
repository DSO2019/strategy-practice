from __future__ import annotations
from abc import ABC, abstractmethod

class Attack(ABC):

    @abstractmethod
    def performAttack(self):
        pass

    @abstractmethod
    def getDamage(self):
        pass
