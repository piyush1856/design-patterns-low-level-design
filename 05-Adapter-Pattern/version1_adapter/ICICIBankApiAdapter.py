from version1_adapter.BankAPI import BankApi
from version1_adapter.ICICIBankAPI import ICICIBankAPI


class ICICIBankAPIAdapter(BankApi):
    def __init__(self):
        self.icici_bank_api = ICICIBankAPI()

    def check_balance(self) -> int:
        return self.icici_bank_api.balance_check()

    def transfer(self, amt: int, to: int) -> bool:
        return self.icici_bank_api.money_transfer(amt, 1, to)