package io.jenkins.plugins.managepermission;

import org.kohsuke.accmod.Restricted;
import org.kohsuke.accmod.restrictions.NoExternalUse;

import hudson.Extension;
import hudson.init.InitMilestone;
import hudson.init.Initializer;
import jenkins.model.Jenkins;

@Extension
@Restricted(NoExternalUse.class)
public class ManagePermissionEnabler {

    @Initializer(after = InitMilestone.PLUGINS_STARTED)
    public static void enableManagePermission() {
        if (System.getProperty("jenkins.security.ManagePermission") == null) {
            Jenkins.MANAGE.setEnabled(true);
        }
    }

}
