from version1_adapter.BankAPI import BankApi
from version1_adapter.FastTagRecharge import FastTagRecharge
from version1_adapter.PhonePeLoan import PhonePeLoan

class PhonePe:
    def __init__(self, bank_api: BankApi):
        self.fast_tag_recharge = FastTagRecharge()
        self.bank_api = bank_api
        self.phone_pe_loan = PhonePeLoan()

    def avail_loan(self, amount):
        response = self.phone_pe_loan.check_eligibility(amount, self.bank_api)
        if response == 0:
            return False
        print("Loan successful(1)")
        return True

    def recharge_fast_tag(self, amount):
        response = self.fast_tag_recharge.recharge(amount, self.bank_api)
        if response == 1:
            print("Fast Tag successfully recharged(1)")
            return True
        return False
