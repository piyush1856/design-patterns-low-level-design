from RegistryImpl import RegistryImpl
from User import User, UserType

if __name__ == '__main__':
    # Initialize the registry
    registry = RegistryImpl()

    # Create prototypes
    admin_user = User(user_id=1, user_name="AdminUser", user_type=UserType.ADMIN)
    sub_admin_user = User(user_id=2, user_name="SubAdminUser", user_type=UserType.SUB_ADMIN)
    oem_user = User(user_id=3, user_name="OEMUser", user_type=UserType.OEM)

    # Add prototypes to the registry
    registry.add_prototype(admin_user)
    registry.add_prototype(sub_admin_user)
    registry.add_prototype(oem_user)

    # Clone prototypes
    cloned_admin = registry.clone(UserType.ADMIN)
    cloned_sub_admin = registry.clone(UserType.SUB_ADMIN)
    cloned_oem = registry.clone(UserType.OEM)

    # Display cloned users
    print("Cloned Admin User:", cloned_admin)
    print("Cloned Sub Admin User:", cloned_sub_admin)
    print("Cloned OEM User:", cloned_oem)



