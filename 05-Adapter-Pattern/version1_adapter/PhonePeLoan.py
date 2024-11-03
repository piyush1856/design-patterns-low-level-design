class PhonePeLoan:
    def check_eligibility(self, amount, bank_api):
        balance = bank_api.check_balance()
        if amount < balance * 0.2:
            return 1

        print("Not eligible to avail Loan(1)")
        return 0