class FastTagRecharge:
    def recharge(self, amount, yes_bank_api):
        balance = yes_bank_api.get_balance()
        if balance < amount:
            print("Can't recharge, not enough money")
            return 0
        return 1
