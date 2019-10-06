from abc import ABC, abstractmethod
from __future__ import annotations

class PokemonCharacter(ABC):
    def __init__(self):
        self.name = None
        self.type = None
        self.hasEvolution = False
        self._mainAttack = None
        self._secondAttack = None
        self.defenseMultiplier = 0
        self.hitPoints = 0

    def getName(self):
        return self.name 

    def setName(self,name):
        self.name = name

    def getType(self):
        return self.type

    def setType(self,type):
        self.type = type

    def getHasEvolution(self):
        return self.hasEvolution

    def setHasEvolution(self,evolution):
        self.hasEvolution = evolution
    
    def getMainAttack(self):
        return self._mainAttack.performAttack()

    def setMainAttack(self,mainAttack):
        self._mainAttack = mainAttack

    def getSecondAttack(self):
        return self._secondAttack.performAttack()

    def setSecondAttack(self,secondAttack):
        self._secondAttack = secondAttack

    @abstractmethod
    def evolve(self) -> str:
        pass

    @abstractmethod
    def defend(self,attackDamage: int) -> str:
        pass

    @abstractmethod
    def mainAttack(self) -> str:
        pass

    @abstractmethod
    def secondAttack(self) -> str:
        pass

    @abstractmethod
    def setNewAttack(self,attack: int, newAttack: Attack):
        pass  

    def getMainAttackDamage(self):
        return self._mainAttack.getDamage()

    def getSecondAttackDamage(self):
        return self._secondAttack.getDamage()

    def getDefenseMultiplier(self):
        return self.defenseMultiplier

    def setDefenseMultiplier(self,defenseMultiplier):
        self.defenseMultiplier = defenseMultiplier

    def getHitPoints(self):
        return self.hitPoints

    def setHitPoints(self,hitPoints):
        self.hitPoints = hitPoints 