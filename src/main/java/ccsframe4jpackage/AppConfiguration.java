package ccsframe4jpackage;

import cc.creamcookie.IAppConfig;
import cc.creamcookie.security.dto.Permission;

import java.util.ArrayList;
import java.util.List;

public class AppConfiguration implements IAppConfig {


    @Override
    public String getName() {
        return "ccsframe4jappname";
    }

    @Override
    public List<Permission> getSecurityRules() {
        List<Permission> permissions = new ArrayList<Permission>();
        permissions.add(new Permission("/admin", "ADMIN"));
        return permissions;
    }

}
