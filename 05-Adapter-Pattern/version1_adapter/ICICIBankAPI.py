class ICICIBankAPI:
    def balance_check(self) -> int:
        print("Balance is being checked by ICICI Bank")
        return 50

    def money_transfer(self, amt: int, from_account: int, to_account: int) -> bool:
        print("Money is being transferred via ICICI BANK")
        return True
