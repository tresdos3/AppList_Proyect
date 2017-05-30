package tresdos.com.applist;

import android.graphics.drawable.Drawable;

public class AppList {
    private String name;
    Drawable icon;
    private String appname;

    public AppList(String name, Drawable icon, String appname) {
        this.name = name;
        this.icon = icon;
        this.appname = appname;
    }

    public String getName() {
        return name;
    }

    public Drawable getIcon() {
        return icon;
    }
    public String getAppname(){
        return appname;
    }
}
