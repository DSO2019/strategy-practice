from PokemonCharacter import PokemonCharacter
from Psybeam import Psybeam
from Discharge import Discharge


class Porygon(PokemonCharacter):
    HIT_POINTS = 77
    DEFENSE_MULTIPLIER = 0.3
    MAIN_ATTACK_DAMAGE = 3
    SECOND_ATTACK_DAMAGE = 17

    def __init__(self):
        self.setType("normal")
        self.setName("Porygon")
        self.setHasEvolution(True)
        self.setSecondAttack(Psybeam())
        self.setMainAttack(Discharge())
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
