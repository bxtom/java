import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpFinder {
    private String string;
    private Pattern ipPattern = Pattern.compile("\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b");

    public IpFinder(String string) {
        this.string = string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean hasIp() {
        Matcher matcher = ipPattern.matcher(this.string);
        return matcher.find();
    }

    public String getIp() {
        Matcher matcher = ipPattern.matcher(this.string);
        if(matcher.find()) {
            return matcher.group();
        } else return null;
    }
}
