package org.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "rectangle")
public class Rectangle extends AbstractMojo {

    @Parameter(property = "a", defaultValue = "1")
    private float a;
    @Parameter(property = "b", defaultValue = "1")
    private float b;

    public void execute() throws MojoExecutionException, MojoFailureException {
        float res = a * b;
        System.out.println("Area rectangle = " + res);

        double rectanglePerimiter = (2 * a) + (2 * b);
        System.out.println("Rectangle perimiter = " + rectanglePerimiter);
    }
}
