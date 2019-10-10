class FireFang:
    def __init__(self):
        self.damage = None
        self.name = 'Fire Fang'

    def attackName(self):
        return self.name

    def attackDamage(self):
        return self.damage

    def setDamage(self, damage):
        self.damage = damage
