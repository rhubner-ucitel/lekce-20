package cz.robotdreams.java.lekce20;

public class StaticFactoryMethodExample {

    private final String internalName;

    private StaticFactoryMethodExample(String internalName) {
        // super( predani parametru   )
        this.internalName = internalName;
    }

    public String getInternalName() {
        return internalName;
    }

    public static StaticFactoryMethodExample create(String internalName) throws IllegalArgumentException {
        if(internalName == null || internalName.length() < 9 || internalName.length() > 100) {
            throw new IllegalArgumentException("Invalid internal name");
        }
        if("SuperTrida".equals(internalName)) {
            return new StaticFactoryMethodExample("SuperTrida") {
                @Override
                public String toString() {
                    return "This class is king \uD83E\uDEC5 , and it's better than others \uD83D\uDC51";
                }
            };
        }
        return new StaticFactoryMethodExample(internalName);
    }

}
