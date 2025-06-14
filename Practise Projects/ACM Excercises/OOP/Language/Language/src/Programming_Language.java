public class Programming_Language extends Language {
    private String creator;
    private String platforms;
    private final String status = "Active";

    public Programming_Language(String name,UsageField usageField,String creator,String platforms){
        super(name,usageField);
            this.creator = creator;
            this.platforms = platforms;
    }
}
