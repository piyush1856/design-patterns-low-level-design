class FastTagRecharge:
    def recharge(self, amount, bank_api):
        balance = bank_api.check_balance()
        if balance < amount:
            print("Can't recharge, not enough money (1)")
            return 0
        return 1
