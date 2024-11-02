from platform.Platform import Platform

if __name__ == '__main__':

    user_input = input("Enter 'android' for Android, or 'ios' for IOS: ").strip().lower()

    platform = Platform.create_platform(user_input)

    if platform is not None:
        component_factory = platform.create_ui_component_factory()
        button = component_factory.create_button()
        button.draw()
        platform.do_something()
    else:
        print("invalid platform")


