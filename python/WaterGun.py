class WaterGun:
    def __init__(self):
        self.damage = None
        self.name = 'Water Gun'

    def attackName(self):
        return self.name

    def attackDamage(self):
        return self.damage

    def setDamage(self, damage):
        self.damage = damage
