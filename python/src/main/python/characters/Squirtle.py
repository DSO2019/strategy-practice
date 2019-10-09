from behaviors.attack.BigFireAttack import BigFireAttack
from behaviors.attack.SmallFireAttack import SmallFireAttack
from characters.PokemonCharacter import PokemonCharacter


class Squirtle(PokemonCharacter):

    def __init__(self):
        self.HIT_POINTS = 77
        self.DEFENSE_MULTIPLIER = 0.3

        self.setType("agua")
        self.setName("Squirtle")
        self.setHasEvolution(True)
        self.setSecondAttack(BigFireAttack())
        self.setMainAttack(SmallFireAttack())
        self.setHitPoints(self.HIT_POINTS)
        self.setDefenseMultiplier(self.DEFENSE_MULTIPLIER)

    def evolve(self):
        return None

    def defend(self, attack):
        damage = (attack * self.getDefenseMultiplier())
        newHP = self.getHitPoints() - damage
        self.setHitPoints(newHP)
        string = "Defending attack, damage caused is "
        string += str(int(damage))
        string += " new HP is "
        string += str(int(newHP))
        return string

    def funSecondAttack(self):
        return self.getSecondAttack().attack()

    def funMainAttack(self):
        return self.getMainAttack().attack()

    def setNewAttack(self, attack, newAttack):
        if (attack == 1):
            self.setMainAttack(newAttack)
        else:
            self.setSecondAttack(newAttack)