from version0.FastTagRecharge import FastTagRecharge
from version0.PhonePeLoan import PhonePeLoan
from version0.YesBankApi import YesBankApi


class PhonePe:
    def __init__(self):
        self.fast_tag_recharge = FastTagRecharge()
        self.yes_bank_api = YesBankApi()
        self.phone_pe_loan = PhonePeLoan()

    def avail_loan(self, amount):
        response = self.phone_pe_loan.check_eligibility(amount, self.yes_bank_api)
        if response == 0:
            return False
        print("Loan successful")
        return True

    def recharge_fast_tag(self, amount):
        response = self.fast_tag_recharge.recharge(amount, self.yes_bank_api)
        if response == 1:
            print("Fast Tag successfully recharged")
            return True
        return False
