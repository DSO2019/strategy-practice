from PokemonCharacter import PokemonCharacter
from ShadowPunch import ShadowPunch
from Hex import Hex


class Gengar(PokemonCharacter):
    HIT_POINTS = 58
    DEFENSE_MULTIPLIER = 0.5
    MAIN_ATTACK_DAMAGE = 4
    SECOND_ATTACK_DAMAGE = 12

    def __init__(self):
        self.setType("venom, phantom")
        self.setName("Gengar")
        self.setHasEvolution(True)
        self.setSecondAttack(ShadowPunch())
        self.setMainAttack(Hex())
        self.setHitPoints(HIT_POINTS)
        self.setDefenseMultiplier(DEFENSE_MULTIPLIER)
        self.setMainAttackDamage(MAIN_ATTACK_DAMAGE)
        self.setSecondAttackDamage(SECOND_ATTACK_DAMAGE)

    def evolve(self):
        return "Null"

    def defend(self, attack):
        int damage = attack * self.getDefenseMultiplier()
        newHP = self.getHitPoints() - damage
        deffendMessage = 'Defending attack, damage caused is ' + damage +
        ' new HP is ' + newHP
        return deffendMessage

    def secondAttack(self):
        attackMessage = 'Attacking opponent with ' + self.getSecondAttack() +
        ' causing a damage of ' + self.getSecondAttackDamage()
        return attackMessage

    def secondAttack(self):
        attackMessage = 'Attacking opponent with ' + self.getMainAttack() +
        ' causing a damage of ' + self.getMainAttackDamage()
        return attackMessage

    def setNewAttack(self, attack, attackDamage, newAttack):
        if (attack == 1):
            self.setMainAttack(newAttack)
            self.setMainAttackDamage(attackDamage)
        else:
            self.setSecondAttack(newAttack)
            self.setSecondAttackDamage(attackDamage)
