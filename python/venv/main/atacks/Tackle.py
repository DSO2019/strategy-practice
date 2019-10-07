class Tackle:

    # Constructor para ataques
    def __init__(self, ATTACK_DMG=6, ATTACKNAME="Tackle", AttDmg=none):
        self.ATTACK_DMG = ATTACK_DMG
        self.ATTACKNAME = ATTACKNAME
        self.AttDmg = AttDmg

    def doAttack(self):
        return self.ATTACKNAME

    def getAttackDMG(self):
        return self.AttDmg

    def setAttackDMG(self, arg):
        self.AttDmg = arg