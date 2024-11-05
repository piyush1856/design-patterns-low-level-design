package org.example.factory;

public class Flutter {

    public void setTheme(){
        System.out.println("Setting theme");
    }

    public void changeRefreshRate(){
        System.out.println("Changing refresh rate");
    }

    public UiFactory createUiFactory(String platform){
//            if(platform.equals("Android"))
//                return new AndroidUiFactory();
//            if(platform.equals("iOS"))
//                return new IosUiFactory();
//            return null;
        return UiFactoryFactory.createUiFactory(platform);
    }
}
