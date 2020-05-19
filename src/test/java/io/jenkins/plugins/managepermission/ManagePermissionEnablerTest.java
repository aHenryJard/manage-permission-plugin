package io.jenkins.plugins.managepermission;

import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import jenkins.model.Jenkins;

import static org.junit.Assert.assertTrue;

public class ManagePermissionEnablerTest {

    @Rule
    public JenkinsRule j = new JenkinsRule();

    @Test
    public void testManagePermissionEnabled() {
        assertTrue(Jenkins.MANAGE.getEnabled());
    }
}
