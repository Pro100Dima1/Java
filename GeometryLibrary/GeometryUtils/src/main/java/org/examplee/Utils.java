package org.examplee;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "utils")
public class Utils extends AbstractMojo {
    @Parameter(property = "a", defaultValue = "1")
    private float a;
    @Parameter(property = "b", defaultValue = "1")
    private float b;

    public void execute() throws MojoExecutionException, MojoFailureException {
        if(a < b){
            getLog().info("a < b");
        }
    }
}