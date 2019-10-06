from abc import ABC, abstractmethod
from __future__ import annotations

class Attack(ABC):

    @abstractmethod
    def performAttack() -> str:
        pass

    @abstractmethod
    def getDamage() -> int:
        pass
