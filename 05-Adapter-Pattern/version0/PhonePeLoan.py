class PhonePeLoan:
    def check_eligibility(self, amount, yes_bank_api):
        balance = yes_bank_api.get_balance()
        if amount < balance * 0.2:
            return 1

        print("Not eligible to avail Loan")
        return 0