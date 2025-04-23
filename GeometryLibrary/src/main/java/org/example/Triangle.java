package org.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "triangle")
public class Triangle extends AbstractMojo {

    @Parameter(property = "a", defaultValue = "1")
    private float a;
    @Parameter(property = "b", defaultValue = "1")
    private float b;
    @Parameter(property = "c", defaultValue = "1")
    private float c;

    public void execute() throws MojoExecutionException, MojoFailureException {
        float res = (0.5f * (a * b));
        System.out.println("Area triangle = " + res);

        double trianglePerimiter = (a + b + c);
        System.out.println("Triangle perimiter = " + trianglePerimiter);

    }
}
