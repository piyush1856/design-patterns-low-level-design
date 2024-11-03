from version1_adapter.BankAPI import BankApi
from version1_adapter.YesBankApi import YesBankApi


class YesBankApiAdapter(BankApi):

    def __init__(self):
        self.yes_bank_api = YesBankApi()

    def check_balance(self) -> int:
        return self.yes_bank_api.get_balance()

    def transfer(self, amt: int, to: int) -> bool:
        current_user = 100

        try:
            self.yes_bank_api.transfer_money(amt, current_user, to)
        except Exception as e:
            print(f"An error occurred during the transfer: {e}")
            return False

        return True