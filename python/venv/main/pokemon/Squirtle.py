from main.pokemon.PokemonCharacter import *
from main.pokemon.Splash import *
from main.pokemon.Tackle import *

#   Clase Pikachu
class Charmander(PokemonCharacter):
    def __init__(self):
        self.HIT_POINTS = 100
        self.DEFENSE_MULTIPLIER = 0.4
        self.splash = Splash()
        self.tackle = Tackle()
        self.setType("water")
        self.setName("Squirtle")
        self.setHasEvolution(true)
        self.setMainAttack(self.splash.doAttack())
        self.setSecondAttack(self.tackle.doAttack())
        self.setHitPoints(self.HIT_POINTS)
        self.setDefenseMultiplier(self.DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(self.splash.attackDMG())
        self.setSecondAttackDamage(self.tackle.attackDMG())

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

    def doMainAttack(self):
        attackMessage = "Attacking opponent with "
        attackMessage += self.getMainAttack()
        attackMessage += " causing a damage of "
        attackMessage += str(self.getMainAttackDamage())
        return attackMessage

    def doSecondAttack(self):
        attackMessage = "Attacking opponent with "
        attackMessage += self.getSecondAttack()
        attackMessage += " causing a damage of "
        attackMessage += str(self.getSecondAttackDamage())
        return attackMessage

    def setNewAttack(self, attack, attackDamage, newAttack):
        if (attack == 1):
            self.setMainAttack(newAttack)
            self.setMainAttackDamage(attackDamage)
        else:
            self.setSecondAttack(newAttack)
            self.setSecondAttackDamage(attackDamage)

