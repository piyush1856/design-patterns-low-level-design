from version1_adapter.BankApiFactory import BankApiFactory
from version1_adapter.ICICIBankApiAdapter import ICICIBankAPIAdapter
from version1_adapter.PhonePe import PhonePe
from version1_adapter.YesBankApiAdapter import YesBankApiAdapter

if __name__ == '__main__':
    phone_pe = PhonePe(BankApiFactory.get_bank_api_by_name("yes"))
    phone_pe.avail_loan(100)
    phone_pe.recharge_fast_tag(50)

    print("_________________________________________________")
    phone_pe = PhonePe(BankApiFactory.get_bank_api_by_name("icici"))
    phone_pe.avail_loan(100)
    phone_pe.recharge_fast_tag(50)