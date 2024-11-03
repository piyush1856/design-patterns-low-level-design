from version1_adapter.BankAPI import BankApi
from version1_adapter.ICICIBankApiAdapter import ICICIBankAPIAdapter
from version1_adapter.YesBankApiAdapter import YesBankApiAdapter


class BankApiFactory:

    @staticmethod
    def get_bank_api_by_name(name: str) -> BankApi:
        if name == "yes":
            return YesBankApiAdapter()
        elif name == "icici":
            return ICICIBankAPIAdapter()
        else:
            return None
