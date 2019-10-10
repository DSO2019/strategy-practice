class ShadowPunch:
    def __init__(self):
        self.damage = None
        self.name = 'Shadow Punch'

    def attackName(self):
        return self.name

    def attackDamage(self):
        return self.damage

    def setDamage(self, damage):
        self.damage = damage
