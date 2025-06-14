public class Language {
    private String name;
    private UsageField usageField;
    
    public Language(String name, UsageField usageField){
    this.name=name;
    this.usageField=usageField;
    }

    public UsageField getUsageField() {return usageField;}
    public String getName() {return name;}

    @Override
    public String toString() {
    return "Language"+"Name"+getName();
    }
}
