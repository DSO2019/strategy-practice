from __future__ import annotations
from abc import ABC, abstractmethod

from Attack import Attack

class PokemonCharacter(ABC):

    def __init__(self):
        self.__name = None
        
        self.__type = None

        self.__hasEvolution = False

        self.__mainAttack = None

        self.__secondAttack = None

        self.__defenseMultiplier = 0

        self.__hitPoints = 0


    def getName(self) -> str:
        return self.__name 


    def setName(self,newName: str):
        self.__name = newName

    @abstractmethod
    def evolve(self) -> str:
        pass

    @abstractmethod
    def defend(self,attackDamage: int) -> str:
        pass

    @abstractmethod
    def secondAttack(self) -> str:
        pass

    @abstractmethod
    def mainAttack(self) -> str:
        pass

    @abstractmethod
    def setNewAttack(self,attack: int, newAttack: Attack):
        pass

    def getType(self) -> str:
        return self.__type

    def setType(self,newType: str):
        self.__type = newType

    def isHasEvolution(self) -> bool:
        return self.__hasEvolution

    def setHasEvolution(self,evolution):
        self.__hasEvolution = evolution

    def getMainAttack(self) -> str:
        return self.__mainAttack.performAttack()

    def setMainAttack(self,newMainAttack):
        self.__mainAttack = newMainAttack

    def getSecondAttack(self) -> str:
        return self.__secondAttack.performAttack()

    def setSecondAttack(self,newSecondAttack):
        self.__secondAttack = newSecondAttack

    def getMainAttackDamage(self) -> int:
        return self.__mainAttack.getDamage()

    def getSecondAttackDamage(self) -> int:
        return self.__secondAttack.getDamage()

    def getDefenseMultiplier(self) -> float:
        return self.__defenseMultiplier

    def setDefenseMultiplier(self,newDefenseMultiplier):
        self.__defenseMultiplier = newDefenseMultiplier

    def getHitPoints(self) ->  int:
        return self.__hitPoints

    def setHitPoints(self,newHitPoints):
        self.__hitPoints = newHitPoints 




