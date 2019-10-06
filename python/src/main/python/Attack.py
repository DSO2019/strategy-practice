from __future__ import annotations
from abc import ABC, abstractmethod


class Attack(ABC):

    @abstractmethod
    def performAttack() -> str:
        pass

    @abstractmethod
    def getDamage() -> int:
        pass
